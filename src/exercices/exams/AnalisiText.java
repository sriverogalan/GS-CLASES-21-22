package exercices.exams;


public class AnalisiText {
    public static String provaExecucio = "Una noia anomenada Anna va anar a cercar al b)osc un home, alla hi va trobar un cec que intentava trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";
    public static char[] delimitadors = new char[] {' ','-',',','.','!','?'};
    public static String hola = "helloworld";

    public static char[] exercice2(){
      String string = provaExecucio.toLowerCase();
      char[] fraseCaracter = new char[string.length()];

      for (int i = 0; i < string.length(); i++){
        fraseCaracter[i] = string.charAt(i);
      }
      return fraseCaracter;
    }

    public static void imprimirChars(char[] fraseCaracter){
      for (int i = 0 ; i < fraseCaracter.length; i++){
        System.out.print(fraseCaracter[i]);
      }
    }

    public static boolean siConteDelimitadors(char[] fraseCaracter){
      for (int i = 0 ; i < fraseCaracter.length; i++){
        for (int j = 0 ; j < delimitadors.length; j++){
          if (fraseCaracter[i] == delimitadors[j]){
            return true;
          }
        }
      }
      return false;
    }

    public static boolean esIniciDeParaula(int index, char[] fraseCaracter){
      if (index == 0){
        return false;
      }
      for (int i = 0 ; i < fraseCaracter.length; i++){
        if (fraseCaracter[i] == fraseCaracter[index-1]){
          for (int j = 0 ; j < delimitadors.length; j++){
            if (fraseCaracter[i] == delimitadors[j]){
              return true;
            }
          }
        }
      }
      return false;
    }

    public static int longitudParaula(int posicioParaula, char[] fraseCaracter){
      int counter=0;
      boolean isDelimited = false;

      for (int i = posicioParaula; i < fraseCaracter.length; i++){

        for (int j = 0 ; j < delimitadors.length; j++){
          if (fraseCaracter[i] == delimitadors[j]) {
            isDelimited = true;
            break;
          }
        }

        if (isDelimited){
          break;
        }
        counter++;
      }
      if (counter > 0){
        return counter;
      }
      return -1;
    }

  public static void imprimirUnaParaula(int posicioParaula, char[] fraseCaracter){
    boolean isDelimited = false;

    for (int i = posicioParaula; i < fraseCaracter.length; i++){

      for (int j = 0 ; j < delimitadors.length; j++){
        if (fraseCaracter[i] == delimitadors[j]){
          isDelimited = true;
        }
      }
      if (isDelimited){
        break;
      }
      System.out.print(fraseCaracter[i]);
    }
  }

  public static boolean isPalindrome(String fraseCaracter){
    boolean isPalindrome = true;
    for (int i = 0; i < fraseCaracter.length(); i++){
        if (fraseCaracter.charAt(i) != fraseCaracter.charAt(fraseCaracter.length() - i - 1 )){
          isPalindrome = false;
          break;
        }
    }
    return isPalindrome;
  }

  public static int numeroDeParaulesPalindromes(char[] fraseCaracter){
    int count = 0;
    String string = "";
    for (int i = 0; i < fraseCaracter.length; i++){
      if (esIniciDeParaula(i,fraseCaracter)){
        string += i;
        if (isPalindrome(string)){
          count++;
          string = "";
        }
      }
    }
    return count;
  }


  public static String[] indicaPalindromes(char[] fraseCaracter){
    String[] string = new String[0];
    for (int i = 0; i < fraseCaracter.length; i++){

    }
    return string;
  }

  public static int[] invertirArray(int[] matriu){
    int[] array = new int[matriu.length];
    for (int i = 0 ; i < matriu.length; i++) {
      array[i] =matriu[matriu.length-1-i];
    }
    return array;
  }

  public static String[] ordenacioStringLong(String[] matriu){
      String var = matriu[0];
      int contador = 0;
      for (int i = 0 ; i < matriu.length; i++) {
         if (matriu[i].length() > matriu[contador+1].length()){

         }
        if (contador < matriu.length-1){
          contador++;
        }
      }
    return matriu;
  }






}
