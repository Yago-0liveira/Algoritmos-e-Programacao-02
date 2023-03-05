/* Antonio Vinicius Silva Dutra
* Luan Pinheiro Azevedo 
*/

package dados;

import modelo.*;
import java.io.*;
import java.util.ArrayList;

public class DisciplinaDados{
    ArrayList<Disciplina> disciplina = new ArrayList<>();

    public void getDisciplina(ArrayList<Disciplina> disciplina){
        this.disciplina = disciplina;
    }

    public boolean cadastrarDisciplina(String nome, int codigo, int ch){
        boolean aux;
        Disciplina d = new Disciplina(nome, codigo, ch);
        try{
            FileOutputStream fluxo = new FileOutputStream("disciplina.ser", true);
            ObjectOutputStream obs = new ObjectOutputStream(fluxo);
            obs.writeObject(d);
            obs.close();
            aux = true;
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            aux = false;
        }catch(IOException x){
            System.out.println(x.getMessage());
            aux = false;
        }
        return aux;
    }
    public ArrayList <Disciplina> listarDisciplinas (){
        try{
            FileInputStream fluxo = new FileInputStream("disciplina.ser");
            ObjectInputStream obs = null;
            while(fluxo.available()>0){
                obs = new ObjectInputStream(fluxo);
                Disciplina d = (Disciplina) obs.readObject();
                disciplina.add(d);
                for(int i=0; i<disciplina.size(); i++){
                    if(i>0){
                        if(disciplina.get(i) == disciplina.get(i-1))
                            disciplina.remove(disciplina.get(i));
                    }
                }
            }
            obs.close();
        }catch(ClassNotFoundException i){
            System.out.println(i.getMessage());
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException x){
            System.out.println(x.getMessage());
        }
        return disciplina;
    }

    public Disciplina pesquisarCodigo(int codigo){
        Disciplina d = null;
        for (int i=0; i<disciplina.size(); i++){
            if (codigo == disciplina.get(i).getCodigo()){
                d = disciplina.get(i);
                return d;
            }
        }
        return d;
    }
}
