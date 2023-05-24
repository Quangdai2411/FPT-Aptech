using System;

public class SpareParts
{
    string _spareName;

    public SpareParts()
    {
        _spareName = "Gear Box";
    }

    public void Display()
    {
        Console.WriteLine("SparePart Name : " + _spareName);
    }
}