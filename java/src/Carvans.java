import java.util.Scanner;

public class Carvans {
    public static void main(String[] args)
    {
        int i,j,test_cases,no_of_cars,k;
        int[] arr;
        arr = new int[11000];
        Scanner sc = new Scanner(System.in);
        test_cases = sc.nextInt();
        for(i=1;i<=test_cases;i++)
        {
            k=1;
            no_of_cars = sc.nextInt();
            for(j=1;j<=no_of_cars;j++)
            {
                arr[j] = sc.nextInt();
            }
            for(j=2;j<=no_of_cars;j++)
            {
                if(arr[j] <= arr[j-1])
                {
                    k+=1;
                }
                else
                {
                    arr[j] = arr[j-1];
                }
            }
            System.out.println(+ k);
        }

    }
}
