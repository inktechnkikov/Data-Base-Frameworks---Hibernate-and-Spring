using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPDemo
{
   public class Dice
    {
        private int Sizes { get; set; }
        private string color;

        public Dice(int Sizes,string color)
        {
            this.Sizes = Sizes;
            this.color = color;
        }
        public String getDice()
        {
            return "Sizes " + Sizes + " Color " + color;
        }
    }
}
