public class Conta {
    //Atributos
    private int numero;
    private Cliente cliente;
    private double saldo;
    private static int contConta;

    //Construtores
    public Conta (Cliente cliente){
        this.cliente = cliente;
        this.numero = contConta++;
    }
    public Conta (Cliente cliente, double saldo){
        this.cliente = cliente;
        this.saldo = saldo;
        this.numero = contConta++;
    }

    //getters and setters
    public int getNumero (){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //Metodos
    public boolean sacar (double retirar){
        boolean ok = false;
        if ( saldo >= retirar){
            saldo = saldo - retirar;
            ok = true;
        }
        return ok;
    }

    public void depositar (double deposito){
        if (deposito > 0){
            saldo = saldo + deposito;
        }
    }

    public boolean transferir (Conta conta2, double valor){
        if (this.sacar(valor) ){
            conta2.depositar(valor);
            return true;
        }
        return false;
    }

    public String imprimir (){
        return "Dados da conta: " +
                "\nNome: " + cliente.getNome() +
                "\nNumero da conta: " + getNumero() +
                "\nSaldo: " + getSaldo();
    }

}
