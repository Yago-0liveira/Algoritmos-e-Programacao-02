import javax.swing.JOptionPane;
public class AppBanco {
    public static String menu(){
        return "Escolha uma opção:\n"
        + "1 - Cadastrar conta\n"
        + "2 - Sacar\n"
        + "3 - Depositar\n"
        + "4 - Imprimir conta\n" // Imprime os dados da conta
        + "0 - sair";
    }

    public static void main(String[] args) {
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        Conta c = new Conta();
        while (op !=0){
            switch (op){
                case 1:{
                    c.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Número da Conta: "));
                    c.titular = JOptionPane.showInputDialog("Nome do titular da conta:");
                    c.abertura =JOptionPane.showInputDialog("Data de cadastro da Conta: ");
                    break;
                }
                case 2:{
                double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Saque!"));
                if (c.sacar(valor)) {
                    c.sacar(valor);
                }
                else
                    JOptionPane.showMessageDialog(null, "saldo insuficente");
                    break;
                }
                case 3:{
                    double depositar = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do depósito"));
                    c.depositar(depositar);
                    break;
                }
                case 4:{// Imprime os dados da conta
                     c.imprimi();
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Entrada inválida");
            }
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }
}
