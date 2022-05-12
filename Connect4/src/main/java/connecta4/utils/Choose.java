package connecta4.utils;

import lombok.experimental.UtilityClass;

import java.util.Scanner;

@UtilityClass
public class Choose {
    public int chooseInt(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        if (isNumeric(str)) {
            int num = Integer.parseInt(str);
            if (num < min || num > max) {
                Text.errorWriteNumbers(min, max);
                return chooseInt(min, max);
            }
            return num;
        }
        Text.errorWriteStringWhenIsNumber();
        return chooseInt(min, max);
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int num = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}