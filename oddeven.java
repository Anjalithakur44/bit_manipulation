import java.util.*;
import java.io.*;
public class oddeven {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        n=sc.nextInt();
        if((n&1)==1)
         System.out.println(n+" is odd");
        else
         System.out.println(n+" is even");
    }
}
