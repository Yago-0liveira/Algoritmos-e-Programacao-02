    import javax.swing.JOptionPane;
import java.util.ArrayList;

    public class Lanchonete {
        public static String menu(){
            return "Escolha uma opcao: \n" +
                    "1 - Cadastrar produto\n" +
                    "2 - Calcular o valor da venda\n" +
                    "3 - Vender produto\n" +
                    "4 - Atualizar o estoque\n" +
                    "5 - Checar estoque\n" +
                    "0 - sair";
        }

        public static void main(String[] args){
            ArrayList<Produto> produtos = new ArrayList<Produto>();
            int opcoes;
            double vendaT = 0;
            opcoes = Integer.parseInt(JOptionPane.showInputDialog(menu()));
            while(opcoes != 0){
                switch(opcoes){
                    case 1:{
                        JOptionPane.showMessageDialog(null,"");
                        String nome = JOptionPane.showInputDialog("Nome do produto: ");
                        String descricao = JOptionPane.showInputDialog("Descricao do produto: ");
                        int estoque = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em estoque:"));
                        String tipo = JOptionPane.showInputDialog("Tipo do produto: ");
                        double valorDeCompra = Double.parseDouble(JOptionPane.showInputDialog("Valor de compra do produto:"));
                        Produto p = new Produto(nome, descricao, tipo, estoque, valorDeCompra);
                        produtos.add(p);
                        break;
                    }

                    case 2:{

                        JOptionPane.showMessageDialog(null, "O valor total das ultimas vendas foi de " +
                                "R$ " + vendaT);

                        vendaT = 0;
                        break;

                    }
                    case 3:{
                        String nomeProduto = JOptionPane.showInputDialog("Qual produto será vendido? ");
                        for(int i = 0; i < produtos.size(); i++){
                            if (produtos.get(i).getNome().contains(nomeProduto)){
                                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos voce deseja vender esse produto?"));
                                if (produtos.get(i).vendaProduto(quantidade)){
                                    vendaT += produtos.get(i).calculaVenda(quantidade);
                                }

                            }

                        }
                        break;
                    }

                    case 4:{
                        int counter = 0;
                        String nomeProduto = JOptionPane.showInputDialog("Qual produto será comprado? ");
                        for(int i = 0; i < produtos.size(); i++) {
                            if (produtos.get(i).getNome().contains(nomeProduto)) {
                                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas unidades você deseja comprar?"));
                                produtos.get(i).compraProduto(quantidade);
                                counter++;
                                break;
                            }
                        }
                        if (counter == 0){
                            JOptionPane.showMessageDialog(null, "Sentimos muito, o produto nao foi possivel encotrar o produto");
                            JOptionPane.showMessageDialog(null, "verifique o nome do produto e tente novamente");
                        }
                        break;
                    }

                    case 5:{
                        System.out.println("Produtos: ");
                        for(int i = 0; i < produtos.size(); i++) {
                            System.out.println(produtos.get(i).getNome());
                        }
                        break;
                    }

                    default:{
                        JOptionPane.showMessageDialog(null, "Opcao invalida, tente novamente");
                    }

                }
                opcoes = Integer.parseInt(JOptionPane.showInputDialog(menu()));
            }
        }
    }