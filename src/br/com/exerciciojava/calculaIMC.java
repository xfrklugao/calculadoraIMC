package br.com.exerciciojava;

import java.util.Scanner;

public class calculaIMC {
    public static void main(String[] args) {
        System.out.println("Calculando IMC:");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();
        double imc = peso/(altura*altura);
        System.out.println("IMC: " + imc);
    }


}
