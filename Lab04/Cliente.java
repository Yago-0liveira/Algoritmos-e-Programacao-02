public class Cliente {
    //Atributos
    private String cpf;
    private String Nome;
    private String endereco;

    // Construtores

    public Cliente (String nome, String cpf){
        this.Nome = nome;
        this.cpf = cpf;
    }
    public Cliente (String nome, String cpf, String endereco){
        this.Nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    // Getters and Setters
    public String getNome (){
        return Nome;
    }

    public void setNome (String nome){
        this.Nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //metodos
    public StringBuilder cpfFormatado(String cpf){
        StringBuilder cpfFormat = new StringBuilder();
        cpfFormat.append(cpf, 0, 3).append(".").append(cpf, 3, 6).append(".").
                append(cpf, 6, 9).append("-").append(cpf, 9, 11);
        return cpfFormat;
    }

    public String imprimir (){
        return "Dados do cliente" +
                "\nNome: " + getNome() +
                "\nCPF:" + cpfFormatado(getCpf()) +
                "\nEndereço: " + getEndereco();
    }
}

