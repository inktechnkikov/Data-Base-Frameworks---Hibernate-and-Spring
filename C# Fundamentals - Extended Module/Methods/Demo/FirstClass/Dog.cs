using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FirstClass
{
    class Dog
    {
        private string name;
        private int age;

        public Dog(string name, int age)
        {
            this.name = name;
            this.age = age;
        }
       
        public void PrintInfo()
        {
            Console.WriteLine("Name - {0} Age - {1}",this.name,this.age);
        }
    }
}
