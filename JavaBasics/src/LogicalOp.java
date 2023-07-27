import java.util.Arrays;

public class LogicalOp
{

    public LogicalOp(){}

    public int checkBiggerNumber(int a, int b)
    {
        if(a >= b)
            return a;
        else
            return b;
    }

    public String stringComparison(String str)
    {
        if(str.equals("Evozon"))
            return "Learning text comparison";
        else
            return "Got to try some more!";
    }


    public String compStrAndNo(String str, int no)
    {
        if(str.equals("Evozon") && no <= 3)
            return str + no ;
        else if(!(str.equals("Evozon")) && no >= 4)
            return no + str ;
        else
            return "inconclusive";
    }

    public String compNo(int no)
    {
        if(no > 8 || no == 6)
            return "The amount of snow this winter was: " + no + "cm";
        else
            return "The forecast snow is: "+ no +"cm";
    }

    public String compareNumber(float no)
    {
        if(no > 3 && no != 4)
            return "The number is greater than 3 and not equal to 4";
        else if(no == 4)
            return "The number is equal to 4";
        else if(no < 3)
            return "The number is lower than 3";
        else
            return "The number is equal to 3";
    }


    public void switchCaseLuckyNo(int x)
    {
        switch (x)
        {
            case 1:
                System.out.println("The lucky number is 1!");
                break;
            case 2:
                System.out.println("The lucky number is 2!");
                break;
            case 3:
                System.out.println("The lucky number is 3!");
                break;
            case 4:
                System.out.println("The lucky number is 4!");
                break;
            case 5:
                System.out.println("The lucky number is 5!");
                break;
            case 6:
                System.out.println("The lucky number is 6!");
                break;
            case 7:
                System.out.println("The lucky number is 7!");
                break;
            case 8:
                System.out.println("The lucky number is 8!");
                break;
            case 9:
                System.out.println("The lucky number is 9!");
                break;
            default:
                System.out.println("Sorry, unlucky number :(");
                break;

        }

    }


    public boolean evenNumber(int no)
    {
        return no % 2 == 0;
    }


    public boolean eligibleVote(int age)
    {
        return age >= 18;
    }


    public int max3No(int a, int b, int c)
    {
        if(a >= b && a >= c)
            return  a;
        else if(b >= a && b >= c)
            return b;
        else
            return c;
    }

    public void counterAsc(int x)
    {
        if(x>100)
            System.out.println("The given number is greater than 100");
        else
            for(int i = x; i<=100; i++)
                System.out.println(i);
    }

    public void counterDesc(int x)
    {
        if(x<-100)
            System.out.println("The given number is smaller than -100");
        else
            for(int i = x; i>=-100; i--)
                System.out.println(i);
    }


    public void interval(int x, int y)
    {
        if(x<=y)
            for(int i = x; i <= y; i++)
                System.out.println(i);
        else
            for(int i = x; i >= y; i--)
                System.out.println(i);
    }


    public void counterEven()
    {
        for(int i = 2; i <= 100; i=i+2)
            System.out.println(i);
    }

    public void counterOdd()
    {
        for(int i = 1; i <= 99; i=i+2)
            System.out.println(i);
    }


    public int addNumbers(int x)
    {
        int sum = 0;
        if (x>100)
            System.out.println("Given number is bigger than 100");
        else
            for(int i = x; i <= 100; i++)
                sum += i;

        return sum;
    }


    public int meanNumbers(int x)
    {
        int sum = addNumbers(x);
        return sum / (100 - x + 1);
    }

    public void drawModel()
    {
        int limit = 0;
        for(int i = 0; i < 7; i++)
        {
            for(int j = 7; j > limit; j--)
                System.out.print("*");
            System.out.println();
            limit++;
        }
    }


    public void arrayPos()
    {
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++)
        {
            arr[i] = i + 1;
            System.out.println(i+": "+arr[i]);
        }
    }


    public int[] populateArr(int[] arr)
    {
        for(int i = 0 ; i < arr.length; i++)
            arr[i] = (i+1)*2;
        return arr;
    }


    public float meanArray(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        return (float)sum / arr.length;
    }


    public boolean findString(String[] arr, String value)
    {
        for(int i = 0; i < arr.length; i++)
            if(arr[i].equals(value))
                return true;
        return false;
    }

    public int findNr(int[] arr, int value)
    {
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == value)
                return i+1;
        return -1;
    }

    public void drawGrid()
    {
        char[] arr = new char[10];
        Arrays.fill(arr, '-');
        for(int i = 0; i < 10; i++)
            System.out.println(arr);
    }

    public int[] removeEl(int[] arr, int val)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == val)
            {
                for (int j = i; j < arr.length - 1; j++)
                    arr[j] = arr[j + 1];
            }

        }
        return arr;
    }

    public int secondSmallestNr(int[] arr)
    {
        int min1 = arr[0];
        int min2 = arr[0];
        for(int v: arr)
        {
            if( v < min1 && v < min2)
            {
                int aux = min1;
                min1 = v;
                min2 = aux;
            }
            if( v < min2 && v > min1)
                min2 = v;
        }
        return min2;
    }

    public int[] copyArr(int[] orig, int[] copy)
    {
        for(int i = 0; i < orig.length; i++)
            copy[i] = orig[i];
        return copy;
    }

}
