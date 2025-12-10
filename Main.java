import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        for(int x=1;x<1000;x++)
        {
            int c = 0;
            for (int y = 1; y <= x; y++)
                if (x % y == 0)
                    c++;
            if (c == 2)
                System.out.println(x);
        }//end of for
    }//end of main
}//end of class