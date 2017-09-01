using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BankRecipt
{
    class BankRecept
    {
        static void Main(string[] args)
        {
            PrintReceipt();
        }
        static void PrintHeader()
        {
            Console.WriteLine("Cash receipt");
            Console.WriteLine("----------------------");
        }
        public static void PrintBody()
        {
            Console.WriteLine("Charge to_____________");
            Console.WriteLine("_______________");
        }
        public static void PrintFooter()
        {
            Console.WriteLine("SoftUnu");
        }
        public static void PrintReceipt()
        {
            PrintHeader();
            PrintBody();
            PrintFooter();
        }
    }
}
