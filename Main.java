import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int s=0;
        int w=1;
        int d=0;
        while(n>0)
        {
            d=n%10;
            if(d!=0)
            {
                s=(d*w)+s;
                w=w*10;
            }

            n=n/10;

        }//end of while
        System.out.print(s);


    }//end of main
}//end of class