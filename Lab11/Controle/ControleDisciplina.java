package Controle;
import Dados.DisciplinaDados;
import Modelo.Disciplina;

import java.util.ArrayList;

public class ControleDisciplina {
    DisciplinaDados disciplinaDados = new DisciplinaDados ();
    public boolean cadastrarDisciplina (String nome, int codigo, int ch){
        boolean ok;
        if (disciplinaDados.CadastrarDisciplina(nome, codigo, ch)){
            ok = true;
        }
        else {
            return false;
        }
            return ok;
    }
    public Disciplina pesquisarDisciplina (int codigo) {
        return disciplinaDados.pesquisarCodigo(codigo);
    }
    public ArrayList<Disciplina> listarDisciplina() {
        return disciplinaDados.listarDisciplinas();
    }
    public String imprimir(){
        String res="";
        ArrayList <Disciplina> disc = listarDisciplina();
        for (int i=0; i<disc.size(); i++){
            res += disc.get(i).imprimir() + "\n---------\n";
        }
        return res;
    }
}