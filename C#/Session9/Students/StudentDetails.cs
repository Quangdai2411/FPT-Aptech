using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Students
{
    internal class StudentDetails
    {
        public StudentDetails
        {
            string _stuName = "Alexander";
            int _stuId = 30;

            public void studentDetails()
            {
                Console.WriteLine("Student Name : " + _stuName);
                Console.WriteLine("Student ID : " + _stuId);
            }

        }
    }

        class ScoreReport
        {
            public string Subject = "Science";
            public int Marks = 60;

            static void Main(string[] args)
            {
                Students.StudentDetails objStudents = new Students;
                StudentDetails();    

                ScoreReport scoObj = new ScoreReport();
                Console.WriteLine("Subject : " + scoObj.Subject);
                Console.WriteLine("Marks : " + scoObj.Marks);
            }
        }
    
}
