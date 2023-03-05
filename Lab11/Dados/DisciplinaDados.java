package Dados;

import Modelo.Disciplina;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaDados {
    List <Disciplina> disciplinas = new ArrayList<>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public boolean CadastrarDisciplina(String nome, int codigo, int ch) {
        boolean ok;
        Disciplina d = new Disciplina(nome, codigo, ch);
        try {
            FileOutputStream filestream = new FileOutputStream("disciplina.ser", true);
            ObjectOutputStream os = new ObjectOutputStream(filestream);
            os.writeObject(d);
            os.close();
            ok = true;
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            ok = false;
        } catch (IOException x) {
            JOptionPane.showMessageDialog(null, x.getMessage());
            ok = false;
        }
        return ok;
    }
    public ArrayList <Disciplina> listarDisciplinas (){
        try{
            FileInputStream fluxo = new FileInputStream("disciplina.ser");
            ObjectInputStream ler = null;
            while (fluxo.available() > 0){
                ler = new ObjectInputStream(fluxo);
                Disciplina d = (Disciplina) ler.readObject();
                disciplinas.add(d);
                for(int i=0; i<disciplinas.size(); i++){
                    if(i>0){
                        if(disciplinas.get(i) == disciplinas.get(i-1))
                            disciplinas.remove(disciplinas.get(i));
                    }
                }
            }
            ler.close();
        }
        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (ClassNotFoundException ep){
            JOptionPane.showMessageDialog(null, ep.getMessage());
        }
        catch (IOException x){
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        return (ArrayList<Disciplina>) disciplinas;
    }
    public Disciplina pesquisarCodigo(int codigo){
        Disciplina d = null;
        for (int i=0; i<disciplinas.size(); i++){
            if (codigo == disciplinas.get(i).getCodigo()){
                d = disciplinas.get(i);
                return d;
            }
        }
        return d;
    }
}
