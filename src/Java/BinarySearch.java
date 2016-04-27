package Java;



import java.io.IOException;
import java.io.InputStreamReader;



public class BinarySearch {

    private Double[] array;

    public BinarySearch(Double[] array) {
        this.array = array;
    }

    public int find(Double x) {
        int i = -1;
        if (this.array != null) {
            int low = 0, high = this.array.length, mid;
            while (low < high) {
                mid = (low + high) >>> 1;
                if (x == this.array[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < this.array[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }



}