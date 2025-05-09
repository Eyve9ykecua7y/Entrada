import javax.swing.JOptionPane;
public class Entrada{
    public static void main(String args[]){
        String nombreUsuario = JOptionPane.showInputDialog("ingresa tu nombre: ");
        String apellidoPaterno = JOptionPane.showInputDialog("ingresa tu apellido paterno: ");
        String apellidoMaterno = JOptionPane.showInputDialog("ingresa tu apellido materno: ");
        System.out.println("Tu nombre completo es: "+ nombreUsuario+" "+apellidoPaterno+" "+apellidoMaterno);

    }
}