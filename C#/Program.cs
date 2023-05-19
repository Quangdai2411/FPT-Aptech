using System;
class Program
{
    public static void Main(String[] args)
    {
        Atomic at = new Atomic();
        int i = 0;
        int x;

        do
        {
            System.Console.Write("Enter Selection : ");
            x = Convert.ToInt32(System.Console.ReadLine());
            switch (x)
            {
                case 1:
                    System.Console.WriteLine("Atomic Information");
                    System.Console.WriteLine("==================");
                    at.accept();
                    break;
                case 2:
                    System.Console.WriteLine("------------------");
                    at.display();
                    break;
                default:
                    System.Console.WriteLine("Please re-enter");
                    break;
            }
        }while (x != 10);
    } 
}
