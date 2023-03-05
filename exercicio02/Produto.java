import javax.swing.*;

public class Produto {
   String nome;
   String descrição;
   String tipo;
   int quantidadeE;
   double valorAd;

   // construtor;

    public Produto() {
    }

    public double calculaPreco (double valorAd){
    double vender = valorAd*1.75;
    return vender;
    }
    public int compraProduto (int quantcomp){
    quantidadeE += quantcomp;
    return quantidadeE;
    }
    public boolean vendaProduto (int quantvend){
        if ((quantidadeE - quantvend) > 0){
            quantidadeE -= quantvend;
            return true;
        }
        else {
            JOptionPane.showMessageDialog(null,"você não tem estoque!");
            return false;
        }
    }

    public double calculaVenda (int quantvend){
        double vendaT = quantvend * calculaPreco(valorAd);
        return vendaT;
    }
}
