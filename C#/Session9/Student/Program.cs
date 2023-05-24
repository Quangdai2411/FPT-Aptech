class Students
{
    string[] _name = { "James", "John", "Alexander" };
    static void Main(string[] args)
    {
        Students objStudents = new Students();
        try
        {
            objStudents._name[4] = "Michael";
        }catch(Exception objException)
        {
            Console.WriteLine("Error : " + objException);
        }
    }
}