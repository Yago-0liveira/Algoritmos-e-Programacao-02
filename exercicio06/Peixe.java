public class Peixe extends Animal{

    //Atributos
    private String caracteristica;

    // construtor
    public Peixe(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float vm, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, vm);
        this.caracteristica = caracteristica;
    }
    public Peixe(){

    }

    //get and set
    public String getCaracteristica(){
        return caracteristica;
    }
    public void setCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }

    //metodo
    public String toString(){
        return super.toString() +
                "\ncaracterística: " + getCaracteristica();
    }

}
