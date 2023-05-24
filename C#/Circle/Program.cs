public class Program
{
    static void Main(string[] args)
    {
        Cirle c = new Cirle(2.45, "red", 23);
        Console.WriteLine("Circle before change : " + c.ToString());

        c.PColor = "blue";
        c.PWeight = 2.56;

        Console.WriteLine("Circle after change : " + c.ToString());

        Console.WriteLine("------------------");
        Console.WriteLine(c.findArea());
        Console.WriteLine(c.findPerimeter());

        Console.ReadLine();
    }
}