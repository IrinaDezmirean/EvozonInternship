// Assignment 3

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        /*
        // 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        printHelloName();

        //2. Printati rezultatul sumei a doua numere(orice numere)
        //printSum2No();

        //3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
        //printDiv2No();

        //4. Printati rezultatul urmatoarelor operatiuni:
        computations();

        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(10,28));
        System.out.println("Subtraction: " + calc.subtract(10,28));
        System.out.println("Multiplication: " + calc.multiply(10,28));
        System.out.println("Division: " + calc.divide(10,28));

        drawMonkey();

        System.out.println("The mean square is: " + meanSquare(10,23,7));

        System.out.println("The modulo is: " + modulo(12,7));

        System.out.println("Fahrenheit to Celsius: " + convertFtoC(25));

        System.out.println("Inch to meter:" + covertInchToMeter(15));

        System.out.println("Speed: ");
        computeSpeed(200,2,106,18);

        computeCircleAreaAndCircumference(10);


        LogicalOp op = new LogicalOp();
        int max = op.checkBiggerNumber(100,30);
        System.out.println("Bigger number is: "+ max);


        System.out.println(op.stringComparison("Evozon"));


        System.out.println(op.compStrAndNo("Evozon",2));
        System.out.println(op.compStrAndNo("Evozon",5));
        System.out.println(op.compStrAndNo("Alabala",1));

        System.out.println(op.compNo(10));
        System.out.println(op.compNo(6));
        System.out.println(op.compNo(3));

        System.out.println(op.compareNumber(-10));
        System.out.println(op.compareNumber(10));
        System.out.println(op.compareNumber(4));
        System.out.println(op.compareNumber(3));


        op.switchCaseLuckyNo(-100);
        op.switchCaseLuckyNo(7);

        System.out.println(op.evenNumber(10));
        System.out.println(op.evenNumber(3));

        System.out.println(op.eligibleVote(22));
        System.out.println(op.eligibleVote(6));

        System.out.println(op.max3No(10,200,8));
        System.out.println(op.max3No(50,20,90));
        System.out.println(op.max3No(43,2,31));


        op.counterAsc(73);
        op.counterAsc(105);

        op.counterDesc(-73);
        op.counterDesc(-105);

        op.interval(7,16);
        op.interval(20,8);
        op.interval(19,19);


        op.counterEven();

        op.counterOdd();


        System.out.println(op.addNumbers(90));
        System.out.println(op.addNumbers(109));

        System.out.println(op.meanNumbers(90));
        System.out.println(op.meanNumbers(109));


        op.drawModel();

         */

        LogicalOp op = new LogicalOp();
        Calculator calc = new Calculator();

        System.out.println("Overloading add method");
        System.out.println(calc.add(10,10));
        System.out.println(calc.add(10.5F,10.5F));
        System.out.println(calc.add(10,10,10));
        System.out.println(calc.add(10.5F,10.5F,10.5F));

        System.out.println("Overloading subtract method");
        System.out.println(calc.subtract(99.99F,16.03F,56.77F));
        System.out.println(calc.subtract(99,16,56));
        System.out.println(calc.subtract(99.99F,16.03F));
        System.out.println(calc.subtract(99,16));

        System.out.println("Overloading multiply method");
        System.out.println(calc.multiply(0,89));
        System.out.println(calc.multiply(2.5F,10.0F));
        System.out.println(calc.multiply(1,89,2));
        System.out.println(calc.multiply(2.5F,10.0F,2.7F));

        System.out.println("Overloading divide method");
        System.out.println(calc.divide(6,3));
        System.out.println(calc.divide(2.5F,10.0F));
        System.out.println(calc.divide(5,3,7));
        System.out.println(calc.divide(2.5F,10.0F,2.7F));

        op.arrayPos();

        int[] res = op.populateArr(new int[50]);
        for(int i = 0; i < res.length; i++)
            System.out.println(i+": "+res[i]);


        int[] arr = new int[10];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(1000);
            //System.out.println(i+": "+arr[i]);
        }
        System.out.println("Array mean: "+op.meanArray(arr));

        String[] str = {"bird","cat","dog","fish","lion"};
        System.out.println(op.findString(str,"dog"));
        System.out.println(op.findString(str,"turtle"));


        int[] nrs = {10,99,0,28,38,239,1,203,38,29};
        System.out.println(op.findNr(nrs,203));
        System.out.println(op.findNr(nrs,50));

        op.drawGrid();

        int[] arrRem = op.removeEl(nrs,38);
        for(int v: arrRem)
            System.out.println(v);

        System.out.println("Second smallest min: " + op.secondSmallestNr(nrs));

        int[] copy = new int[10];
        copy = op.copyArr(nrs,copy);
        for (int v: copy)
            System.out.println(v);



    }

    public static void printHelloName()
    {
        System.out.println("Hello");
        System.out.println("Irina");
    }

    public static void printSum2No()
    {
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
    }

    public static void printDiv2No()
    {
        System.out.println("3. DIVISION OF TWO NUMBERS");
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextFloat();
        System.out.print("b = ");
        b = scanner.nextFloat();
        float div = a/b;
        System.out.println("RESULT: a / b = " + div);
    }

    public static void computations()
    {

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


    //3.Scrieti o metoda java, care sa afiseze urmatorul model:
//    +"""""+
//   [| o o |]
//    |  ^  |
//    | '-' |
//    +-----+

    public static void drawMonkey()
    {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    //4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.
    public static float meanSquare(float a, float b, float c)
    {
        return (a+b+c)/3;
    }

    //5.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
    public static float modulo(float a, float b)
    {
        return a % b;
    }

    // 6.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)
    public static float convertFtoC(float fahTemp)
    {
        return (float)5/9*(fahTemp-32);
    }

    // 7.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii
    public static double covertInchToMeter(float inchDist)
    {
        return inchDist * 0.0254;
    }

    //8.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)
    public static void computeSpeed(float distance, int hours, int minutes, int seconds)
    {
        int sec = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("Meters/second: " + distance/sec+"m/s");

        double km = distance * 0.001;
        double h = sec * 0.00027778;
        System.out.println("Kilometers/hour: " + km/h +"km/h");

        double miles = distance / 1609;
        System.out.println("Miles/hour: "+miles/h+"mi/h");
    }

    //9.Scrieti un program care primeste ca input raza unui cerc si printeaza perimetrul si aria acelui cerc:
    public static void computeCircleAreaAndCircumference(float r)
    {
        System.out.println("Area: " + r*r+"π");
        System.out.println("Circumference: "+2*r+"π");
    }

}