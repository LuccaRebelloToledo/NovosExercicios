package br.edu.univas;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vendas = 0, valor = 0;
        float[] valoresVendas = new float[150];
        float mediaVendas = 0, minVendas, maxVendas;

        do {
                for(int i = 0; i < valoresVendas.length; i++){
                    System.out.println("Por favor, digite o valor da venda: ");
                    valor = scanner.nextInt();
                    if(valor < 0) break;
                    else {
                        valoresVendas[i] = valor;
                        vendas++;
                    }
                }
        } while (valor > 0);

        for(int i = 0; i < vendas - 1; i++) {
            boolean estaOrdenado = true;
            for(int j = 0; j < vendas - 1 - i; j++) {
                if(valoresVendas[j] > valoresVendas[j + 1]) {
                    float aux = valoresVendas[j];
                    valoresVendas[j] = valoresVendas[j + 1];
                    valoresVendas[j + 1] = aux;
                    estaOrdenado = false;
                }
            }
            if(estaOrdenado) break;
        }

        minVendas = valoresVendas[0];
        maxVendas = valoresVendas[vendas - 1];

        for (float valoresVenda : valoresVendas) {
            mediaVendas += valoresVenda;
        }
        mediaVendas = mediaVendas / vendas;

        System.out.printf("O menor preço das vendas foi: R$ %.2f", minVendas);
        System.out.println();
        System.out.printf("O maior preço das vendas foi: R$ %.2f", maxVendas);
        System.out.println();
        System.out.printf("O preço médio das vendas foi: R$ %.2f", mediaVendas);
        System.out.println();
        System.out.println("O total de vendas foi: " + vendas);
    }
}
