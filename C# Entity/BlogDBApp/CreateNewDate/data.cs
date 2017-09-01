using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CreateNewDate
{
    class data
    {
        static void Main()
        {
             CreatePost();
             CreateNewUser();
            CascadeInsert();
        }
        public static void CreatePost()
        {
            var db = new CreateData();
            var post = new Post()
            {
                Body = "New post has been created",
                Title = "This is another post post",
                Date = DateTime.Now
            };
            db.Posts.Add(post);
            db.SaveChanges();
            Console.WriteLine("Post #{0} created",post.ID);
        }
        public static void CreateNewUser()
        {
            var db = new CreateData();
            var user = new User()
            {
                Username = "Stamat",
                FullName = "Stamat Sparow"
            };
            db.Users.Add(user);
            db.SaveChanges();
            Console.WriteLine("User {0} was created",user.FullName);
        }
        public static void CascadeInsert()
        {
            var db = new CreateData();
            var post = new Post()
            {
                Title = "New post title",
                Date = DateTime.Now,
                Body = "This post have comments and tags",
                User = db.Users.First(),
                Comments = new Comment[]
                {
                    new Comment() {Text = "First Comment",Date = DateTime.Now },
                    new Comment() {Text = "Second Comment",Date = DateTime.Now,
                    User = db.Users.First()} },Tags = db.Tags.Take(3).ToList()
            };
            db.Posts.Add(post);
            db.SaveChanges();
        }
    }
}
