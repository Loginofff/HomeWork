import java.util.Arrays;

public class ArrayUtils {


    public static void sort(int[] array) {
        int min = array[0];
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        int temp = array[0];
        array[0] = array[indexOfMin];
        array[indexOfMin] = temp;
    }
    public static void arraysSort(int[] array) {
        Arrays.sort(array);
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

        }

