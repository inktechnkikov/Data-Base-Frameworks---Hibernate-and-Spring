using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TimeSinceBirthDay
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Years - ");
            byte years = byte.Parse(Console.ReadLine());
            double days = years * 365;
            double hours = days * 24;
            double minutes = hours * 60;
            Console.WriteLine("{0} years = {1} days = {2} hours = {3} minutes.",years,days,hours,minutes);
        }
    }
}
