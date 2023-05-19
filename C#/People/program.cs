class program
{
    static void Main(string[] args)
    {
        Console.WriteLine("1. Staff\n2. Student");
        Console.Write("Enter options : ");
        int a = Convert.ToInt32(Console.ReadLine());

        switch (a)
        {
            case 1:
                Manager m = new Manager();
                m.people();
                m.Salary();
                m.Level();
                Console.WriteLine("------------");
                m.displayPeople();
                m.displaySalary();
                m.displayLevel();
                break;
            case 2:
                GoldStudent g = new GoldStudent();
                g.people();
                g.GPAs();
                g.Bonus();
                Console.WriteLine("-------------");
                g.displayPeople();
                g.displayGPA();
                g.displayBonus();
                break;
        }
    }
}
