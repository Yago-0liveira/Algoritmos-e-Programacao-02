package Visao;
import java.io.*;
import javax.swing.*;
import Modelo.*;
public class AppBanco {

    public class AppConta{
        public static String menu(){
            return "Banco AP2\n\n" +
                    "1 - Criar conta\n" +
                    "0 - Sair";
        }

        public static void main(String[] args) throws IOException{
            int op;
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
            Conta conta = new Conta();
            while (op!=0){
                switch(op){
                    case 1 -> {
                        String nome = JOptionPane.showInputDialog("Digite seu nome");
                        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo"));
                        conta = new Conta(nome, saldo);
                        JOptionPane.showMessageDialog(null, "Conta criada com sucesso, o número da" +
                                " sua conta é: " + conta.getNumero() );

                        conta.armazenarConta();
                    }
                }
                op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
            }
        }
    }
}
