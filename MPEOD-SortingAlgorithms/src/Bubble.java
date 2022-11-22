public class Bubble {
    
    static void printArray(int[] args) {
        System.out.print("[");
        for(int i : args) {
            System.out.print(i);
            System.out.print(',');
        }
        System.out.print("]" + "\n");
    }

    static void bubbleSort(int[] args) { //----> O(n^2)

        boolean sorted = false;

        while(!sorted) { //enquanto nao estiver ordenado, repete o loop
            sorted = true; //assume que estara ordenado, muda se nao estiver
            for (int i=0; i < args.length -1; i++) {
                if (args[i] > args[i+1]) { //se o valor atual for maior que o proximo, troca os valores
                    sorted = false;
                    int temp = args[i];
                    args[i] = args[i+1];
                    args[i+1] = temp;
                }
            }
        }
    }

    static void recursiveBubbleSort(int[] args, int length) {

        if (args.length == 1) { //se tiver tamanho 1, retorna
            return;
        }

        int swaps = 0; //contador de troca de valores

        for(int i=0; i<length-1; i++) { //troca valores caso o proximo seja maior
            if(args[i] > args[i+1]) {
                int temp = args[i];
                args[i] = args[i+1];
                args[i+1] = temp;
                swaps += 1;
            }
        }

        if (swaps == 0) { //se nao foi necessario trocar valores, retorna
            return;
        }

        recursiveBubbleSort(args, length - 1); //realiza a funcao do while loop de forma recursiva
        
    }

    public static void main (String[] args) {
        int[] vetorTeste1 = {3,6,8,1,4,9,0};
        int[] vetorTeste2 = {0,0,3,5,7,81,-4,-99,13,1};
        int[] vetorTeste3 = {2,14,8,5,1,2,0,33,7,-1};

        System.out.println("Array nao ordenado:");
        printArray(vetorTeste1);
        recursiveBubbleSort(vetorTeste1, vetorTeste1.length);
        System.out.println("Array ordenado:");
        printArray(vetorTeste1);
        
        System.out.println("Array nao ordenado:");
        printArray(vetorTeste2);
        recursiveBubbleSort(vetorTeste2, vetorTeste2.length);
        System.out.println("Array ordenado:");
        printArray(vetorTeste2);

        System.out.println("Array nao ordenado:");
        printArray(vetorTeste3);
        recursiveBubbleSort(vetorTeste3, vetorTeste3.length);
        System.out.println("Array ordenado:");
        printArray(vetorTeste3);

        System.out.println("Arrays ordenados com Bubble!");
    }
}