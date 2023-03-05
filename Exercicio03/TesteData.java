import java.util.Scanner;
public class TesteData {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int dia;
        int mes;
        int ano;

        System.out.println("digite o dia, o mês e o ano desejado");
        dia = tec.nextInt();
        mes = tec.nextInt();
        ano = tec.nextInt();

        Data data1 = new Data(dia, mes, ano);
        System.out.println("Analisando os dados inseridos, descobrimos que a data é:");
        System.out.println( data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno());
        System.out.println("e o mês em extenso é: ");
        System.out.println ( data1.getMesExtenso());

        if(data1.isBissexto()){
            System.out.println("O ano é bissexto!");
        }else{
            System.out.println("O ano não é bissexto!");
        }

        if(data1.compara(data1.clonar()) == 0){
            System.out.println("As datas são iguais!\n");
        }

        System.out.println("Informe mais um dia, mês, data e ano!");
        System.out.print("Dia: ");
        dia = tec.nextInt();
        System.out.print("Mês: ");
        mes = tec.nextInt();
        System.out.print("Ano: ");
        ano = tec.nextInt();

        Data data2 = new Data(dia, mes, ano);
        System.out.println("Analisando os dados inseridos, descobrimos que a nova data é:");
        System.out.println( data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());
        System.out.println("e o mês em extenso é: ");
        System.out.println ( data2.getMesExtenso());


        if(data1.compara(data2) == 1){
            System.out.println("A data " + data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno() + "é maior que a data " +
                    data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());
        }
        else if (data1.compara(data2) == -1){
            System.out.println("A data " + + data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno() + " é maior que a data " +
                    data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno());
        } else{
            System.out.println("As datas são idênticas!");
        }
    }
}


