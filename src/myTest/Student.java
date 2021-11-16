package myTest;

public class Student
{

    private int id;
    String name;
    String surename;
    int year_study;
    double avr_math;
    double avr_eco;
    double avr_lang;

    Student(int id2, String name2,String surename2, int year_study2, double avr_math2, double avr_eco2, double avr_lang2)
    {
        id = id2;
        name = name2;
        surename = surename2;
        year_study = year_study2;
        avr_math = avr_math2;
        avr_eco = avr_eco2;
        avr_lang = avr_lang2;
    }

    void GetAvr(double one, double two, double tree)
    {
        double ans = (one+two+tree)/3;
        System.out.print(ans);
    }

    void X2(double var)
    {
        double ans = var*2;
        System.out.print(ans);
    }

    void X3()
    {
        avr_math*=2;
    }

}
    class StudentTest
    {
        public static void main(String[] args)
        {
            Student one = new Student(0,"Danya","Fomin",4,3.3,2,3.3);
            //Student one = new Student();
            //one.id = 0;
            //one.name = "Джон";
            //one.surename = "Энгельс";
            //one.year_study = 2;
            //one.avr_math = 4.4;
            //one.avr_eco = 3.333;
            //one.avr_lang = 4.7895;

            //System.out.print(one.name);
            // one.GetAvr(one.avr_lang,one.avr_math, one.avr_eco);
            //one.X2(one.avr_eco);

            //one.X3();
            System.out.print(one.name);
        }
    }