import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=0;
        int b=1;
        int c=0;
        if(n==a&&n==b)
            System.out.println("YES");
        while(a+b<=n)
        {
            c=a+b;
            a=b;
            b=c;
        }//end of for
        if(c==n)
            System.out.println("yes");
        else
            System.out.println("no");


    }//end of main
}//end of class