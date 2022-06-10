package br.edu.univas;

public class Questao2 {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--){
            String asterisco = "";
            for(int j = 0; j < i; j++){
               asterisco += "*";
            }
            System.out.println(asterisco);
        }
    }
}
