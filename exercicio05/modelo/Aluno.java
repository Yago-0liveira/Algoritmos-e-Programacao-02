package modelo;

public class Aluno {
    //atributos
    private String nome;
    private int matricula;

    //construtores
    public Aluno (String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    //getters and setters

    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public int getMatricula(){
        return matricula;
    }
    //metodos
    public String imprimir(){
      return this.getNome() + ":" + this.getMatricula();
    }
}
