using System;
public class Catetory
{
    string _category;

    public Catetory()
    {
        _category = "MultiUtilityVehicle";
    }

    public void Display()
    {
        Console.WriteLine("Category : " + _category);
    }
}