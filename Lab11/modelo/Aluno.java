/* Antonio Vinicius Silva Dutra
* Luan Pinheiro Azevedo 
*/

package modelo;

import java.io.Serializable;

public class Aluno implements Serializable{
    private String nome;
    private int matricula;
    private static int cont=0;
    
    public Aluno (String nome){
        this.nome=nome;
        this.matricula = ++cont;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public String imprimir (){
        return "Cadastro Nº "+this.getMatricula() + ": " + this.getNome();
    }
}

