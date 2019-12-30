import java.util.Scanner;
import java.lang.String;

public class Stones {
    public static void main(String[] args)
    {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t>0)
        {
            String j,s;
            int j1,s1,i,k,c=0;
            j = sc.next();
            s = sc.next();
            j1 = j.length();
            s1 = s.length();
            for(i=0;i<s1;i++)
            {
                for(k=0;k<j1;k++)
                {
                    if(s.charAt(i) == j.charAt(k))
                    {
                        c++;
                        break;
                    }
                }
            }
            t--;
            System.out.println(+ c);
        }
    }

}
