import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double s=0.0;
        int x=1;
        double p=1.0;
        while(p>0.0000001)
        {
            p=(1.0/x)*p;
            s=p+s;
            x++;
        }//end of for
        System.out.print(s);

    }//end of main
}//end of class