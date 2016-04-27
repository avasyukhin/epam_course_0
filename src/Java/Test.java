package Java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/**
 * Created by Aphex on 27.04.2016.
 */
public class Test {
    public static int ARRAY_LENGTH = 30;
    private static int[] array = new int[ARRAY_LENGTH];
    private static Random generator = new Random();

    public static void initArray() {
        for (int i=0; i<ARRAY_LENGTH; i++) {
            array[i] = generator.nextInt(100);
        }
    }
    public static void printArray() {
        for (int i=0; i<ARRAY_LENGTH-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[ARRAY_LENGTH-1]);
    }
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        initArray();
        printArray();
        QuickSort quickSort = new QuickSort(array);
        quickSort.sorting();
        printArray();
        System.out.println("Enter a number to test BinarySearch");
        while(true){
            try{
                int x = Integer.parseInt(reader.readLine());
                BinarySearch binarySearch =new BinarySearch(array);
                System.out.println(binarySearch.find(x));
                break;
            }catch (NumberFormatException e){
                System.out.println("Number format exception. Try again");
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }

    }
}
