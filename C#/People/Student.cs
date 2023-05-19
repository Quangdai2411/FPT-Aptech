class Student : People
{
    private double GPA;
    public void GPAs()
    {
        Console.Write("GPA : ");
        GPA = Convert.ToDouble(Console.ReadLine());
    }

    public void displayGPA()
    {
        Console.WriteLine("GPA is " +  GPA);
    }
}

class GoldStudent : Student
{
    private double bonus;

    public void Bonus()
    {
        Console.Write("Bonus : ");
        bonus = Convert.ToDouble(Console.ReadLine());
    }

    public void displayBonus()
    {
        Console.WriteLine("Bonus is " +  bonus);
    }
}
