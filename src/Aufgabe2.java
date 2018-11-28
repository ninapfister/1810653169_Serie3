
public class Aufgabe2
{
    public static void main (String[]args)
    {
        for (int i =0; i<5;i++)
        {
            printName();
            printAge(21+i);
        }
    }

    public static void printName()
    {
        System.out.println("Nina");
    }

    public static void printAge(int age)
    {
        System.out.println(age);
    }
}

