import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double s= 0.0;
        for(int x=1;x<=100;x++)
            s=(1.0/x)+s;
        System.out.print(s);



    }//end of main
}//end of class