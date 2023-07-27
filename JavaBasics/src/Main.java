// Assignment 1

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("Hello");
        System.out.println("Irina");

        //2. Printati rezultatul sumei a doua numere(orice numere)
        System.out.println("2. SUM OF TWO NUMBERS");
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextFloat();
        System.out.print("b = ");
        b = scanner.nextFloat();
        float sum = a+b;
        System.out.println("RESULT: a + b = " + sum);

        //3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        System.out.println("3. DIVISION OF TWO NUMBERS");
        System.out.print("a = ");
        a = scanner.nextFloat();
        System.out.print("b = ");
        b = scanner.nextFloat();
        float div = a/b;
        System.out.println("RESULT: a / b = " + div);

        //4. Printati rezultatul urmatoarelor operatiuni:
        // a. -5 + 8 * 6
        System.out.println("4.a. -5 + 8*6");
        System.out.println("RESULT: "+ (-5+8*6));

        //b. (55+9) % 9
        System.out.println("4.b. (55+9) % 9");
        System.out.println("RESULT: "+ ((55+9)%9));

        //c. 20 + -3*5 / 8
        System.out.println("4.c. 20 + -3*5 / 8");
        System.out.println("RESULT: " + (20 + -3*5 / 8));

        //d. 5 + 15 / 3 * 2 - 8 % 3
        System.out.println("4.d. 5 + 15 / 3 * 2 - 8 % 3");
        System.out.println("RESULT: " + (5 + 15 / 3 * 2 - 8 % 3));
    }
}