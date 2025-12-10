import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double s=0.0;
        int A[]=new int[10];
        for(int x=0;x<10;x++)
            {
                A[x]=input.nextInt();
                s=s+A[x];
            }//end of for
        System.out.println(s/10);

    }//end of main
}//end of class