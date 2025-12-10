import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int Q=2;
        while(n>1)
        {
            int p=0;
            while(n%Q==0)
            {
                n=n/Q;
                p=p+1;
            }//end of while 1_1
            if(p>0)
                System.out.print(Q+"^"+p+"*");
            Q=Q+1;
        }//end of while1

    }//end of main
}//end of calss