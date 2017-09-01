using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrintStudent
{
    class PrintStudent
    {
        static void Main(string[] args)
        {
            PrintStudentInfo("Stamat", 25, 5.2);
           
        }
        public static void PrintStudentInfo(string name,int age,double grade)
        {
            Console.WriteLine("Student name - {0}, Student age - {1}, Student grade - {2}",name,age,grade);
        }
    }
}
