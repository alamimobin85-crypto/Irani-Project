import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int c50=0;
        int c10=0;
        int c5=0;
        int c1=0;
        if(n>0)
        {
            c50=n/50;
            n=n%50;
        }//end of if 1
        if(n>0)
        {
            c10=n/10;
            n=n%10;
        }//end of if 2
        if(n>0)
        {
            c5=n/5;
            n=n%5;
        }//end of if3
        if(n>0)
        {
            c1=n/1;
            n=n%1;
        }//end of if4
        System.out.println("C50="+c50+" C10="+c10+" C5="+c5+" C1="+c1);
        if(n<0)
            System.out.println("eror");



    }//end of main

}//end of class