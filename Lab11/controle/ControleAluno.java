/* Antonio Vinicius Silva Dutra
* Luan Pinheiro Azevedo 
*/

package controle;

import modelo.*;
import java.util.ArrayList;
import dados.*;

public class ControleAluno {
    AlunoDados alunoDados = new AlunoDados ();

    public void matricularAluno (String nome){
        alunoDados.matricularAluno(nome); 
    }
    public Aluno pesquisarAluno (int codigo) {
        return alunoDados.pesquisarAluno(codigo);
    }
    public ArrayList<Aluno> listarAlunos() {
        return alunoDados.listarAlunos();
    }
    public String imprimir(){
        String res="";
        ArrayList<Aluno> disc = listarAlunos();
        for (int i=0; i<disc.size(); i++){
            res += disc.get(i).imprimir() + "\n---------\n";
        }
        return res;
    }
}
