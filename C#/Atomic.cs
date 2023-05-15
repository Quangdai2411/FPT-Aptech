using System.Collections;

class Atomic
{
    public int number;
    public string symbol;
    public string name;
    public double weight;


    public Atomic(int number, string symbol, string name, double weight)
    {
        this.number = number;
        this.symbol = symbol;
        this.name = name;
        this.weight = weight;
    }

    public Atomic()
    {
    }

    ArrayList arr = new ArrayList();

    public Boolean accept()
    {
        System.Console.Write("Enter atomic number : ");
        number = Convert.ToInt32(System.Console.ReadLine());
        System.Console.Write("Enter symbol : ");
        symbol = Console.ReadLine();
        System.Console.Write("Enter full name : ");
        name = Console.ReadLine();
        System.Console.Write("Enter atomic weight : ");
        weight = Convert.ToDouble(System.Console.ReadLine()); 

        Atomic atm = new Atomic(number, symbol, name, weight);
        arr.Add(atm);
        return true;
    }

    public void display()
    {
        foreach(Atomic at in arr)
        {
            System.Console.WriteLine(at.number + " " + at.symbol + " " + at.name + " " + at.weight);
        }
        arr.Clear();
    }
}

