using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace Hopstital
{
    class DoctorTable
    {
        public Hashtable objDoctorDetails = new Hashtable();

        public void AcceptDetails()
        {
            string name;
            string address;
           
            char choice = 'Y';

            try
            {
                do
                {                 
                    Console.Write("Enter the doctor's name : ");
                    name = Console.ReadLine();
                    Console.Write("Enter the address : ");
                    address = Console.ReadLine();
                    objDoctorDetails.Add(name, address);
                    Console.Write("Do you want to add more records? [Y/n] : ");
                    choice = Convert.ToChar(Console.ReadLine());

                } while (choice == 'Y' || choice == 'y');
            }catch(Exception objEx)
            {
                Console.WriteLine("Error : " + objEx.Message);
            }
        }

        public void DisplayDetails()
        {
            ICollection objCollection = objDoctorDetails.Keys;

            Console.WriteLine("\nDetails of doctor : ");
            Console.WriteLine("Doctor's name \t Address");
            Console.WriteLine("------------- \t -------");
            
            foreach(string details in objCollection)
            {
                Console.WriteLine(details + "\t\t" + objDoctorDetails[details]);
            }

            Console.WriteLine("Total number of doctors : " + objDoctorDetails.Count);
        }

        public bool Remove()
        {
            Console.Write("Enter the name of the doctor : ");
            string choice = Console.ReadLine();

            if (objDoctorDetails.ContainsKey(choice))
            {
                objDoctorDetails.Remove(choice);
                return true;
            }
            else
                return false;
        }

        public void Search()
        {
            Console.Write("Enter the name of the doctor : ");
            string choice = Console.ReadLine();

            if(choice != "")
            {
                if(objDoctorDetails.Contains(choice))
                {
                    Console.WriteLine("Record Found!");
                    Console.WriteLine("Doctor's Name : " + choice);

                    Console.WriteLine("Address : " + objDoctorDetails[choice]);
                }
                else
                    Console.WriteLine("Record Not Found!");
            }
            else
            {
                Console.WriteLine("Invalid Input");
            }
        }

        public bool Update()
        {
            Console.Write("Nhap bac si muon sua : ");
            string choice = Console.ReadLine();

            if (objDoctorDetails.ContainsKey(choice))
            {
                Console.Write("Sua dia chi thanh : ");
                string b = Console.ReadLine();

                objDoctorDetails[choice] = b;
                return true;
            }else
                return false;
            
        }
    }
}
