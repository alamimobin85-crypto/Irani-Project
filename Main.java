import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double g=1.0;
        double s=0;
        int x=1;
        while(g>0.0000001)
        {
            double p=1.0;
            for(int y=1;y<=x;y++)
            {
                p=(p*y)/x;
                g=(g*y)/x;
            }
            s=s+p;
            x=x+1;

        }//end of while
        System.out.println(s);

    }//end of main
}//end of class