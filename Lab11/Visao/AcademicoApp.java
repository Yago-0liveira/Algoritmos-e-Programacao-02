package Visao;
import Modelo.*;
import Controle.*;
import javax.swing.*;
public class AcademicoApp {
    public static String menu(){
        return "Digite:\n" +
                "1 - Cadastrar disciplina\n"+
                "2 - Listar disciplinas \n" +
                "3 - Pesquisar disciplina \n"+
                "4 - Cadastrar aluno \n"+
                "5 - Listar alunos \n" +
                "6 - Pesquisar aluno \n" +
                "0 - para sair";
    }

    public static void main(String[] args) {
        ControleDisciplina cd = new ControleDisciplina();
        ControleAlunos ca = new ControleAlunos();
        int op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        while (op!=0){
            switch (op){

                case 1:{

                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da disciplina"));
                    String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
                    int ch = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária da disciplina"));
                    cd.cadastrarDisciplina(nome, codigo, ch);
                    JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");
                    break;
                }
                case 2:{
                    JOptionPane.showMessageDialog(null,cd.imprimir());
                    break;
                }
                case 3:{
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da disciplina"));
                    Disciplina d = cd.pesquisarDisciplina(codigo);
                    if (d != null){
                        JOptionPane.showMessageDialog(null,d.imprimir());
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Código não encontrado");
                    break;
                }
                case 4: {
                    String nome = JOptionPane.showInputDialog("Digite o nome do novo aluno");
                    long matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula"));
                    ca.cadastrarAlunos(nome, matricula);
                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, ca.imprimir());
                    break;
                }
                case 6: {
                    long matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de matrícula"));
                    Alunos a = ca.pesquisarAluno(matricula);
                    if (a != null){
                        JOptionPane.showMessageDialog(null, a.imprimir());
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Codigo não encontrado");
                    break;
                }
                default:{
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            }
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }
}
