using System;
class Program
{
    public static void Main(String[] args)
    {
        Atomic at = new Atomic();
        int i = 0;
        System.Console.WriteLine("Atomic Information");
        System.Console.WriteLine("==================");
        do
        {
            i++;
            at.accept();
        } while (i != 3);
        System.Console.WriteLine("No Sym Name Weight");
        System.Console.WriteLine("-----------------------------");
        at.display();


    } 
}