/*
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
 */
public class 3{
    public static void pattern(int n)
    {
        for(int i=1;i<=2*n;i++)
        {
            int c=(i>n)?(2*n-i):i;
            for(int j=1;j<=c;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String args[])
   {
      pattern(4);
}
