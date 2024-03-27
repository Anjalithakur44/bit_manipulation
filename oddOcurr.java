public class oddOcurr {
    public static int oddOccurele(int []a)
    {
        int x=0;
        for(int i=0;i<a.length;i++)
        {
            x=x^a[i];
        }
        return x;
    }
    public static void main(String []args)
    {
        int []a={4,3,6,2,6,4,2,3,4,3,3};
        int odd_ele=oddOccurele(a);
        System.out.println("The odd appearing element is:"+odd_ele);    
    }
}
