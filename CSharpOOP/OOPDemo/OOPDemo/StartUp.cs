using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPDemo
{
    class StartUp
    {
        static void Main(string[] args)
        {
            Dice dice = new Dice(6,"White");
            Console.WriteLine(dice.getDice());
        }
    }
}
