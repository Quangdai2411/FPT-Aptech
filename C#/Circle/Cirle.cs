﻿public class Cirle : GeometricObject
{
    public double radius;
    public Cirle(double x)
    {
        this.radius = x;
    }

    public Cirle(double x, string c, double w) : base(c, w)
    {
        this.radius = x;
    }

    public override String ToString()
    {
        return "Circle has : radius is " + radius + ", color is " + PColor + ", weight is " + PWeight;
    }

    public override double findArea()
    {
        return Math.PI * radius * radius;
    }

    public override double findPerimeter()
    {
        return 2 * Math.PI * radius;
    }
}

