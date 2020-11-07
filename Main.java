import javax.swing.SwingUtilities;

public class Main
{
    public static void main(String[] args)
    {
        MyFileReader fr = new MyFileReader("Input1.txt");
		fr.ReadInputFile();
    }
}