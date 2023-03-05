/* Antonio Vinicius Silva Dutra
* Luan Pinheiro Azevedo 
*/

package dados;

import java.util.ArrayList;
import modelo.*;
import java.io.*;

public class AlunoDados {
    ArrayList<Aluno> aluno = new ArrayList<>();

    public void getAluno(ArrayList<Aluno> aluno){
        this.aluno = aluno;
    }

    public void matricularAluno(String nome){
        Aluno a = new Aluno(nome);
        try{
            FileOutputStream fluxo = new FileOutputStream("aluno.ser", true);
            ObjectOutputStream obs = new ObjectOutputStream(fluxo);
            obs.writeObject(a);
            obs.close();
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException x){
            System.out.println(x.getMessage());
        }
    }
    public ArrayList<Aluno> listarAlunos(){
        try{
            FileInputStream fluxo = new FileInputStream("aluno.ser");
            ObjectInputStream obs = null; 
            while(fluxo.available()>0){
                obs = new ObjectInputStream(fluxo);
                Aluno a = (Aluno) obs.readObject(); 
                aluno.add(a);
            }
            obs.close();
        }catch(ClassNotFoundException i){
            System.out.println(i.getMessage());
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException x){
            System.out.println(x.getMessage());
        }   
        return aluno;
    }

    public Aluno pesquisarAluno(int codigo){
        Aluno a = null;
        for (int i=0; i<aluno.size(); i++){
            if (codigo == aluno.get(i).getMatricula()){
                a = aluno.get(i);
                return a;
            }   
        }
        return a;
    }
}
