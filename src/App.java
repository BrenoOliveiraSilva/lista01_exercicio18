import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double size = 0;
        double downloadSpeed =  0;
        boolean validInput = false;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        while (!validInput) {
            String input_1 = JOptionPane.showInputDialog(null, "Informe o tamanho em metros quadrados da área a ser pintada");
            String input_2 = JOptionPane.showInputDialog(null, "Informe o tamanho em metros quadrados da área a ser pintada");
            try {
                size = Double.parseDouble(input_1);
                downloadSpeed = Double.parseDouble(input_2);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        if (size > 0 && downloadSpeed > 0) {
            double time = (size / downloadSpeed) / 60;
            JOptionPane.showMessageDialog(null, "O download demorará " + numberFormat.format(time) + " minutos para terminar");
        } else {
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
        }
    }
}