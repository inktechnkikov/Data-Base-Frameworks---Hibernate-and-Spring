using System;

namespace Demo
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int i = 0; i < 10; i++)
            {
                PrintHeader();
            }
        }
        static void PrintHeader()
        {
            Console.WriteLine("Hello.This is method");
        }
    }
}
