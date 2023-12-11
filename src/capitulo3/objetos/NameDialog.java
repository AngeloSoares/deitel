package capitulo3.objetos;
import javax.swing.JOptionPane;
public class NameDialog
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Qual é o seu nome? ");

        String message = String.format("Bem vindo, %s, à programação Java!", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
