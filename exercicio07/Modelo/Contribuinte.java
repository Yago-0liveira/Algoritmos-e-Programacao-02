package Modelo;

public abstract class Contribuinte {
    //atributos
    protected String nome;
    protected double rendaBruta;

    //construtor
    public Contribuinte ( String nome, double rendaBruta){
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    //getters and setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getRendaBruta(){
        return rendaBruta;
    }
    public void setRendaBruta(double rendaBruta){
        this.rendaBruta = rendaBruta;
    }

    //metodos
    public abstract double calcularImposto();

    public abstract String imprimir();
}
