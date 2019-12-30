package String;
import java.util.Scanner;
public class Anagram {
    public void Isogram(String s)
    {
        int[] arr = new int[128];
        int flag = 0;
        for(int i=0; i < s.length(); i++)
        {
            int d = s.charAt(i);
            arr[d] += 1;
            if(arr[d] > 1)
            {
                flag = 1;
                System.out.println(0);
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println(1);
        }

    }
    //test comment
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
    }
}
