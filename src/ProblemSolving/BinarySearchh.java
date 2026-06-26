package ProblemSolving;

public class BinarySearchh {
    static void search(int arr[], int key) {
        int left = 0;
        int right = (arr.length) - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == arr[mid]) {
                System.out.println("element found at index  " + mid);
                return;
            }
          else if (arr[mid] < key) {
                left=mid+1;

            } else {
                right=mid-1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 7, 8, 9, 15};
        search(arr, 15);
    }
}
