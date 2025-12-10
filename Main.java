import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int A[]=new int[100];
        for(int x=0;x<10;x++)
            A[x]=input.nextInt();

        for(int x=0;x<100;x++)
        {
            int a=A[x];
            int s=0;
            int d=0;
            while(A[x]>0)
            {
                d=A[x]%10;
                s=(s*10)+d;
                A[x]=A[x]/10;

            }//end of while
            if(s==a)
                System.out.println(a);
        }//end of for


    }//end of main
}//end of class