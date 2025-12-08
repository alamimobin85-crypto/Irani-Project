import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);        
        int s=0;
        int A=1;
        for(int x=1;x<=100;x++)
        {
            s=(A*x)+s;
            A=-A;

        }
        System.out.println(s);



    }//end of main
}//end of class
