public class Aufruf
{
    public static void main (String[]args)
    {
        Vehicle myFirstObject = new Vehicle();
        myFirstObject.doors = 4;
        myFirstObject.color = "blau";
        myFirstObject.getDoors();
        System.out.println(myFirstObject.defineColor());

    }
}

