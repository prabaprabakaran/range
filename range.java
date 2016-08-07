import java.util.Scanner;

public class Prime
{
    public static void main(String args[])
    {
         int se, s2, s3, fla = 0, i, j;
         Scanner s = new Scanner(System.in);
         System.out.println ("Enter the lower limit :"); 
         se = s.nextInt();
         System.out.println ("Enter the upper limit :"); 
         s2 = s.nextInt();
         System.out.println ("The prime numbers in between the entered limits are :");
         for(i = se; i <= s2; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     fla = 0;
                     break;
                 }
                 else
                 {
                     fla = 1;
                 }
             }
             if(fla == 1)
             {
                 System.out.println(i);
             }
         }
    }
}
