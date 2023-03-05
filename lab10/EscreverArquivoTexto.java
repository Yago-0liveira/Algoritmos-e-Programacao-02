/*import javax.swing.*;
import java.io.*;

public class EscreverArquivoTexto {
    public static void main(String[] args) throws IOException {
        String nome;
        long matricula;
        File arquivo = new File("aluno.txt");
        FileWriter fw=null;
        try{
            fw = new FileWriter(arquivo, true);
            int op=1;
            while (op !=0){
                nome = JOptionPane.showInputDialog("Digite o nome do aluno");
                matricula = Long.parseLong(JOptionPane.showInputDialog("Digite a matricula do aluno"));
                fw.write (nome);
                fw.write ("\t" + matricula );
                fw.write ('\n');
                op = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar outro aluno?\n 1 - sim \n0 - não"));
            }
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        } finally {
            if (fw!=null)
            fw.close();
        }
    }
}
*/