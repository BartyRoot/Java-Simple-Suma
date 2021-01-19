import javax.swing.JOptionPane;

public class suma {

    public static void main(String[] args) {

        String primerNumero;
        String segundoNumero;

        int numero1 = 0;
        int numero2 = 0;
        int suma;

        primerNumero = JOptionPane.showInputDialog("Escriba el primer numero");
        segundoNumero = JOptionPane.showInputDialog("Escriba el segundo numero");

        try {
            numero1 = Integer.parseInt(primerNumero);
            numero2 = Integer.parseInt(segundoNumero);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "¡Solo se aceptan números!");
            return;
        }

        suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null, "La suma es " + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);
    }
}
