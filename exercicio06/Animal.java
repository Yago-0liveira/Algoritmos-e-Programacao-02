public class Animal {
    //atributos
    private String nome;
    private float comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;
    private static int cont = 0;

    //construtores
    public Animal (String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float vm){
        cont++;
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = vm;
    }

    public Animal() {

    }


    //getters and setters
    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }

    public float getComprimento(){
        return comprimento;
    }
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }
    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }
    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
    //metodos
    public String toString(){
        return " Dados " +
                "\nNome: " + getNome() +
                "\nComprimento: " + getComprimento() +
                "\nNúmero de patas: " + getNumeroDePatas() +
                "\nCor: " + getCor() +
                "\nAmbiente: " + getAmbiente() +
                "\nVelocidade média: " + getVelocidadeMedia();
    }
}
