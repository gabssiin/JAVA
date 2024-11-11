/* import java.util.Arrays;
import java.util.Random;
import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;

public class Main {

    public static void main(String[] args) {

        String[] nomesAlgoritmos = {"Bubble Sort", "Insertion Sort", "Selection Sort"};

        for (String nomeAlgoritmo : nomesAlgoritmos) {
            executarEGerarGrafico(nomeAlgoritmo);
        }
    }

    public static void executarEGerarGrafico(String nomeAlgoritmo) {
        System.out.println("\nExecutando " + nomeAlgoritmo);
        long[] tempos = new long[0];
        double[] tamanhos = new double[0];

        int tamanho = 10;
        while (true) {
            long tempoExecucao = 0;
            int[] vetorAleatorio = gerarVetorAleatorio(tamanho);

            switch (nomeAlgoritmo) {
                case "Bubble Sort":
                    tempoExecucao = bubbleSort(Arrays.copyOf(vetorAleatorio, tamanho));
                    break;
                case "Insertion Sort":
                    tempoExecucao = insertionSort(Arrays.copyOf(vetorAleatorio, tamanho));
                    break;
                case "Selection Sort":
                    tempoExecucao = selectionSort(Arrays.copyOf(vetorAleatorio, tamanho));
                    break;
            }

            if (tempoExecucao > 300000) { // 5 minutos
                if (tamanho <= 10) break;
                tamanho /= 2;
                System.out.println("Tempo limite excedido. Reduzindo para " + tamanho);
                continue;
            }

            tempos = Arrays.copyOf(tempos, tempos.length + 1);
            tempos[tempos.length - 1] = tempoExecucao;
            tamanhos = Arrays.copyOf(tamanhos, tamanhos.length + 1);
            tamanhos[tamanhos.length - 1] = tamanho;

            System.out.println("Tamanho: " + tamanho + ", Tempo: " + tempoExecucao + "ms");

            tamanho *= 10;
            if (tamanho > 10000000) break;
        }

        gerarGrafico(nomeAlgoritmo, tamanhos, tempos);
    }

    public static long bubbleSort(int[] vetor) {
        long inicioTempo = System.nanoTime();
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo) / 1000000;
    }

    public static long insertionSort(int[] vetor) {
        long inicioTempo = System.nanoTime();
        int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo) / 1000000;
    }

    public static long selectionSort(int[] vetor) {
        long inicioTempo = System.nanoTime();
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = temp;
        }
        long fimTempo = System.nanoTime();
        return (fimTempo - inicioTempo) / 1000000;
    }


    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random aleatorio = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = aleatorio.nextInt(tamanho);
        }
        return vetor;
    }



    public static void gerarGrafico(String nomeAlgoritmo, double[] xData, long[] yData) {
        XYChart grafico = new XYChartBuilder().width(800).height(600).title(nomeAlgoritmo)
                .xAxisTitle("Tamanho do Vetor").yAxisTitle("Tempo (ms)").build();

        grafico.getStyler().setXAxisLogarithmic(true);
        grafico.getStyler().setLegendPosition(Styler.LegendPosition.InsideNE);
        grafico.getStyler().setDefaultSeriesRenderStyle(XYSeries.XYSeriesRenderStyle.Line);

        grafico.addSeries("Tempo", xData, Arrays.stream(yData).asDoubleStream().toArray());

        try {
            BitmapEncoder.saveBitmap(grafico, "./" + nomeAlgoritmo + "_grafico", BitmapEncoder.BitmapFormat.PNG);
            System.out.println("Gráfico salvo como " + nomeAlgoritmo + "_grafico.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} */