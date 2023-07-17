import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] arr1 = findTranspose(arr, n, m);
        System.out.println();
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    static int[][] findTranspose(int[][] arr,int n,int m) {
        int temp = 0;
        for(int i=0;i<n;i++) {
            for(int j=i;j<m;j++) {
                if(i < j) {
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        return arr;
    }
}