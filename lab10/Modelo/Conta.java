package Modelo;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Conta {
    private int numero;
    private int contnumero = 0;
    private double saldo;
    private String cliente;

    public Conta() {
        this.numero = contnumero++;
        this.saldo = 0;
    }

    public Conta( String cliente, double saldo) {
        this.numero = contnumero++;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = contnumero++;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Numero: " + numero +
                "\nSaldo: " + saldo;
    }

    public void armazenarConta() {
        File arquivo = new File("Conta.txt");
        try {
            FileWriter armazena = new FileWriter(arquivo, true);
            armazena.write(  getCliente() + "\t");
            armazena.write(  getNumero() + "\t");
            armazena.write(  getSaldo() + "\t");
            armazena.write('\n');
            armazena.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();

        }

    }
}
