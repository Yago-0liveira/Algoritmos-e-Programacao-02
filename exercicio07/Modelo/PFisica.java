package Modelo;

public class PFisica extends Contribuinte{

    //atributos
    private String cpf;

    //construtor

    public PFisica(String nome, double rendaBruta, String cpf) {
        super(nome, rendaBruta);
        this.cpf = cpf;
    }
    //get and set
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    //metodos


    @Override
    public double calcularImposto() {
        double imposto = 0;
        if (super.getRendaBruta() <= 1400){
        imposto = 0;
        }
        if (super.getRendaBruta() >= 1400.01 && super.getRendaBruta() <= 2100){
            imposto = (super.getRendaBruta() * 0.10) - 100;
            return imposto;
        }
        if (super.getRendaBruta() >= 2100.01 && super.getRendaBruta() <= 2800){
            imposto = (super.getRendaBruta() * 0.15) - 270;
            return imposto;
        }
        if (super.getRendaBruta() >= 2800.01 && super.getRendaBruta() <= 3600){
            imposto = (super.getRendaBruta() * 0.25) - 500;
            return imposto;
        }
        if (super.getRendaBruta() >= 3600){
            imposto = (super.getRendaBruta() * 0.30) - 700;
            return imposto;
        }
        return imposto;
    }

    @Override
    public String imprimir() {
        return "Nome: " + super.getNome() +
                "\n Renda bruta: " + super.getRendaBruta() +
                "\n CPF: " + getCpf() +
                "\n Imposto a ser pago: " + calcularImposto();
    }


}
