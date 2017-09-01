using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace WebApplExample.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult About()
        {
            ViewBag.Message = "This is description for application page";

            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "inktechLTD contact page";

            return View();
        }
        public ActionResult Numbers()
        {
            return View();
        }
        public ActionResult Persons()
        {
            string[] pers = { "Peshko", "Maria", "Stamat","Sahil Jai" };
            return View(pers);
        }
    }
}