using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BlogDBApp
{
    class BlogDBApp
    {
        static void Main(string[] args)
        {
           
            ShowPosts();
            Console.WriteLine();
            ShowPostsAndComments();
            Console.WriteLine();
            ShowQuery();
        }

        public static void ShowPosts()
        {
             var db = new BlogDBContex();
            foreach (var p in db.Posts)
            {
                Console.WriteLine(p.ID + " " + p.Title);
            }
        }
        public static void ShowPostsAndComments()
        {
            var db = new BlogDBContex();
           foreach(var posts in db.Posts)
            {
                Console.WriteLine(posts.ID + " " + posts.Title);
                foreach(var comment in posts.Comments)
                {
                    Console.WriteLine("\t{0}",comment.Text);
                }
            }
        }
        public static void ShowQuery()
        {
            var db = new BlogDBContex();
            var posts = db.Posts.Select(p => new { p.ID, p.Title, Comments = p.Comments.Count(), Tag = p.Tags.Count() });
            Console.WriteLine("SQL query:\n{0}\n",posts);
            foreach(var p in posts)
            {
                Console.WriteLine($"{p.ID} {p.Title} ({p.Comments} comments, {p.Tag} tags)");
            }
        }
       
    }
}
