public class Data {
    //Atributos
    private int dia;
    private int mes;
    private int ano;
    private int diasTotal;
    private String mesExtenso;
    private String[]  meses = new String[] {"janeiro", " fevereiro", "março", "abril", "maio", "junho", "agosto" +
            "setembro", "outubro", "novembro", "dezembro"};

    //Construtor

    public Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diasTotal = dia + (mes*30) + (ano*365);
        /*this.mesExtenso = meses[mes - 1];
        if ( ( dia < 1 || dia > 31) || (mes < 1 || mes > 12 ) || (ano < 1 )){
            System.out.println("Data inválida");
        dia = 01;
        mes = 01;
        ano = 0001;
        }*/
    }

    //getters and setters
    public int getDia(){return dia;}

    public void setDia(int dia){this.dia = dia;}

    public int getDiasTotal(){return diasTotal;}

    public int getMes(){return mes;}

    public void setMes(int mes){this.mes = mes;}

    public String getMesExtenso(){return mesExtenso;}

    public int getAno(){return ano;}

    public void setAno(int ano){this.ano = ano;}


    //Métodos
    public int compara (Data data){
       if (this.getDiasTotal() > data.getDiasTotal()){
           return 1;
       }
       if (this.getDiasTotal() < data.getDiasTotal()){
           return -1;
       }
       return 0;
    }
    public boolean isBissexto(){
        if((this.getAno() % 4 == 0) || ((this.getAno() % 400 == 0) && (this.getAno() % 100 != 0))){
            return true;
        }
        return false;
    }

    public Data clonar (){
        Data clonada = new Data(this.getDia(), this.getMes(), this.getAno());
        return clonada;
    }
}
