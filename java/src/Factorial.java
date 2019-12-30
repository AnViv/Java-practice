import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        int a,b,i,m,k,l;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for(i=1;i<=a;i++)
        {
            b = sc.nextInt();
            m=0;
            l=5;
            do {
                k = b/l;
                l=5*l;
                m += k;
            } while(k>0);
            System.out.println(+ m);
        }
    }

}
