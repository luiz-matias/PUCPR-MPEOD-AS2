public class Selection {

    static void printArray(int[] args) {
        System.out.print("[");
        for(int i : args) {
            System.out.print(i);
            System.out.print(',');
        }
        System.out.print("]" + "\n");
    }
    
    static void selectionSort(int[] args) { // ----> O(n^2)
        
        if (args.length == 1) {
            return;
        }

        for(int i = 0; i < args.length; i++) {
            int min = args[i]; 
            int copyIndex = i;

            for (int j = i+1; j < args.length; j++) {
                if (min > args[j]) { //se o valor minimo eh maior que qualquer outro valor, ele assume o menor valor encontrado
                    min = args[j];
                    copyIndex = j; //copie o index do valor trocado
                }
            }

            int temp = args[i]; 
            args[i] = min; //coloca o menor valor sempre no inicio
            args[copyIndex] = temp; //troca o antigo valor com o index copiado
        }
    }
    
    public static void main (String[] args) {
        int[] vetorTeste1 = {3,6,8,1,4,9,0};
        int[] vetorTeste2 = {0,0,3,5,7,81,-4,-99,13,1};
        int[] vetorTeste3 = {2,14,8,5,1,2,0,33,7,-1};

        System.out.println("Array nao ordenado:");
        printArray(vetorTeste1);
        selectionSort(vetorTeste1);
        System.out.println("Array ordenado:");
        printArray(vetorTeste1);

        System.out.println("Array nao ordenado:");
        printArray(vetorTeste2);
        selectionSort(vetorTeste2);
        System.out.println("Array ordenado:");
        printArray(vetorTeste2);

        System.out.println("Array nao ordenado:");
        printArray(vetorTeste3);
        selectionSort(vetorTeste3);
        System.out.println("Array ordenado:");
        printArray(vetorTeste3);

        System.out.println("Arrays ordenados com Selection!");
    }
}