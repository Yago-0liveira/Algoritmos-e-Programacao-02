import javax.swing.*;

public class TestaCalculadora {
    public static void main(String[] args) {
        int x, y;
        Calculadora c = new Calculadora();
        String aux = JOptionPane.showInputDialog("Digite um número");
        x = Integer.parseInt(aux);
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        System.out.println("Soma: " + c.somar(x, y));
        System.out.println("Subtraçao: " + c.subtrair(x, y));
        System.out.println("Multiplicação: " + c.multiplicar(x, y));
        System.out.println("Divisão: " + c.dividir(x, y));
    }
}