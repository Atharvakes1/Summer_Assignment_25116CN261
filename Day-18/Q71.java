
import java.util.Scanner;

class Q71{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Sorted Array:");

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Key: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int found = 0;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == key) {
                System.out.println("Found at Position " + (mid + 1));
                found = 1;
                break;
            }
            else if(arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if(found == 0) {
            System.out.println("Not Found");
        }
    }
}