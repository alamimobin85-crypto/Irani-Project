import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int mox1=0;
        int mox2=0;
        int A[]=new int[100];
        for(int x=0;x<100;x++)
        {
            A[x]=input.nextInt();
            if(A[x]>mox2&&A[x]<mox1)
                mox2=A[x];
            if(A[x]>mox1)
                {
                    mox2=mox1;
                    mox1=A[x];

                }//end of if

        }//end of for
        System.out.println("Mox 2: "+mox2);

    }//end of main
}//end of class