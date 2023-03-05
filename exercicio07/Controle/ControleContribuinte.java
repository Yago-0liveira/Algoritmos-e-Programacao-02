package Controle;
import Modelo.*;
import java.util.*;

public class ControleContribuinte {
    private ArrayList <Contribuinte> contribuintes = new ArrayList();

    public void cadastarContribuintePFisica( String nome, String cpf, double rendab){
        contribuintes.add(new PFisica(nome, rendab, cpf));
    }
    public void cadastarContribuintePJuridica(String nome, String cnpj, double rendab){
        contribuintes.add(new PJuridica(nome, rendab, cnpj));
    }
    public String imprimirContribuintes(){
// deve devolver o nome e o imposto que os contribuintes irão pagar
// usar o método imprimir da classe contribuinte

        String res= "====================================\n";
        for(int i=0; i<contribuintes.size();i++){
            if(contribuintes.get(i)!=null){
                res+= contribuintes.get(i).imprimir()+  "\n====================================\n";
            }
        }
        return res;
    }

    public ArrayList <Contribuinte> getContribuintes(){
        return contribuintes;
    }

}



