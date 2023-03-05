import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TestarAnimais {
    public static String Menu(){
    return "Opções: \n" +
    "1 - Cadastrar Animal\n" +
    "2 - Cadastrar Peixe\n" +
    "3 - Cadastrar Mamifero \n" +
    "4 - Listar todos os animais \n" +
    "0 - encerrar programa ";
    }
    public static void main (String[]args){
    int opcoes = Integer.parseInt(JOptionPane.showInputDialog(Menu()));
        List <Animal> animais = new ArrayList<>();
        while(opcoes != 0){
            switch (opcoes){

                case 1: {
                    Animal animal = new Animal();
                    animal.setNome (JOptionPane.showInputDialog("Digite o nome do animal"));
                    animal.setComprimento( Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do animal")));
                    animal.setNumeroDePatas( Integer.parseInt(JOptionPane.showInputDialog("Digite o número de patas do animal")));
                    animal.setCor( JOptionPane.showInputDialog("Digite a cor do animal"));
                    animal.setAmbiente (JOptionPane.showInputDialog("Digite o ambiente deste animal"));
                    animal.setVelocidadeMedia( Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média deste animal")));
                    animais.add(animal);
                    JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");
                    break;
                }
                case 2: {
                    Peixe peixe = new Peixe();
                    peixe.setNome (JOptionPane.showInputDialog("Digite o nome do animal"));
                    peixe.setComprimento( Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do animal")));
                    peixe.setNumeroDePatas( Integer.parseInt(JOptionPane.showInputDialog("Digite o número de patas do animal")));
                    peixe.setCor( JOptionPane.showInputDialog("Digite a cor do animal"));
                    peixe.setAmbiente (JOptionPane.showInputDialog("Digite o ambiente deste animal"));
                    peixe.setVelocidadeMedia( Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média deste animal")));
                    peixe.setCaracteristica(JOptionPane.showInputDialog("Digite a característica do peixe"));
                    animais.add(peixe);
                    JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");
                    break;
                }
                case 3: {
                    Mamifero mamifero = new Mamifero();
                    mamifero.setNome (JOptionPane.showInputDialog("Digite o nome do animal"));
                    mamifero.setComprimento( Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento do animal")));
                    mamifero.setNumeroDePatas( Integer.parseInt(JOptionPane.showInputDialog("Digite o número de patas do animal")));
                    mamifero.setCor( JOptionPane.showInputDialog("Digite a cor do animal"));
                    mamifero.setAmbiente (JOptionPane.showInputDialog("Digite o ambiente deste animal"));
                    mamifero.setVelocidadeMedia( Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média deste animal")));
                    mamifero.setAlimento(JOptionPane.showInputDialog("O que o mamífero come ?"));
                    animais.add(mamifero);
                    JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso! numero do cadastro: ");

                    break;
                }
                case 4: {
                    String animals = "";
                    for (int i = 0; i < animais.size(); i++) {
                        animals += animais.get(i).toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, animais);

                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }

            }
            opcoes = Integer.parseInt(JOptionPane.showInputDialog(Menu()));
        }
    }
}
