/* Antonio Vinicius Silva Dutra
* Luan Pinheiro Azevedo 
*/

package modelo;

import java.io.Serializable;

public class Disciplina implements Serializable{
    private String nome;
    private int codigo;
    private int cargaHoraria;

    public Disciplina(){}

    public Disciplina(String nome, int ch){
        this.nome = nome;
        this.cargaHoraria = ch;
    }

    public Disciplina(String nome, int codigo, int ch){
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = ch;
    }

    public String getNome(){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo (int codigo){
        this.codigo = codigo;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria (int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public String imprimir(){

        return "Nome: " + this.getNome() + "\n Codigo: " + this.getCodigo() + 
        "\nCarga horaria: " + this.getCargaHoraria();
     }
}

