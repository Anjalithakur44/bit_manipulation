import java.util.*;
import java.io.*;
public class powTwo {
    public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int n,flag=0;
      System.out.println("Enter the number=");
      n=sc.nextInt();
     
      while(n>1)
      {
        if(n%2!=0)
        {
            flag=1;
            break;
        }
        n=n/2;
      }
      if(flag==0)
      {
        System.out.println("It is a power of two.");
      }
      else
      {
        System.out.println("It is not a power of two.");
      }
    }
    
}
