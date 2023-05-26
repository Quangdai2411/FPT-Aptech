namespace Bai1
{
    class LibraryItem
    {
        protected string Title;
        protected string Author;
        protected int PublicationYear;

        public LibraryItem(string title, string author, int publicationYear)
        {
            Title = title;
            Author = author;
            PublicationYear = publicationYear;
        }

        public LibraryItem()
        {
        }

        public void Input()
        {
            Console.Write("Enter title: ");
            Title = Console.ReadLine();
            Console.Write("Enter Author: ");
            Author = Console.ReadLine();
            Console.Write("Enter PublicationYear: ");
            PublicationYear = Convert.ToInt32(Console.ReadLine());
        }

        public virtual String ToString()
        {
            return "Title is: " + Title + "\nAuthor is: " + Author + "\nPublicationYear is: " + PublicationYear;
        }
    }

    class Book : LibraryItem
    {
        protected int PageNumbers;

        public Book()
        {
        }
        public void InputPage()
        {
            Console.Write("Enter PageNumber : ");
            PageNumbers = Convert.ToInt32(Console.ReadLine());

        }

        public override String ToString()
        {
            return "Title is: " + Title + "\nAuthor is: " + Author + "\nPublicationYear is: " + PublicationYear+ "\nPageNumbers is: "+PageNumbers;
        }
    }

    class Magazine : LibraryItem
    {
        protected string Id;

        public Magazine()
        {
        }

        public void InputId()
        {
            Console.WriteLine("Enter ID : ");
            Id = Console.ReadLine();
        }

        public override String ToString()
        {
            return "Title is: " + Title + "\nAuthor is: " + Author + "\nPublicationYear is: " + PublicationYear + "\nId is: " + Id;

        }
    }
    
    class DVD : LibraryItem
    {
        protected string Category;

        public DVD()
        {
        }

        public void InputCatogery()
        {
            Console.WriteLine("Enter Category : ");
            Category = Console.ReadLine();
        }

        public override string ToString()
        {
            return "Title is: " + Title + "\nAuthor is: " + Author + "\nPublicationYear is: " + PublicationYear + "\nCategory is: " + Category;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Book b = new Book();
            Magazine m = new Magazine();
            DVD d = new DVD();
            b.Input();
            b.InputPage();
            Console.WriteLine("-----------------");
            Console.WriteLine(b.ToString());
            Console.WriteLine("===");

            m.Input();
            m.InputId();
            Console.WriteLine("-----------------");
            Console.WriteLine(m.ToString());
            Console.WriteLine("===");

            d.Input();
            d.InputCatogery();
            Console.WriteLine("-----------------");
            Console.WriteLine(d.ToString());
        }
    }
}