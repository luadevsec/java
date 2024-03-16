package ordenador;

import java.util.Arrays;
import java.util.Random;

public class RandomSort extends Thread {
    private static int[] list;

    public RandomSort(int[] list) {
        RandomSort.list = list;
    }

    @Override
    public void run() {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int index = 0; index < list.length - 1; index++) {
                if (list[index] > list[index + 1]) {
                    sorted = false;
                    adjust(index);
                }
            }
        }
    }

    private synchronized void adjust(int index) {
        if (index > 0 && list[index] < list[index - 1]) {
            int aux = list[index];
            list[index] = list[index - 1];
            list[index - 1] = aux;
        }
        if (index < list.length - 1 && list[index] > list[index + 1]) {
            int aux = list[index];
            list[index] = list[index + 1];
            list[index + 1] = aux;
        }
    }

    public int[] randomSort() {
        boolean arrumado = false;

        while (!arrumado) {
            arrumado = true;

            // Verificação se a lista está ordenada
            for (int index = 0; index < list.length - 1; index++) {
                if (list[index] > list[index + 1]) {
                    arrumado = false;
                    adjust(index);
                }
            }

            int cores = 8;
            Thread[] threads = new Thread[cores];

            for (int i = 0; i < cores; i++) {
                threads[i] = new RandomSort(Arrays.copyOf(list, list.length));
                threads[i].start();
            }

            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        return list;
    }


    public static void main(String[] args) {
        int[] array = Gerador.gerarInt(2000000, 1, 1000);

        RandomSort randomSort = new RandomSort(array);
        int[] sortedArray = randomSort.randomSort();

        System.out.println("Array ordenado: " + Arrays.toString(sortedArray));
    }
}
