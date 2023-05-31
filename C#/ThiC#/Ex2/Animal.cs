using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animal
{
    class Animal
    {
        protected string name;
        protected double weight;

        public Animal(string name, double weight)
        {
            this.name = name;
            this.weight = weight;
        }

        public Animal() { }

        public void Show()
        {
            Console.WriteLine("Name : {0}, Weight : {1}", name, weight);
        }

        public void SetMe(string name1, double weight1)
        {
            name = name1;
            weight = weight1;
        }
    }

    class Tiger : Animal
    {
        public Tiger()
        {
        }
    }

    class Lion : Animal
    {
        public Lion()
        {
        }
    }

}
