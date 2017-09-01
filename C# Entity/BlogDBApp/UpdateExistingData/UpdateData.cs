using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UpdateExistingData
{
    class UpdateData
    {
        static void Main()
        {
            UpdateUserInfo();
        }
        public static void UpdateUserInfo()
        {
            var db = new UpdateDataCRUD();
            var userUpdate = db.Users.Where(u => u.Username == "peter").FirstOrDefault();
            userUpdate.PasswordHash = new byte[] { 1, 2, 3, 4 };
            userUpdate.Username = "Hityr";
            userUpdate.FullName = "Peter";
            db.SaveChanges();
           
        }
    }
}
