package ordenador;

import java.util.Arrays;
import java.util.Random;

public class Ordenador {

    public static void main(String[] args) {

        double array2[] = Gerador.gerarDouble(100000, 0.00, 200.00);
        System.out.println(Arrays.toString(Ordenador.BubbleSort(array2)));




    }







    // Insertion sort para todos os tipos

    public static int[] InsertionSort(int[] list) {
        for (int index = 1; index < list.length; index++) {
            int key = list[index];
            int j = index - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        return list;

    }

    public static double[] InsertionSort(double[] list) {
        for (int index = 1; index < list.length; index++) {
            double key = list[index];
            int j = index - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        return list;
    }

    public static char[] InsertionSort(char[] list) {
        for (int index = 1; index < list.length; index++) {
            char key = list[index];
            int j = index - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        return list;
    }

    public static String[] InsertionSort(String[] list) {
        for (int index = 1; index < list.length; index++) {
            String key = list[index];
            int j = index - 1;
            while (j >= 0 && list[j].compareTo(key) > 0) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        return list;
    }






    // Bubble sort para todos os tipos
    public static int[] BubbleSort(int[] list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int index = 0; index < list.length - 1; index++) {
                if (list[index] > list[index + 1]) {
                    int temp = list[index];
                    list[index] = list[index + 1];
                    list[index + 1] = temp;
                    swap = true;
                }
            }
        }
        return list;
    }

    public static double[] BubbleSort(double[] list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int index = 0; index < list.length - 1; index++) {
                if (list[index] > list[index + 1]) {
                    double temp = list[index];
                    list[index] = list[index + 1];
                    list[index + 1] = temp;
                    swap = true;
                }
            }
        }
        return list;
    }

    public static char[] BubbleSort(char[] list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int index = 0; index < list.length - 1; index++) {
                if (list[index] > list[index + 1]) {
                    char temp = list[index];
                    list[index] = list[index + 1];
                    list[index + 1] = temp;
                    swap = true;
                }
            }
        }
        return list;
    }

    public static String[] BubbleSort(String[] list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int index = 0; index < list.length - 1; index++) {
                if (list[index].compareTo(list[index + 1]) > 0) {
                    String temp = list[index];
                    list[index] = list[index + 1];
                    list[index + 1] = temp;
                    swap = true;
                }
            }
        }
        return list;
    }
}
