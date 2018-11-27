import javax.swing.*;

public class Aufgabe1
{
    public static void main (String[]args)
    {
        int alter=Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie Ihr Alter ein!"));
        String wert1=JOptionPane.showInputDialog(null, "Bitte geben Sie eine Zahl ein!");
        switch (wert1)
        {
            case "20":
                int wert2=Integer.parseInt(wert1+alter);
                JOptionPane.showMessageDialog(null, wert2);
                break;
            case "Peter Pan":
                JOptionPane.showMessageDialog(null, "Bangarang");
                break;

            default: System.err.println("Fehler!");
        }
    }
}
