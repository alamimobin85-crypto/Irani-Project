import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int c=0;
        for(int a=1;a<=7;a++)
            for(int b=1;b<=7;b++)
            {
                c=a*b;
                int s=0;
                int p=1;
                while (c>0)
                {
                    int d=c%8;
                    s=(d*p)+s;
                    p=p*10;
                    c=c/8;

                }//end of while
                System.out.println(s);
            }//end of for2



    }//end of main
}//end of class