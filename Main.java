import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int p=0;
        for(int x=1;x<=n;x++)
            if(n%x==0)
                p=p+1;
        System.out.println(p);

    }//end of main
}//end of class