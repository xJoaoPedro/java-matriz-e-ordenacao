import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrizHandler {
    int[][] matriz;
    Scanner scan = new Scanner(System.in);

    // construtor inicia com os numeros do usuario
    public MatrizHandler(int linhas, int colunas) {
        matriz = new int[linhas][colunas];
    }

    public void preencherManual() {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                System.out.println("Digite o valor para o item " + i + "x" + j + ":");
                this.matriz[i][j] = this.scan.nextInt();
            }
        }
    }

    public void preencherAuto() {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                this.matriz[i][j] = new Random().nextInt(100) + 1;
            }
        }
    }

    public void inserirValor() {
        printarMatriz();
        System.out.println("Digite o numero da linha");
        int linha = scan.nextInt();
        // verificador para o valor da linha
        while (linha < 0 || linha >= this.matriz.length) {
            System.out.println("Linha inexistente, digite uma linha entre 0 e " + (this.matriz.length - 1));
            linha = scan.nextInt();
        }

        System.out.println("Digite o numero da coluna");
        int coluna = scan.nextInt();
        // verificador para o valor da coluna
        while (coluna < 0 || coluna >= this.matriz[0].length) {
            System.out.println("Coluna inexistente, digite uma coluna entre 0 e " + (this.matriz[0].length - 1));
            coluna = scan.nextInt();
        }

        System.out.println("Digite o valor novo:");
        int valor = scan.nextInt();
        while (valor < 0 || valor > 100) {
            System.out.println("Valor inválido, digite outro:");
            valor = scan.nextInt();
        }


        this.matriz[linha][coluna] = valor;
        System.out.println("Valor adicionado com sucesso!");
    }

    // considerei remover como tranformar em 0 por ser uma matriz de inteiros
    public void removerValor() {
        printarMatriz();
        System.out.println("Digite o numero da linha");
        int linha = verificaValor("linha", this.scan.nextInt());

        System.out.println("Digite o numero da coluna");
        int coluna = verificaValor("coluna", this.scan.nextInt());

        this.matriz[linha][coluna] = 0;
        System.out.println("Valor removido com sucesso!");
    }

    // metodo de exibicao da matriz
    public void printarMatriz() {
        String colunas = "    ";

        for (int i = 0; i < this.matriz[0].length; i++) {
            colunas += i + "   ";
        }

        System.out.println(colunas);
        for (int i = 0; i < this.matriz.length; i++) {
            System.out.println(i + " " + Arrays.toString(this.matriz[i]));
        }
    }

    public int verificaValor(String posicao, int valor) {

        if (posicao == "linha") {
            while (valor < 0 || valor >= this.matriz.length) {
                System.out.println("Linha inexistente, digite uma linha entre 0 e " + (this.matriz.length - 1));
                valor = scan.nextInt();
            }
            return valor;
        }

        while (valor < 0 || valor >= this.matriz[0].length) {
            System.out.println("Coluna inexistente, digite uma coluna entre 0 e " + (this.matriz[0].length - 1));
            valor = scan.nextInt();
        }
        return valor;
    }
}