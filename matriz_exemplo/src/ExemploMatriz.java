public class ExemploMatriz {
    public static void main(String[] args) {
        // declara uma matriz com 10 linhas e 10 colunas
        int[][] m = new int[10][10];

        System.out.println("Sorteando números...");
                
        // preenche os 100 elementos da matriz com números de 1 a 9
        for(int n = 0; n < 10; n++) {
            for(int i = 0; i < 10; i++) {
                // sorteia um número de 1 a 9 e põe na linha l e na coluna c da matriz
                m[n][i] = (int)(Math.random()*9)+1;
            }
        }
        System.out.println("------------------------------");
        System.out.println("Matriz preenchida!");
        // exibe o conteúdo da matriz de várias formas
        System.out.println("Conteúdo de cada posição da matriz:");
        for(int n = 0; n < 10; n++) {
            for(int i = 0; i < 10; i++) {
                System.out.println("m["+n+"]["+i+"] = "+m[n][i]);
            }
        }
        System.out.println("Conteúdo da matriz completa:");
        for(int n = 0; n < 10; n++) {
            for(int i = 0; i < 10; i++) {
                System.out.print(m[n][i]+" ");
            }
            System.out.println();
        }
        System.out.print("Soma dos elementos da 5ª coluna: ");
        int somaColuna5 = 0;
        for(int n = 0; n < 10; n++) {
            somaColuna5 = somaColuna5 + m[n][4];
        }
        System.out.println(somaColuna5);
    }
}
