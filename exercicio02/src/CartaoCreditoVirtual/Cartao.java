package CartaoCreditoVirtual;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Cartao {
    Scanner teclado = new Scanner(System.in);

    //Atributos
    private int numero;
    private int numeroCartao;
    private String titular;
    private double saldo;
    private String dataVencimento;
    private double limCredito;


    //Métodos Construtor
    public Cartao(int numero, String titular, double saldo, String dataVencimento, double limCredito){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.dataVencimento = dataVencimento;
        this.limCredito = limCredito;
    }

    //Sobrecarga
    public Cartao(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cartao(int numero, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }


    //Método de acesso a minha classe

    //Numero do cartão
    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    //Titular
    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    //Saldo
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //Data Vencimento
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataVencimento(){
        return this.dataVencimento;
    }

    //Limite de Credito
    public void setLimCredito(double limCredito){
        this.limCredito = limCredito;
    }

    public double getLimCredito(){
        return this.limCredito;
    }

    //Gerador Número de Cartão de Credito Automatico
    public int numeroCartao(){
        System.out.print("Número do cartão: ");
        for (int x = 0; x < 4; x++) {
            for(int y = 0; y < 4; y++){
                Random gerador = new Random();
                this.numeroCartao = gerador.nextInt(9);
                System.out.print(this.numeroCartao);
            }
            System.out.print(" ");
        }
        return numeroCartao;
    }

    //Informar o Titular do cartão
    public void informeTitular(){
        System.out.print("Informe o Titular do Cartão: ");
        this.titular = teclado.nextLine();
        setTitular(this.titular);
    }

    //Informar a Data de Vencimento
    public void informeDataVenvimento(){
        System.out.print("Informe a Data Vencimento: ");
        this.dataVencimento = teclado.nextLine();
        setDataVencimento(this.dataVencimento);
    }

    //Informar Limite de Crédito do Cartão
    public void informeLimCred(){
        System.out.print("Informe o Limite do Crédito: R$ ");
        this.limCredito = teclado.nextDouble();
        setLimCredito(this.limCredito);

    }

    //Imprimir
    public void imprimir(){

        System.out.println("Cartão Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo() + "\n");

        System.out.println();

        informeTitular();
        informeDataVenvimento();
        informeLimCred();

        System.out.println("\n");

        System.out.println("Resumo do seu Cartão de Credito Virtual \n");

        numeroCartao();

        System.out.println("");
        System.out.println("Titular: " + getTitular());
        System.out.println("Data de Vencimento: " + getDataVencimento());
        Locale.setDefault(Locale.US);
        System.out.printf("Limite de Credito: R$ %.2f%n", getLimCredito());
    }

}
