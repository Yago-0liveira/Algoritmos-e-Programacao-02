/* Antonio Vinicius Silva Dutra
* Luan Pinheiro Azevedo 
*/

/*Questão 1)
b) Significa que o objeto da classe fica serializavel, e é transformado em um fluxo de bits 
que é guardado no arquivo. */

package visao;

import javax.swing.JOptionPane;
import controle.*;
import modelo.*;

public class AcademicoApp {
    public static String menu(){
       return "Digite:\n" +
               "1 - Cadastrar disciplina\n"+
               "2 - Matricular Aluno\n"+
               "3 - Listar disciplinas \n" +
               "4 - Listar alunos \n"+
               "5 - Pesquisar disciplina \n"+
               "6 - Pesquisar aluno \n"+
               "0 - para sair";
   }

    public static void main(String[] args) {
       ControleDisciplina cd = new ControleDisciplina();
       ControleAluno ca = new ControleAluno();
       
       int op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
       
       while (op!=0){
           switch (op){
               case 1:{
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da disciplina"));
                    String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
                    int ch = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária da disciplina"));
                    if(cd.cadastrarDisciplina(nome, codigo, ch)){
                        JOptionPane.showMessageDialog(null,"Disciplina cadastrada com sucesso!");
                        break;
                    }   
                    else
                        JOptionPane.showMessageDialog(null,"Erro ao cadastrar Disciplina!");

                    break;
                }
                case 2:{
                    String nome = JOptionPane.showInputDialog("Digite o nome do(a) aluno(a): ");
                    ca.matricularAluno(nome);
                    JOptionPane.showMessageDialog(null,"Aluno Matriculado com sucesso!");
                    break;
                }
               case 3:{
                    JOptionPane.showMessageDialog(null,cd.imprimir());                        
                    break;
               }
               case 4:{
                    JOptionPane.showMessageDialog(null,ca.imprimir());                        
                    break;
                }
               case 5:{
                   int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da disciplina"));
                   Disciplina d = cd.pesquisarDisciplina(codigo);
                   if (d != null){
                       JOptionPane.showMessageDialog(null,d.imprimir());
                   }
                   else 
                       JOptionPane.showMessageDialog(null,"Código não encontrado");
                   break;
               }
               case 6:{
                int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do aluno"));
                Aluno aluno = ca.pesquisarAluno(matricula);
                if (aluno != null){
                    JOptionPane.showMessageDialog(null,aluno.imprimir());
                }
                else 
                    JOptionPane.showMessageDialog(null,"Matrícula não encontrada");
                break;
            }
           }
           op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
       }
      
   }
   
}