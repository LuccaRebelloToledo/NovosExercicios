package br.edu.univas;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[25];
        int aux, contador = 0;
        int porcentagem;
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Por favor digite um número: ");
            aux = scanner.nextInt();
            if(aux < 0){
                numbers[i] = 100;
                contador++;
            } else {
                numbers[i] = aux;
            }
        }
        porcentagem = ((contador * 100) / numbers.length);
        System.out.println("A quantidade de números substituidos é: " + contador);
        System.out.println("Com uma porcentagem de: " + porcentagem + "%");
    }
}
