public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,8,9};
        int target = 1;
        int s = 0;
        int e = arr.length - 1;
        int res = binary(arr, s, e, target);
        System.out.println("the target is at index :"+res);
    }

    static int binary(int[] arr,int start,int end,int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }


        }
        return -1;
    }

}

