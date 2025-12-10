import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        System.out.println("n="+n+" m="+m);
        int m1=m;
        int n1=n;
        if(n>m)
        {
            while (n % m != 0)
            {
                int r = n % m;
                n = m;
                m =r ;
            }//end of while

            System.out.println(m);
            System.out.println((m1*n1)/m);
        }//end of if 1

        if(m>n)
        {
            while (m % n != 0)
            {
                int r = m % n;
                m = n;
                n = r;
            }//end of while
            System.out.println(n);
            System.out.println((m1*n1)/m);

        }



    }//end of main
}//end of class