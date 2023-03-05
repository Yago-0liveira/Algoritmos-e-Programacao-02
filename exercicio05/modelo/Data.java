package modelo;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    private String mesExtenso;
    private int diasTotal;
    private String[] meses = new String[]{"Janeiro", "Fevereiro", "Marco", "Abril", "Maio",
            "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};



    public Data(int dia, int mes, int ano){

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diasTotal = dia + (mes * 30) + (ano * 365);
        this.mesExtenso = meses[mes - 1];

        if((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || (ano < 1)){
            System.out.println("Data invalida");
            this.dia = 01;
            this.mes = 01;
            this.ano = 0001;
        }

    }


    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public String getMesExtenso(){
        return mesExtenso;
    }

    public int getDiasTotal(){
        return diasTotal;
    }


    public int compara(Data data){
        if(this.getDiasTotal() > data.getDiasTotal()){
            return 1;
        } else if (this.getDiasTotal() < data.getDiasTotal()) {
            return -1;
        }
        return 0;
    }

    public boolean isBissexto(){
        if((this.getAno() % 400 == 0) || ((this.getAno() % 4 == 0) && (this.getAno() % 100 != 0))){
            return true;
        }
        return false;
    }

    public Data clonar(){
        Data clonado = new Data(this.getDia(), this.getMes(), this.getAno());
        return clonado;
    }
}
