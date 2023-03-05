package Modelo;

public class PJuridica extends Contribuinte {
    //Atributos
    private String cnpj;

    //construtor
    public PJuridica(String nome, double rendaBruta, String cnpj) {
        super(nome, rendaBruta);
        this.cnpj = cnpj;
    }

    //get and set
    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    //metodos

    @Override
    public double calcularImposto() {
        double imposto = super.getRendaBruta() * 0.10;
        return imposto;
    }

    @Override
    public String imprimir() {
        return "Nome: " + super.getNome() +
                "\n Renda bruta: " + super.getRendaBruta() +
                "\n CNPJ: " + getCnpj() +
                "\n Imposto a ser pago: " + calcularImposto();
    }
}
