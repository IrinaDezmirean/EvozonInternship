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

}
