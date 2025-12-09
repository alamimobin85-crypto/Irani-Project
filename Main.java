import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double s=0.0;
        int a=1;
        int b=20;
        while(a<=20&&b>=1)
        {
            s=(a/b)+s;
            a++;
            b--;

        }//end of while
        System.out.println(s);

    }//end of main
}//end of class