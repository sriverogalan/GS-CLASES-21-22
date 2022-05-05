package exercices.exams;

public class AnalisiMatrius {

  public float mitjaAritmetica(int[] matriu) {
    int total = 0;
    float mitja = 0;

    for (int i = 0; i < matriu.length; i++) {
      total += matriu[i];
    }

    mitja = total / matriu.length;

    return mitja;
  }

  public int minim(int[] matriu) {
    int min = matriu[0];

    for (int i = 0; i < matriu.length; i++) {
      if (matriu[i] < min) {
        min = matriu[i];
      }
    }
    return min;
  }


  public int llocMinim(int[] matriu) {
    int min = matriu[0];
    int lloc = 0;

    for (int i = 0; i < matriu.length; i++) {
      if (matriu[i] < min) {
        min = matriu[i];
        lloc = i;
      }
    }

    return lloc;
  }

  public int maxim(int[] matriu) {
    int max = matriu[0];

    for (int i = 0; i < matriu.length; i++) {

      if (matriu[i] > max) {
        max = matriu[i];
      }
    }

    return max;
  }

  public int llocMaxim(int[] matriu) {
    int max = matriu[0];
    int lloc = 0;

    for (int i = 0; i < matriu.length; i++) {

      if (matriu[i] > max) {
        max = matriu[i];
        lloc = i;
      }
    }

    return lloc;
  }



  public int[] invertirArray(int[] matriu){
    int contador = 0;
    int temp = 0;
    for (int i = matriu.length ; 0 < i ; i--){
       temp = matriu[contador];
       matriu[contador] = matriu[i];
       matriu[i] = temp;
    }

    return matriu;
  }


  public int cercarPrimeraOcurrenciaMatriu( int[] matriu, int n){

    for ( int i = 0 ; i < matriu.length ; i++) {
      if ( matriu[i] == n )
        return i;
    }

    return -1;
  }


  public int cercarDarreraOcurrenciaMatriu( int[] matriu, int n){

    for ( int i = matriu.length - 1 ; i >= 0 ; i--) {
      if ( matriu[i] == n )
        return i;
    }

    return -1;

  }

  ////////////////////////////////////////////////////////////////////

  public boolean ordreAscendent(int[] matriu) {

    for (int i = 0; i < matriu.length - 1; i++) {

      if (matriu[i] > matriu[i + 1]) {
        return false;
      }

    }

    return true;
  }

  public boolean ordreDescendent(int[] matriu) {

    for (int i = 0; i < matriu.length - 1; i++) {

      if (matriu[i] < matriu[i + 1]) {
        return false;
      }

    }

    return true;
  }

  public boolean ordreParellsAscendent(int[] matriu) {

    for (int i = 0; i < matriu.length - 2; i+=2) {

      if (matriu[i] > matriu[i + 2]) {
        return false;
      }

    }

    return true;
  }

  public boolean ordreSenarsDescendent(int[] matriu) {

    for (int i = 1; i < matriu.length - 2; i+=2) {

      if (matriu[i] < matriu[i + 2]) {
        return false;
      }

    }

    return true;
  }

  /////// fins aqui 5

  public int elementMesLlunyaDeLaMitja(int[] matriu) {

    float mitja = mitjaAritmetica(matriu);
    int max = maxim(matriu);
    int min = minim(matriu);

    if ( ( Math.abs( mitja - min ) > Math.abs ( mitja - max ) ) ) {
      return min;
    } else
      return max;

  }

  public int elementMesLlunyaDeLaMitjaIeratiu(int[] matriu) {

    float mitja = 0;
    float dist = 0;
    int indexCandidat = 0;

    mitja = mitjaAritmetica(matriu);

    for (int i = 0; i < matriu.length; i++) {

      if (Math.abs(matriu[i] - mitja) > dist) {
        dist = Math.abs(matriu[i] - mitja);
        indexCandidat = i;
      }

    }

    return matriu[indexCandidat];
  }

  public int elementMesProperDeLaMitja(int[] matriu) {

    float mitja = 0;
    float dist = 0;
    int indexCandidat = 0;

    mitja = mitjaAritmetica(matriu);

    dist = Math.abs ( maxim(matriu) - minim(matriu) );

    for (int i = 0; i < matriu.length; i++) {

      if (Math.abs(matriu[i] - mitja) < dist) {
        dist = Math.abs(matriu[i] - mitja);
        indexCandidat = i;
      }

    }

    return matriu[indexCandidat];
  }


  /// fins aqui 7

  public static int[] swapRigthMinToPosition(int[] matriu, int position) {  // 9 punts

    int p = position;
    int min = matriu[p];

    for (int j = position + 1; j < matriu.length; j++) {
      if (matriu[p] < matriu[j]) {
        p = j;
      }
    }

    int smallerNumber = matriu[p];
    matriu[p] = matriu[position];
    matriu[position] = smallerNumber;

    return matriu;
  }

  public static int[] ordenaRigth(int[] matriu) {  //// 10 punts

    for (int i = 0; i < matriu.length - 1; i++) {

      matriu = swapRigthMinToPosition(matriu, i);
    }

    return matriu;
  }

  public static int[] swapLeftMaxToPosition(int[] matriu, int position) {

    int p = position;

    for ( int j = position - 1 ; j >= 0 ; j-- ) {
      if (matriu[j] > matriu[p]) {
        p = j;
      }
    }

    int smallerNumber = matriu[p];
    matriu[p] = matriu[position];
    matriu[position] = smallerNumber;

    return matriu;
  }


  public static int[] ordenaLeft(int[] matriu) {

    for (int i = matriu.length - 1; i > 0 ; i--) {

      matriu = swapLeftMaxToPosition(matriu, i);
    }

    return matriu;
  }


}
