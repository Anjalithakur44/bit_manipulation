import java.util.*;
import java.io.*;
public class setBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter the number=");
        n=sc.nextInt();
        while(n>0)
        {
            if((n&1)==1)
            {
             count++;
            }
          n=n>>1;
        }
        System.out.println("The number of set bit="+count);
    }
}
