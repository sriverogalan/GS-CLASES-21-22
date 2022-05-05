package exercices.toni_profe;

public class OrderBy {

    public static int[] selection(int[] array){
        for (int i = 0 ; i < array.length; i++){
            int index = i;

            for (int j = i + 1 ; j < array.length ; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int numPetit = array[index];
            array[index] = array[i];
            array[i] = numPetit;
        }
        return array;
    }

    public static int[] insertion(int[] array){
        for (int i = 0 ; i < array.length; i++){
          int key = array[i];
          int j = i - 1;
          while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j = j - 1;
          }
          array[j + 1] = key;
        }
        return array;
    }

    public static void imprimirArray(int[] array){
        System.out.println("IMPRIMIR ARRAY");
        int counter = 0;
        for (int i = 0 ; i < array.length ; i++){
            System.out.println("Posicion " + counter++ + " -> "+ array[i]);
        }
    }
}
