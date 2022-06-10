package br.edu.univas;

import java.util.Arrays;
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

        Arrays.sort(valoresVendas);
        System.out.println(Arrays.toString(valoresVendas));
        minVendas = valoresVendas[valoresVendas.length - vendas];
        maxVendas = valoresVendas[valoresVendas.length - 1];

        for (float valoresVenda : valoresVendas) {
            mediaVendas += valoresVenda;
        }
        mediaVendas = mediaVendas / vendas;

        System.out.printf("O valor da menor venda foi: R$ %.2f", minVendas);
        System.out.println();
        System.out.printf("O valor da maior venda foi: R$ %.2f", maxVendas);
        System.out.println();
        System.out.printf("O preço médio das vendas foi: R$ %.2f", mediaVendas);
        System.out.println();
        System.out.println("O total de vendas foi: " + vendas);
    }
}
