import javax.swing.JOptionPane;

public class Produto {
    //Atributos

    private String nome;
    private String descricao;
    private String tipo;
    private int estoque;
    private double valorDeCompra;
    private double valorDeVenda;
    private int codigoProduto;
    public static int contadorDeProdutos;


    //Construtores

    public Produto(String nome, String descricao, String tipo, int estoque, double valorDeCompra){
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.estoque = estoque;
        this.valorDeCompra = valorDeCompra;
        this.codigoProduto = ++contadorDeProdutos;
    }

    //Metodos

    public double calculaPreco(double valorDeCompra){
        setValorDeVenda(valorDeCompra * 1.75);
        return getValorDeVenda();
    }

    public void compraProduto(int quantidadeComprada){
        setEstoque(getEstoque() + quantidadeComprada);
    }

    public boolean vendaProduto(int quantidadeVendida){
        if(quantidadeVendida > getEstoque()){
            JOptionPane.showMessageDialog(null, "O estoque deste produto e de " + getEstoque() + ", nao temos a quantidade desejada");
            return false;
        }
        setEstoque(getEstoque() - quantidadeVendida);
        return true;
    }

    public double calculaVenda(int quantidadeVendida){
        return quantidadeVendida * calculaPreco(getValorDeCompra());
    }

    //Setters e Getters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValorDeCompra() {
        return valorDeCompra;
    }

    public double getValorDeVenda(){
        return valorDeVenda;
    }

    public void setValorDeVenda(double valorDeVenda){
        this.valorDeVenda = valorDeVenda;
    }

    public int getCodigoProduto(){
        return codigoProduto;
    }


}

