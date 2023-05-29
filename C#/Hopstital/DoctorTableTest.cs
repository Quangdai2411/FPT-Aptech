using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Hopstital
{
    class DoctorTableTest
    {
        static void Main(string[] args)
        {
            try
            {
                DoctorTable objDoctorTable = new DoctorTable();
                objDoctorTable.AcceptDetails();
                objDoctorTable.DisplayDetails();

                char input = 'Y';

                do
                {
                    Console.WriteLine("\nSelect one of the following options : ");
                    Console.WriteLine("1. Remove \n2. RemoveAll \n3. Search \n4. Update \n5. Exit");
                    Console.Write("Enter your choice : ");
                    int choice = Convert.ToInt32(Console.ReadLine());
                    switch (choice)
                    {
                        case 1:
                            if (objDoctorTable.Remove())
                            {
                                Console.WriteLine("\n----After Removing----");
                                objDoctorTable.DisplayDetails();
                            }
                            else
                            {
                                Console.WriteLine("Doctor with this name does not exist");
                            }
                            break;
                        case 2:
                            objDoctorTable.objDoctorDetails.Clear();
                            Console.WriteLine("\n----After removing all the doctors----");
                            Console.WriteLine("Total number of doctor : " + objDoctorTable.objDoctorDetails.Count);
                            return;
                        case 3:
                            objDoctorTable.Search();
                            break;
                        case 4:
                            objDoctorTable.Update();
                            objDoctorTable.DisplayDetails();
                            break;
                        case 5:
                            return;
                        default:
                            Console.WriteLine("Invalid Data Entry!");
                            break;
                    }
                }while (input == 'Y' || input == 'y');
            }catch (Exception objEx)
            {
                Console.WriteLine("Error ; " + objEx.Message);
            }
        }
    }
}
