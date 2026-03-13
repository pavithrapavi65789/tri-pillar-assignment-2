package Module_7;


    import java.util.Arrays;

    public class BinarySearchExample {
        public static void main(String[] args) {
            int arr[] = {10,20,30,40,50};
            int key = 40;

            int low = 0, high = arr.length-1;

            while(low <= high){
                int mid = (low + high)/2;

                if(arr[mid] == key){
                    System.out.println("Found at index: " + mid);
                    break;
                }
                else if(arr[mid] < key)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
    }

