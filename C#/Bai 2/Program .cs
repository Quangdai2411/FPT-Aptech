namespace bt2
{
    class GameItem
    {
        protected string Name;
        protected int Level;
        protected int Score;


        public GameItem()
        {
        }

        public void Infor()
        {
            Console.Write("Enter name: ");
            Name = Console.ReadLine();
            Console.Write("Enter level: ");
            Level = Convert.ToInt32(Console.ReadLine());
            Console.Write("Enter Score: ");
            Score = Convert.ToInt32(Console.ReadLine());
        }

        public virtual String ToString()
        {
            return "Name is: " + Name + "\nLever is: " + Level + "\nScore is: " + Score;
        }
    }

    class Weapon : GameItem
    {
        protected string WeaponName;
        protected int Dame;

        public Weapon()
        {
        }
        public void InputDame()
        {
            Console.Write("Enter Weapon : ");
            WeaponName = Console.ReadLine();
            Console.Write("Enter Dame: ");
            Dame = Convert.ToInt32(Console.ReadLine());

        }

        public override String ToString()
        {
            return "Name is: " + Name + "\nLever is: " + Level + "\nScore is: " + Score + "\nWeapon : " + WeaponName +"\nDame is: "+Dame;
        }
    }

    class Amor : GameItem
    {
        protected string AmorName;
        protected int Hp;

        public Amor()
        {
        }

        public void InputAmor()
        {
            Console.Write("Enter Amor : ");
            AmorName = Console.ReadLine();
            Console.Write("Enter Hp: ");
            Hp = Convert.ToInt32(Console.ReadLine());
        }

        public override String ToString()
        {
            return "Name is: " + Name + "\nLever is: " + Level + "\nScore is: " + Score+ "\nAmor : "+ AmorName +"\nHp is: "+ Hp;

        }
    }

    class Consumable : GameItem
    {
        protected string NameItem;
        protected string Action;

        public Consumable()
        {
        }

        public void InputItem()
        {
            Console.Write("Enter Item : ");
            NameItem = Console.ReadLine();
            Console.Write("Enter Action :");
            Action = Console.ReadLine();
        }

        public override string ToString()
        {
            return "Name is: " + Name + "\nLever is: " + Level + "\nScore is: " + Score+"\nNameItem is: " + NameItem + "\nAction : " + Action;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Weapon w = new Weapon();
            Amor a = new Amor();
            Consumable c = new Consumable();

            w.Infor();
            w.InputDame();
            Console.WriteLine("-----------");
            Console.WriteLine(w.ToString());

            Console.WriteLine("===");
            a.Infor();
            a.InputAmor();
            Console.WriteLine("------------");
            Console.WriteLine(a.ToString());

            Console.WriteLine("===");
            c.Infor();
            c.InputItem();
            Console.WriteLine("------------");
            Console.WriteLine(c.ToString());
        }
    }
}