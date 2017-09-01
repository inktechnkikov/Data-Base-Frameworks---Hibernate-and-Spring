using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GetSquare
{
    class GetSquare
    {
        static void Main(string[] args)
        {
            double num = 4;
            Console.WriteLine(GetSquareinfo(num));
        }
        public static double GetSquareinfo(double num)
        {
             double result = num * num;
             return result;
        }
    }
}
