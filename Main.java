import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.print(a+", "+b+", ");
        for(int x=1;x<48;x++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+", ");
        }

    }//end of main
}//end of class