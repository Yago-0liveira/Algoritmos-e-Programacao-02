/*import java.io.*;

public class AulaArquivoTexto {
    public static void main(String[] args) {
        File arquivo = new File("teste.txt"); //cria o arquivo no disco com o nome teste.txt
        try{
            FileWriter fw = new FileWriter(arquivo);// abre o arquivo para escrita
            fw.write("antes de existir computador existia tevê\n" +
                    "antes de existir tevê existia luz elétrica\n" +
                    "antes de existir luz elétrica existia bicicleta\n" +
                    "antes de existir bicicleta existia enciclopédia\n" +
                    "antes de existir enciclopédia existia alfabeto\n" +
                    "antes de existir alfabeto existia a voz\n" +
                    "antes de existir a voz existia o silêncio "); // inseri texto no arquivo

            fw.close(); // fecha o arquivo
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
*/