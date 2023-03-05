import java.util.ArrayList;
import javax.swing.*;

public class DeliciasApp {

    public static String menu() {
        return " Escolha uma opção:\n" +
                "1 - Cadastrar produto\n" +
                "2 - Vender produto\n" +
                "3 - Calcular valor da venda\n" +
                "4 - Atualizar estoque\n"; //comprar de produtos pela lanchonete+"0 - sair";

    }
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        int op;
        double vendaTotal = 0;
        op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        while(op != 0){
            switch(op){
                case 1: {
                    Produto p = new Produto();
                    p.nome = JOptionPane.showInputDialog("insira o nome do produto");
                    p.tipo = JOptionPane.showInputDialog("Insira o tipo do produto");
                    p.valorAd = Integer.parseInt(JOptionPane.showInputDialog("Valor de compra"));
                    p.quantidadeE = Integer.parseInt(JOptionPane.showInputDialog("Quantidade comprada"));
                    p.descrição = JOptionPane.showInputDialog("Descrição do produto");
                    produtos.add(p);
                    break;
                }

                case 2: {
                String nomeprodut = JOptionPane.showInputDialog("Qual produto deseja vender ? ");
                    for (int i = 0; i < produtos.size(); i++){
                        if (produtos.get(i).nome.contains(nomeprodut)){
                            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos voce deseja vender?"));
                                if (produtos.get(i).vendaProduto(quantidade)){
                                    vendaTotal += produtos.get(i).calculaVenda(quantidade);
                                }

                        }

                    }
                    break;
                        }
                case 3: {
                    JOptionPane.showMessageDialog(null, "O valor da venda foi de: " + vendaTotal);
                    break;
                }

                case 4: {
                        int counter = 0;
                        String nomeProduto = JOptionPane.showInputDialog("Qual produto deseja comprar?");
                        for(int i = 0; i < produtos.size(); i++) {
                            if (produtos.get(i).nome.contains(nomeProduto)) {
                                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quaantidade deseja: "));
                                produtos.get(i).compraProduto(quantidade);
                                counter++;
                                break;
                            }
                        }
                        if (counter == 0){
                            JOptionPane.showMessageDialog(null, "Produto nao encontrado");
                        }
                        break;
                    }

                    default:{
                        JOptionPane.showMessageDialog(null, "Opcao invalida");
                    }

                }
                op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
            }

            System.out.println("Produtos: ");
            for(int i = 0; i < produtos.size(); i++) {
                System.out.println(produtos.get(i).nome);
            }
                }



                    }



        

