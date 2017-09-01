using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace WebApplExample.Controllers
{
    public class FilesController : Controller
    {
        // GET: Files
        public ActionResult GetFiles(string path = @"C:\")
        {
            path = Path.GetFullPath(path);
            List<string> all = new List<string>();
            all.AddRange(Directory.GetFiles(path));
            all.AddRange(Directory.GetDirectories(path));
            ViewBag.ParentFolder = path + @"\..\";
            return View(all);
        }
    }
}