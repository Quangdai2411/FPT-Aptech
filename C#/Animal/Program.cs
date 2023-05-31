// See https://aka.ms/new-console-template for more information
using Animal;
namespace Animal
{
    class Program
    {
        static void Main(string[] args)
        {
            Tiger t = new Tiger();
            Lion l = new Lion();

            t.SetMe("Tiger", 100);
            t.Show();

            l.SetMe("Lion", 200);
            l.Show();
        }
    }
}
