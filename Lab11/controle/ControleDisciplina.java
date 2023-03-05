/* Antonio Vinicius Silva Dutra
* Luan Pinheiro Azevedo 
*/

package controle;

import modelo.*;
import java.util.ArrayList;
import dados.*;

public class ControleDisciplina {

    DisciplinaDados disciplinaDados = new DisciplinaDados ();

    public boolean cadastrarDisciplina (String nome, int codigo, int ch){
        boolean aux;
        if(disciplinaDados.cadastrarDisciplina(nome, codigo, ch))
            aux = true;
        else 
            aux = false;

        return aux;
    }
    public Disciplina pesquisarDisciplina (int codigo) {
        return disciplinaDados.pesquisarCodigo(codigo);
    }
    public ArrayList<Disciplina> listarDisciplina() {
        return disciplinaDados.listarDisciplinas();
    }
    public String imprimir(){
        String res="";
        ArrayList<Disciplina> disc = listarDisciplina();
        for (int i=0; i<disc.size(); i++){
            res += disc.get(i).imprimir() + "\n---------\n";
        }
        return res;
    }

}