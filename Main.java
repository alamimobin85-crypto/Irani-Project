import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int c=0;
        for(int x=1;x<=n;x++)
            if(n%x==0)
                c++;
        if(c==2)
            System.out.println("YES");
        else
            System.out.println("NO");



    }//end of main
}//end of class