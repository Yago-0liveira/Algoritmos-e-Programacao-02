package Visão;
import Modelo.*;
import Controle.*;
import javax.swing.*;

public class AppContribuinte {
    public static String menu(){
        return "Digite:\n" +
                "1 - Cadastrar contribuinte\n " +
                "2 - Imprimir contribuinte \n" +
                "0 - para sair";
    }
    public static void main(String[] args) {
        int op;
        ControleContribuinte cc = new ControleContribuinte();
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        while (op !=0){
            switch (op){
                case 1:{ //Cadastrar contribuinte
                    String nome = JOptionPane.showInputDialog("Informe o nome do contribuinte");
                    double rendab = Integer.parseInt(JOptionPane.showInputDialog("Informe a renda do contribuinte"));
                    String numeroid = JOptionPane.showInputDialog("Informe o cpf ou cnpj do contribuinte");
                    if (numeroid.length() == 11){
                        cc.cadastarContribuintePFisica(nome,numeroid, rendab);
                        JOptionPane.showMessageDialog(null, "Contribuinte cadastrado com sucesso");
                        break;
                    }
                    else if (numeroid.length() == 14) {
                        cc.cadastarContribuintePJuridica(nome, numeroid, rendab);
                        JOptionPane.showMessageDialog(null, "Contribuinte cadastrado com sucesso");
                        break;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "O Número do cpf ou cnpj está incorreto");
                        break;
                    }
                }
                case 2:{ // Imprimir lista de contribuintes
                    String numeroid = JOptionPane.showInputDialog("Digite o cpf ou cnpj para imprimir seus dados");
                        JOptionPane.showMessageDialog(null, cc.imprimirContribuintes());
                        break;
                    }

                }
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
            }
        }
    }

