import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s=0;
        int p=1;
        while (n>0)
        {
            int d=n%2;
            s=(d*p)+s;
            p=p*10;
            n=n/2;
        }//end of wile
        System.out.println(s);


    }//end of main

}//end of class