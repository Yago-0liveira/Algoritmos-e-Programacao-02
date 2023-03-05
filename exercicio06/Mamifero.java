public class Mamifero extends Animal {

    //Atributos
    private String alimento;

    //Construtor
    public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float vm, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, vm);
        this.alimento = alimento;
    }
    public Mamifero() {

    }
    // get and set
    public String getAlimento(){
        return alimento;
    }
    public void setAlimento(String alimento){
        this.alimento = alimento;
    }
    //metodo
    public String toString(){
        return super.toString() +
                "\nAlimento: " + getAlimento();
    }
}
