import javax.swing.*;

public class AppBanco {
    public static String menu (){
        return "Menu inicial \n" +
                "1 - Criar conta \n"+
                "2 - Depositar \n"+
                "3 - Sacar \n"+
                "4 - Consultar saldo\n"+
                "5 - Transferir dinheiro\n" +
                "6 - Imprimir conta\n" +
                "7 - Cadastrar cliente\n" +
                "0 - para sair";
    }


    public static void main(String[] args) {
    final int nmax = 10;
    Conta contas [] = new Conta[nmax];
    Cliente clientes [] = new Cliente[nmax];
    int opcoes = Integer.parseInt(JOptionPane.showInputDialog(menu()));
    int contconta = 0;
    int contcli = 0;
    int cliente_escolhido = -1;
        while (opcoes !=0 ){
         switch (opcoes){

            case 1: {
                if (contconta == nmax){
                    JOptionPane.showMessageDialog(null, "Número máximo de contas criadas");
                    break;
                }
                String cpf = JOptionPane.showInputDialog("Digite o seu cpf para criar uma conta no Banco Brazil");
                if (cpf.length() != 11){
                    JOptionPane.showMessageDialog(null, "CPF incorreto, verifique e tente novamente!");
                    break;
                }
                    for (int i = 0; i < clientes.length; i++) {
                        if (cpf.equals(clientes[i].getCpf())) {
                            cliente_escolhido = i;
                            break;
                        }
                    }
                        if (cliente_escolhido == -1){
                            JOptionPane.showMessageDialog(null, "Não existe cliente cadastrado com esse cpf!");
                            break;

                }

                contas[contconta] = new Conta(clientes[cliente_escolhido]);
                contconta++;
                cliente_escolhido = -1;
                JOptionPane.showMessageDialog(null, "conta criada com sucesso! o número da " +
                        "sua conta é: " + contas[contconta-1].getNumero());
                break;
            }
            case 2: {
                int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta que deseja depositar"));
                if (contas[conta] == null){
                    JOptionPane.showMessageDialog(null, "Verifique o número da conta e tente novamente");
                break;
                }
                double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja depositar"));
                contas[conta].depositar(valor);
                JOptionPane.showMessageDialog(null, "R$ " + valor + " foram depositados na sua conta");
                break;
            }
            case 3:{
                int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta que deseja sacar"));
                if(contas[conta] == null){
                    JOptionPane.showMessageDialog(null, "Verifique o número da conta e tente novamente");
                break;
                }
                double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja sacar: "));
                if (contas[conta].sacar(valor)){
                    JOptionPane.showMessageDialog(null, "você está sacando R$ " + valor + " e " +
                            "ficará com o saldo de R$ " + contas[conta].getSaldo() );

                }
                else {
                    JOptionPane.showMessageDialog(null, "saldo insuficiente!");
                }
                break;
            }
            case 4: {
                int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta: "));
                if (contas[conta] == null){
                    JOptionPane.showMessageDialog(null, "verifique o número da conta e tente novamente");
                break;
                }
                JOptionPane.showMessageDialog(null, "O saldo da sua conta é de: \n" +
                        contas[conta].getSaldo());
                break;
            }
            case 5: {
                int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta que vai transferir o valor: "));
                if (contas[conta] == null){
                    JOptionPane.showMessageDialog(null, "Verifique o número da conta e tente novamente");
                break;
                }
                double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que será transferido"));

                int conta2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta que receberá a" +
                        " transferência"));
                if (contas[conta2] == null){
                    JOptionPane.showMessageDialog(null, "Verifique o número da conta e tente novamente");
                    break;
                }
                if (contas[conta].transferir(contas[conta2], valor)){
                    JOptionPane.showMessageDialog(null, "a transferência no valor de R$ " + valor +
                            "foi realizada com sucesso.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar a transação");
                }
                break;
            }
            case 6:{
                int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
                if (contas[conta] ==  null){
                    JOptionPane.showMessageDialog(null, "verifique o número da conta e tente novamente");
                }
                JOptionPane.showMessageDialog(null, contas[conta].imprimir());
                break;

            }
            case 7: {
                if (contcli == nmax) {
                    JOptionPane.showMessageDialog(null, "Número máximo de clientes atingido!");
                }
                String nome = JOptionPane.showInputDialog("Insira o seu nome: ");
                String cpf = JOptionPane.showInputDialog("Insira seu CPF:");
                if (cpf.length() != 11) {
                    JOptionPane.showMessageDialog(null, "CPF incorreto, verifique e tente novamente!");
                break;
                }
                String endereco = JOptionPane.showInputDialog("Informe seu endereço: ");

                clientes[contcli] = new Cliente(nome, cpf, endereco);
                contcli++;
                break;
            }


            default:{
                JOptionPane.showMessageDialog(null, "essa opção não existe!");
            }
        }
        opcoes = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }
}