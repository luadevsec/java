package ordenador;

import java.util.Random;

public class Gerador {

    private static final Random random = new Random();

    public static int[] gerarInt(int tamanho, int min, int max) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(max - min) + min;
        }
        return vetor;
    }

    public static double[] gerarDouble(int tamanho, double min, double max) {
        double[] vetor = new double[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextDouble() * (max - min) + min;
        }
        return vetor;
    }

    public static char[] gerarChar(int tamanho) {
        char[] vetor = new char[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (char) (random.nextInt(26) + 'A');
        }
        return vetor;
    }

    public static String[] gerarString(int tamanho, int comprimento) {
        String[] vetor = new String[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerarStringAleatoria(comprimento);
        }
        return vetor;
    }

    private static String gerarStringAleatoria(int comprimento) {
        StringBuilder sb = new StringBuilder(comprimento);
        for (int i = 0; i < comprimento; i++) {
            sb.append((char) (random.nextInt(26) + 'A'));
        }
        return sb.toString();
    }
}
