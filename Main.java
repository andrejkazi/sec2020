import javax.swing.SwingUtilities;

public class Main
{
    public static void main(String[] args)
    {
<<<<<<< HEAD
        SwingUtilities.invokeLater(() -> {
			MainFrame mf = new MainFrame();
		});
=======
        MyFileReader fr = new MyFileReader("Input1.txt");
		fr.ReadInputFile();
>>>>>>> ef4bffc1310e4fca866bc509114ca26caa64d2d5
    }
}