import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int s=0;
        if(n>=100)
        for(int x=10;x<99;x++)
            if(n%x==0)
                s=x+s;
        if(n>=10&&n<100)
            for(int x=10;x<n;x++)
                if(n%x==0)
                    s=x+s;
        if(s>0)
            System.out.print(s);
        if(n<10)
            System.out.print("eror");



    }//end of main
}//end of class