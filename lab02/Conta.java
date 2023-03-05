public class Conta {

    //atributos
    String titular;
    int numeroConta;
    int agencia;
    double saldo;
    String abertura;



//construtor
    public Conta (String titular, int numeroConta, int agencia, double saldo, String abertura ) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.abertura = abertura;
    }

    public Conta() {
    }

    //getters and setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia (int agencia){
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getAbertura() {
        return abertura;
    }


    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    //metodos
    public boolean sacar (double valor){
        if ((saldo - valor) >= 0){
            saldo = saldo - valor;
            return true;
        }
        else return false;
    }

    public double depositar ( double depositar){
        saldo = saldo + depositar;
        return  saldo;
    }

    public double rendimento (double rendimento){
        rendimento = 1.03;
        saldo = saldo * rendimento;
        return saldo;
    }

    public void imprimi (){
        System.out.println("------- Dados ------- ");
        System.out.println(" número da conta: " + numeroConta);
        System.out.println("Titular da conta" + titular);
        System.out.println("Saldo" + saldo);
        System.out.println(" ciente desde: " + abertura);
    }



}
