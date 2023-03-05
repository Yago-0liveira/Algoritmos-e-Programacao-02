package Dados;
import Modelo.Alunos;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AlunosDados {
    List<Alunos> alunos = new ArrayList<>();

    public void setAlunos(List<Alunos> alunos) {
        this.alunos = alunos;
    }
    public boolean cadastrarAlunos (String nome, long matricula){
        boolean ok;
        Alunos a = new Alunos(nome, matricula);

        try {
            FileOutputStream fluxo = new FileOutputStream("alunos.ser", true);
            ObjectOutputStream dados = new ObjectOutputStream(fluxo);
            dados.writeObject(a);
            dados.close();
            ok = true;
        }
        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            ok = false;
        }
        catch (IOException x){
            JOptionPane.showMessageDialog(null, x.getMessage());
            ok = false;
        }
        return ok;
    }

    public ArrayList <Alunos> ListarAlunos(){
        try{
            FileInputStream fluxo = new FileInputStream("alunos.ser");
            ObjectInputStream ler = null;
            while (fluxo.available() > 0) {
                ler = new ObjectInputStream(fluxo);
                Alunos a = (Alunos) ler.readObject();
                alunos.add(a);
                for (int i = 0; i < alunos.size(); i++) {
                    if (i > 0) {
                        if (alunos.get(i) == alunos.get(i - 1))
                            alunos.remove(alunos.get(i));
                    }
                }
            }
            ler.close();
        }
        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (ClassNotFoundException r){
            JOptionPane.showMessageDialog(null, r.getMessage());
        }
        catch (IOException x){
            JOptionPane.showMessageDialog(null, x.getMessage());
        }
        return (ArrayList<Alunos>) alunos;
    }

    public Alunos pesquisarAlunos(long matricula){
        Alunos a = null;
        for(int i = 0; i < alunos.size(); i++){
            if(matricula == alunos.get(i).getMatricula()){
                a = alunos.get(i);
                return a;
            }
        }
        return null;
    }

}
