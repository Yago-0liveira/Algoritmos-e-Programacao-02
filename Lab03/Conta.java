public class Conta {

    //Atributos
    private int numero;
    private String cliente;
    private double saldo;

    public static int contnConta;

    //Construtores
    public Conta (String nome){
        this.cliente = nome;
        this.numero = ++contnConta;
    }

    public Conta(String nome, double saldo) {
        this.cliente = nome;
        this.saldo = saldo;
        this.numero = ++contnConta;
    }
    // getters and setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos
    boolean sacar(double valor){
        boolean ok=false;
        if (saldo >= valor){
            saldo = saldo - valor;
            ok=true;
        }
        return ok;
    }
    void depositar(double valor){
        if ( valor>0 )
        saldo +=valor;
    }
    public boolean transferir (Conta conta, double valor){
       if  (this.sacar(valor)){
           conta.depositar(valor);
           return true;
       }
       return false;
    }

    public String imprimir (){
        return  "<<<<<<< Dados >>>>>>>" +
                "\n Número da conta: " + numero +
                "\n nome do cliente: " + cliente +
                "\n Saldo da conta: " + saldo;
    }
    public int comparar (Conta conta){
        if (this.getNumero() == conta.getNumero() && this.getCliente() == conta.getCliente()
                && this.getSaldo() == conta.getSaldo()){
            return 0;
        }
        return 1;
    }
}
