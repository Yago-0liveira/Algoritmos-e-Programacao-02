import static java.lang.System.exit;

public class Calculadora {
    //somar
    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    //subtrair
    public int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    //multiplicar
    public int multiplicar(int n1, int n2) {
        return n1 * n2;

    }

    //dividir
    public int dividir(int n1, int n2){
        if (n2 == 0) {
            System.out.println("Não é possível dividir por 0");
            exit(0);
        }

        return n1/n2;
    }

}
