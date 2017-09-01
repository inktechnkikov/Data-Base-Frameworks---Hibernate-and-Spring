using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EntityFrameworkExercise
{
    class EntityFramwerkExercise
    {
        static void Main()
        {
            //ListAllPosts();
            //ListAllUsers();
            //ListTitleBodyFromPosts();
            // OrderData();
            //OrderByTwoColumns();
            // SelectAuthors();
            JoinsAuthorsWithtitles();


        }
        public static void ListAllPosts()
        {
            BlogDBContext blogDB = new BlogDBContext();
            List<Post> posts = blogDB.Posts.Select(post => post).ToList();
            foreach(Post p in posts)
            {
                Console.WriteLine("Title: {0}",p.Title);
                Console.WriteLine("Author: {0}",p.AuthorId);
                Console.WriteLine("Comments Count: {0}",p.Comments.Count);
                Console.WriteLine("Tags Count: {0}",p.Tags.Count);
                Console.WriteLine();
            }
        }
        public static void ListAllUsers()
        {
            BlogDBContext blogDB = new BlogDBContext();
            List<User> users = blogDB.Users.Select(user => user).ToList();
            foreach(User u in users)
            {
                Console.WriteLine("ID {0}:",u.Id);
                Console.WriteLine("Name {0}:",u.FullName);
                Console.WriteLine("Comments Count: {0}",u.Comments.Count);
                Console.WriteLine("Posts Count: {0}",u.Posts.Count);
            }
        }
        public static void ListTitleBodyFromPosts()
        {
            BlogDBContext blogDB = new BlogDBContext();
            var posts = blogDB.Posts.Select(post => new
            {
                post.Title,
                post.Body
            }
            ).ToList();
            foreach(var p in posts)
            {
                Console.WriteLine("Title: {0}",p.Title);
                Console.WriteLine("Content: {0}",p.Body);
                Console.WriteLine();
            }
        }
        public static void OrderData()
        {
            BlogDBContext blogDB = new BlogDBContext();
            var users = blogDB.Users.Select(user => new
            {
                user.UserName,
                user.FullName
            }).OrderBy(user => user.UserName).ToList();
            foreach(var user in users)
            {
                Console.WriteLine("Username: {0}",user.UserName);
                Console.WriteLine("Full Name: {0}",user.FullName);
                Console.WriteLine();
            }

        }
        public static void OrderByTwoColumns()
        {
            BlogDBContext blogDB = new BlogDBContext();
            var users = blogDB.Users.Select(user => new
            {
                user.UserName,
                user.FullName
            }).OrderByDescending(user => user.UserName)
                .ThenByDescending(user => user.FullName).ToList();
            foreach(var u in users)
            {
                Console.WriteLine("Username: {0}",u.UserName);
                Console.WriteLine("Full Name: {0}",u.FullName);
                Console.WriteLine();
            }
        }
        public static void SelectAuthors()
        {
            BlogDBContext blogDB = new BlogDBContext();
            List<User> users = blogDB.Users.Select(user => user).Where(user => user.Posts.Count > 0).ToList();
            foreach(User user in users)
            {
                Console.WriteLine("Username: {0}",user.UserName);
                Console.WriteLine("Full Name: {0}",user.FullName);
                Console.WriteLine("Post count: {0}",user.Posts.Count);
                Console.WriteLine();
            }
        }
        public static void JoinsAuthorsWithtitles()
        {
            BlogDBContext blogDB = new BlogDBContext();
            var users = blogDB.Users.SelectMany(user => user.Posts, (user, post) => new { user.UserName, post.Title });
            foreach(var user in users)
            {
                Console.WriteLine("Username: {0}",user.UserName);
                Console.WriteLine("Post Title: {0}",user.Title);
                Console.WriteLine();
            }
        }
    }
}
