import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double s=0.0;
        int A=1;
        for(int x=1;x<=100;x++)
            {
                double p=1.0;
                for(int y=1;y<=x;y++)
                    p=(1.0/y)*p;
                s=s+(A*p);
                A=-A;
            }//end of for1
        System.out.println(s);

    }//end of main
}//end of class