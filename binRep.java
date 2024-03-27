import java.util.*;
import java.io.*;
public class binRep {
    public static String br(int n)
    {
        String bin=" ";
        while(n>0)
        {
            bin=n%2 + bin;
            n=n/2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        br(n);
        System.out.println("The binary representation of "+n+" is="+br(n));

    }
}
