import javax.swing.*;
public class AppBanco {
    public static String menu(){
        return "Digite:\n" +
                "1 - Criar conta \n"+
                "2 - Depositar \n"+
                "3 - Sacar \n"+
                "4 - Consultar saldo\n"+
                "5 - Imprimir conta\n" +
                "6 - transferir\n" +
                "7 - comparar contas\n" +
                "0 - para sair";
    }
    public static void main(String[] args) {
        Conta contas[]= new Conta[10];
        int contConta = 0;
        int op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        while (op!=0 && contConta < 10){
            switch (op){
                case 1:{//Cadastrar conta
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ");
                    contas[contConta] = new Conta(nome);
                    contConta++;
                    JOptionPane.showMessageDialog(null,"Conta criada com sucesso");
                    JOptionPane.showMessageDialog(null, "O número da sua conta é:" + contConta);
                    break;
                }
                case 2:{//Depositar
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog ("Digite o numero da conta: "));
                    if(contas[numConta-1] == null){
                        JOptionPane.showMessageDialog(null,"Essa conta não existe! Confira o" +
                                " número e tente novamente!");
                        break;
                    }
                    double valor =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do deposito: "));
                    contas[numConta-1].depositar(valor);
                    break;
                }
                case 3:{//sacar
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog ("Digite o numero da conta: "));
                    if(contas[numConta-1] == null) {
                        JOptionPane.showMessageDialog(null, "Essa conta não existe! Confira " +
                                "o número e tente novamente!");
                        break;
                    }
                    double valor =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do saque: "));

                    if (contas[numConta-1].sacar(valor)){

                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Sentimos muito, parece que sua conta" +
                                " não possui todo esse valor :(");
                    }
                    break;
                }


                case 4: {//Consultar saldo
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog ("Digite o numero da conta: "));
                    if(contas[numConta-1] == null) {
                        JOptionPane.showMessageDialog(null, "Essa conta não existe! Confira " +
                                "o número e tente novamente!");
                    }
                   JOptionPane.showMessageDialog( null, contas[numConta-1].getSaldo());
                    break;
                }
                case 5: {//Imprimir dados da conta
                    int numConta = Integer.parseInt(JOptionPane.showInputDialog ("Digite o numero da conta: "));
                    JOptionPane.showMessageDialog(null, contas[numConta-1].imprimir());
                    break;
                }
                case 6:{//transferir
                    int contaenvia = Integer.parseInt(JOptionPane.showInputDialog ("Digite o numero da sua conta: "));
                    if(contas[contaenvia-1] == null) {
                        JOptionPane.showMessageDialog(null, "Essa conta não existe! Confira " +
                                "o número e tente novamente!");
                        break;
                    }
                    int contarecebe = Integer.parseInt(JOptionPane.showInputDialog ("Digite o numero da conta que" +
                            " receberá a transferência: "));
                    if(contas[contarecebe-1] == null) {
                        JOptionPane.showMessageDialog(null, "Essa conta não existe! Confira " +
                                "o número e tente novamente!");
                        break;
                    }
                    double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da transferência: "));
                    if (contas[contaenvia-1].transferir(contas[contarecebe-1], valor)){
                        JOptionPane.showMessageDialog(null, " A transferência no valor de R$"
                                + valor + " foi realizada com sucesso");
                    }

                }
                case 7: {
                    int conta1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o numero da primeira conta: "));
                    if(contas[conta1-1] == null) {
                        JOptionPane.showMessageDialog(null, "Essa conta não existe! Confira " +
                                "o número e tente novamente!");
                        break;
                    }
                    int conta2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o numero da segna conta: "));
                    if(contas[conta2-1] == null) {
                        JOptionPane.showMessageDialog(null, "Essa conta não existe! Confira " +
                                "o número e tente novamente!");
                        break;
                    }
                   if (contas[conta1-1].comparar(contas[conta2]) == 0){
                       JOptionPane.showMessageDialog(null, "As contas são iguais");

                   }
                       JOptionPane.showMessageDialog(null, "As contas são diferentes");


                }


            }
             op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }
}