import javax.swing.JOptionPane;
public class AppFuncionario {
    public static String menu() {
        return "Escolha a Opção desejada" +
                "\n1 - Cadastrar funcionario" +
                "\n2 - Dados do funcionario" +
                "\n3 - Ver funcionarios por Data de entrada" +
                "\n0 - encerrar programa";

    }

    public static void main(String[] args) {
        int opcoes;
        final int funcionariosMax = 5;
        Data[] listaDatas = new Data[funcionariosMax];
        Funcionario[] listaFunc = new Funcionario[funcionariosMax];
        int nCont = 0;
        opcoes = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        while (opcoes != 0) {
            switch (opcoes) {
                case 1: {
                    if (nCont == funcionariosMax) {
                        JOptionPane.showMessageDialog(null, "numero maximo de funcionarios atingidos");
                        break;
                    }
                    String nome = JOptionPane.showInputDialog("Digite o nome do Contratado: ");
                    String cpf = JOptionPane.showInputDialog("Digite o CPF do contratado: ");
                    if (cpf.length() != 11) {
                        JOptionPane.showMessageDialog(null, "O CPF é inválido, confira os números e tente novamente");
                        break;
                    }
                    float salario = Integer.parseInt(JOptionPane.showInputDialog("Insira o salário do contratado: "));
                    JOptionPane.showMessageDialog(null, "Insira a data de admissão do contratado:");
                    int dia = Integer.parseInt(JOptionPane.showInputDialog(" Dia:"));
                    int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
                    int ano = Integer.parseInt(JOptionPane.showInputDialog("ano: "));

                    listaDatas[nCont] = new Data(dia, mes, ano);
                    listaFunc[nCont] = new Funcionario(nome, cpf, salario, listaDatas[nCont]);
                    nCont++;
                    JOptionPane.showMessageDialog(null, "O código do funcionario é: " + listaFunc[nCont-1].getCodigo());
                    break;
                }
                case 2: {
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do funcionário: "));
                    if ( listaFunc[codigo] == null) {
                        JOptionPane.showMessageDialog(null, "Funcionario nao encontrado!");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, listaFunc[codigo].imprimirFuncionario());
                    break;
                }

                case 3: {
                    JOptionPane.showMessageDialog(null, "Informe uma data: ");
                    int dia = Integer.parseInt(JOptionPane.showInputDialog("dia:"));
                    int mes = Integer.parseInt(JOptionPane.showInputDialog("mes:"));
                    int ano = Integer.parseInt(JOptionPane.showInputDialog("ano:"));
                    Data comparaData = new Data(dia, mes, ano);

                    int temp = 0;
                    for (int i = 0; i < nCont; i++){
                        if (listaFunc[i].getDataAd().getDiasTotal() == comparaData.getDiasTotal()){
                            JOptionPane.showMessageDialog(null, listaFunc[i].imprimirFuncionario());
                        temp++;
                        }
                    }
                    if (temp == 0){
                        JOptionPane.showMessageDialog(null, "Não exiistem funcionarios registrados" +
                                " nessa data");
                    }
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opcao invalida, tente novamente");
                }
            }
            opcoes = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }

    }
}

