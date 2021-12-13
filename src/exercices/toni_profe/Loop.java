package exercices.toni_profe;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static Scanner scanner = new Scanner(System.in);

    public static void printNumbers(){
        System.out.println("introdueix un numero per imprimir: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number + 1; i++){
            System.out.println(i);
        }
    }
    public static void questionKeyboard(){
        boolean isNegative = false;
        while (!isNegative){
            int numero = scanner.nextInt();
            if (numero < 0){
                isNegative = true;
            }
        }
    }
    public static void howItsTheNumber(){
        boolean isCero = false;
        while (!isCero){
            int numero = scanner.nextInt();
            if (numero > 0){
                System.out.println("Es Positiu");
            } else if (numero < 0) {
                System.out.println("Es Negatiu");
            } else {
                isCero = true;
            }
        }
    }
    public static void ifMultipleThan2Stop(){
        System.out.println("Escriu un numero multiple de dos perque se aturi: ");
        int num = scanner.nextInt();
        while (num % 2 != 0){
            System.out.println("Escriu un numero multiple de dos perque se aturi: ");
            num = scanner.nextInt();
        }
        System.out.println("EL DARRER NUMERO QUE HAS INTRODUIT ES MULTIPLE DE 2");
    }

    public static void ifNegativeStop(){
        System.out.println("Introdueix un numero : ");
        int num = scanner.nextInt();
        int counter = 0;
        while (num > 0){
            System.out.println("Introdueix un numero : ");
            num = scanner.nextInt();
            counter++;
        }
        System.out.println("S'han introduit " + counter + " numeros");
    }


    public static void ifIts0Stop(){
        System.out.println("Introdueix un numero : ");
        int num = scanner.nextInt();
        int counter = 0;
        while (num != 0){
            System.out.println("Introdueix un numero : ");
            num = scanner.nextInt();
            counter++;
        }
        System.out.println("S'han introduit " + counter + " numeros");
    }

    public static void ifIts0ArithmeticAverage(){
        System.out.println("Introdueix un numero : ");
        int num = scanner.nextInt();
        int counter = 0;
        int total = num ;
        while (num != 0){
            System.out.println("Introdueix un numero : ");
            num = scanner.nextInt();
            total = num + total;
            counter++;
        }
        System.out.println("La mitjana de tots els numeros son : " + total/counter);
    }

    public static void secretNumber(){
        Random random = new Random();
        int max = 10;
        int hidden = random.nextInt(max);
        System.out.println("Introdueix un numero : ");
        int num = scanner.nextInt();
        while (num != hidden){
            System.out.println("NO L'HAS ENDEVINAT");
            System.out.println("Torna a introduir un numero : ");
            num = scanner.nextInt();
        }
        System.out.println("L'HAS ENDEVINAT!!" + " El numero es " + hidden);
    }

    public static void questionKeyboard1(){
        int[] array = new int[3];
        boolean isNegative = false;
        for (int i = 0 ; i < array.length ; i++){
           System.out.println("Introdueix un numero : ");
           array[i] = scanner.nextInt();
           if (array[i] < 0){
                isNegative = true;
            }
        }
        if (isNegative){
            System.out.println("Hi ha numeros negatius");
        }
    }

    public static void questionKeyboard2(){
        int[] array = new int[5];
        int mesGran = 0;
        for (int i = 0 ; i < array.length ; i++){
            System.out.println("Introdueix un numero : ");
            array[i] = scanner.nextInt();
        }
        for (int j : array) {
            if (j > mesGran) {
                mesGran = j;
            }
        }
        System.out.println("El numero mes gran es " + mesGran);
    }

    public static void examScores(){
        int[] array = new int[15];
        int suspesos = 0 ;
        int aprobats = 0 ;
        for (int i = 0 ; i < array.length ; i++){
            System.out.println("Introdueix el numero " + i + " : ");
            array[i] = scanner.nextInt();
            if (array[i] >= 10 || array[i] < 0){
                i--;
            }
        }

         for (int i : array) {
            if (i < 5) {
                suspesos++;
            } else {
                aprobats++;
            }
        }
        System.out.println("________________________________");
        System.out.println("hi ha " + aprobats + " aprobats");
        System.out.println("hi ha " + suspesos + " suspesos");
    }


    public static void stringInvers(){
        String paraula = scanner.nextLine();
        for (int i = paraula.length()-1; i >= 0; i--){
            System.out.print(paraula.charAt(i));
        }
    }

    public static void stringPalindrom(){
        boolean isPalindrome = true;
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("'" + word + "' és un palíndrom");
        } else {
            System.out.println("'" + word + "' no és un palíndrom");
        }
    }

    public static void calculadorParaules(){
        String line = "hola,como estas Yo muy bien Y tu";
        int numberOfWords = 0;
        for (int i = 0 ; i < line.length(); i++){
           if (line.charAt(i) == ' ' || line.charAt(i) == ',' ){
               numberOfWords++;
           }
        }
        if (line.length() > 0) {
            numberOfWords++;
        }

        if (numberOfWords == 1) {
            System.out.println( numberOfWords + " paraula");
        } else {
            System.out.println( numberOfWords + " paraules");
        }

    }

}
