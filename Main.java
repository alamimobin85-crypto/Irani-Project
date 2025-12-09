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
        double p=x;
        int A=-1;
        int a=2;
        while(p>0.0000001)
        {
            p=((x*x*p)/(a*(a+1)));
            s=(A*p)+s;
            a=a+2;
            A=-A;
        }//end of while
        System.out.println(s+x);

    }//end of main
}//end of class