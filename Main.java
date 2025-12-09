import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        double s=0.0;
        double p=1.0;
        int a=2;
        while(p>0.0000001)
        {
            p=((x*x*p)/(a*(a-1)));
            s=s+p;
            a=a+2;
        }//end of while

        System.out.print(s+1);

    }//end of main
}//end of class