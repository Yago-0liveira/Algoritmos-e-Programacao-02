package Controle;

import Dados.AlunosDados;
import Modelo.Alunos;
import Modelo.Disciplina;

import java.util.ArrayList;

public class ControleAlunos {
    AlunosDados alu = new AlunosDados();

    public boolean cadastrarAlunos (String nome, long matricula){
        boolean ok;
        if (alu.cadastrarAlunos(nome, matricula)){
            ok = true;
        }
        else{
            ok = false;
        }
        return ok;
    }
    public Alunos pesquisarAluno (long matricula){
        return alu.pesquisarAlunos(matricula);
    }
    public ArrayList <Alunos> listarAlunos(){
        return alu.ListarAlunos();
    }

    public String imprimir(){
        String res="";
        ArrayList <Alunos> alu = listarAlunos();
        for (int i=0; i<alu.size(); i++){
            res += alu.get(i).imprimir() + "\n---------\n";
        }
        return res;
    }

}
