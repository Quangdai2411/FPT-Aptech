class People
{
    private int ID;
    private string Name;
    private string email;
    

    public void people()
    {
        Console.Write("Enter ID : ");
        ID = Convert.ToInt32(Console.ReadLine());
        Console.Write("Enter Name : ");
        Name = Console.ReadLine();
        Console.Write("Enter email : ");
        email = Console.ReadLine();
    }

    public void displayPeople()
    {
        Console.WriteLine("ID is " + ID);
        Console.WriteLine("Name is " +  Name);
        Console.WriteLine("Email is " + email);
    }
}

class Staff : People
{
    private double salary;

    public void Salary()
    {
        Console.Write("Enter salary : ");
        salary = Convert.ToDouble(Console.ReadLine());
    }

    public void displaySalary()
    {
        Console.WriteLine("Salary is " +  salary);
    }
}

class Manager : Staff

{
    private string level;

    public void Level()
    {
        Console.Write("Enter level : ");
        level = Console.ReadLine();
    }

    public void displayLevel()
    {
        Console.WriteLine("Level is " + level);
    }

}
