import java.util.Scanner;
public class Cielab {
    public static void main(String[] args)
    {
        int a,b,c,diff,d=0,f=2,g=1;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        diff = a-b;
        if(diff<0)
        {
            diff *= -1;
        }
        c = diff;
        c = c/10;
        if(c>0)
        {
            System.out.print(+ c);
        }
        d = diff%10;
        d += 1;
        if(d==10)
        {
            if(a==1 || b==1)
                System.out.print(+ f);
            else
                System.out.print(+ g);
        }
        else if(a==1 || b==1)
        {
            d +=2;
            if(d>10)
            {
                d -= 4;
                System.out.print(+ d);
            }
            else
                System.out.print(+ d);
        }
        else
            System.out.print(+ d);

    }
}
