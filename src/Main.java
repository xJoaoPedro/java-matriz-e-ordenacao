import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Instância da matriz com tamanho coletado do usuário
        System.out.println("Digite o numero de LINHAS da matriz:");
        int numLinhas = scan.nextInt();
        System.out.println("Digite o numero de COLUNAS da matriz:");
        int numColunas = scan.nextInt();
        MatrizHandler minhaMatriz = new MatrizHandler(numLinhas, numColunas);

        // FUNCIONANDO PREENCHER
        //minhaMatriz.preencherManual();
        //minhaMatriz.preencherAuto();

        // FUNCIONANDO INSERIR
        //minhaMatriz.inserirValor();
        //minhaMatriz.printarMatriz();

        // FUNCIONANDO REMOVER
        //minhaMatriz.removerValor();
        //minhaMatriz.printarMatriz();

        // FUNCIONANDO ORDENACOES
        //minhaMatriz.ordenarCompleta();
        //minhaMatriz.ordenarPorLinha();
        //minhaMatriz.ordenarPorColuna();
    }
}