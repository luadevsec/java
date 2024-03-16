package ordenador;

import java.util.Arrays;
import java.util.Scanner;

public class Binaria{
    public static void main(String[] args) {
        
        //cria um vetor com 100000 elementos
        int[] vetor = new int[100000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100000);
        }


        boolean troquei = false;
        do{
            troquei = false;
            //impressão da lista
            
            for (int i = 0; i < vetor.length-1; i++) {
                if (vetor[i] > vetor[i+1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    troquei = true;
                    
                }
            }
            System.out.println("tentativa de ordenamento");
        }while (troquei);



        //imprime o vetor
        
        int busca = 0, achei = 0, inicio = 0, fim = vetor.length - 1, meio = vetor.length/2;

        
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Digite o elemento a ser buscado: ");
            busca = sc.nextInt();

            while ( fim >= inicio ) {
                meio = inicio + (fim - inicio) / 2;

                if (vetor[meio] == busca) {
                    achei = meio;
                    break;
                }
                else if (vetor[meio] < busca) {
                    inicio = meio + 1;
                }
                else {
                    fim = meio - 1;
                }
            }
            if (achei == 0) System.out.println("O elemento " + busca + " não foi encontrado.");
            else System.out.println("O elemento " + achei + " foi encontrado");

        }while(busca != -99);




        //busca

        sc.close();


    }
}