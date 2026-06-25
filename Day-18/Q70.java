
import java.util.Scanner;

class Q70 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++) {

            int min = i;

            for(int j=i+1;j<n;j++) {

                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}