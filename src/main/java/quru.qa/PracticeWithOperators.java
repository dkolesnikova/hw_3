package quru.qa;

import org.junit.jupiter.api.Test;

public class PracticeWithOperators {

    byte varByte1 = 110;
    byte varByte2 = -110;
    int varInt1 = 1100000;
    int varInt2 = -1100000;
    long varLong = 1100000000;
    float varFloat1 = 110.00f;
    float varFloat2 = -110.00f;

    // операции с типами данных

        System.out.println(varByte1 + varByte2);
        System.out.println(varInt1 * varInt2);
        System.out.println(varFloat1 / varFloat2);

    //Переполнение

        System.out.println(varByte2 - varByte1);
        System.out.println((byte) (varByte1 + 127));
        int a = Integer.MAX_VALUE;
        System.out.println(a + 2);

    //Сравнение

        int a = 10;
        int b = 38;
        if (a < b) {
            System.out.println("true");
        }

        boolean cat = false;
        int yearsOld = 5;
        if (cat || yearsOld < 3) {
            System.out.println("У вас молодое животное или котик");
        } else if (cat || yearsOld > 2) {
            System.out.println("У вас не котик или взрослое животное");
        }
        if (!(cat) && (yearsOld < 3)) {
            System.out.println("У вас наверняка молодой котик");
        }

        if (!(cat) && yearsOld > 3) {
            System.out.println("У вас нет молодого котика :( ");
        }


        String a = "1";
        String b = "2";
        Integer c = 1;
        Integer d = 2;
        System.out.println(a + b); // ожидаемое значение 12
        System.out.println(c + d); // ожидаемое значение 3

        int varInt = 10;
        if (varInt < 15) {
            System.out.println("Значение верно");
        } else {
            System.out.println("Введите другое значение");
        }
}