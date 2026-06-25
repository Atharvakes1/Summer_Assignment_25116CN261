import java.util.Scanner;
class Q64{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++) {

            int flag = 0;

            for(int j=0;j<i;j++) {

                if(arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }

            if(flag == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
