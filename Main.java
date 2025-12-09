import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double s=0;
        int A=-1;
        for(int x=2;x<=100;x=x+2)
        {
            double p=1;
            for(int y=1;y<=x;y++)
                p=(1.0/y)*p;
            s=(A*p)+s;
            A=-A;
        }//end of for
        System.out.println(s+1);


    }//end of main
}//enf of class