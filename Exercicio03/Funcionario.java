public class Funcionario {
    int codigo;
    public static int contCodigo;
    String nome;
    String cpf;
    float salario;
    Data dataAd;

    // Construtores

    public Funcionario( String nome){
        this.nome = nome;
        this.codigo = contCodigo++;
    }
    public Funcionario (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = contCodigo++;
    }

    public Funcionario (String nome, String cpf, Float salario,Data dataAd ){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataAd =dataAd;
        this.codigo = contCodigo++;
    }
    //getters and setters

    public int getCodigo() {
        return codigo;
    }

   public String getNome (){
        return nome;
   }
   public void setNome(String nome){
        this.nome = nome;
   }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public float getSalario(){
        return salario;
    }
    public void setSalario (float salario){
        this.salario = salario;
    }
    public Data getDataAd (){
        return dataAd;
    }

    //Métodos

    public String imprimirFuncionario(){
        return "\nNome: " + getNome() +
                "\nCPF: " + cpfFormatado( this.getCpf()) +
                "\nCodigo: " + getCodigo() +
                "\nSalario: " +getSalario() +
                "\nData de admissao: " + dataFormatada(getDataAd());
    }
    public StringBuilder cpfFormatado(String cpf){
        StringBuilder cpfFormat = new StringBuilder();
        cpfFormat.append(cpf, 0, 3).append(".").append(cpf, 3, 6).append(".").
                append(cpf, 6, 9).append("-").append(cpf, 9, 11);
        return cpfFormat;
    }

    public StringBuilder dataFormatada(Data data){
        StringBuilder dataFormat = new StringBuilder();
        dataFormat.append(data.getDia()).append("/").append(data.getMes()).append("/").append(data.getAno());
        return dataFormat;
    }

}
