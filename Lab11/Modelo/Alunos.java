package Modelo;

import java.io.Serializable;

public class Alunos implements Serializable {
    //atributos
    private String nome;
    private long matricula;

    //construtor
    public Alunos (String nome, long matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    //getters and setters
    public String getNome (){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public long getMatricula (){
        return matricula;
    }
    public void setMatricula(long matricula){
        this.matricula = matricula;
    }
    //metodos
    public String imprimir (){
        return "Nome: " + getNome() +
                "\n número de matrícula: " + getMatricula();
    }
}
