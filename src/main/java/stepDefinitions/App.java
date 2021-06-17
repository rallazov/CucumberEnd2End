package stepDefinitions;

import org.openqa.selenium.TakesScreenshot;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Create getNumber() and setNumber() methods that will manipulate with number instance variable.
 *
 * Make sure your setNumber method allows only 10 digit, else return warning message "Wrong number"
 *
 * In Main Class:
 * 1. Try to get number//
 *
 * 2. SetNumber// with Scanner //first time test it with more or less than 10 digit
 *
 * 3.SetNumber// with Scanner// with 10 digits
 *
 * 4. GetNumber
 *
 */
public class App
{
    String number;
    public static int quantity = 250;
    public static double total= 15658.92;
    public int getNumber(){
        return 0;
    }
    public void setNumber(){
       // ArrayList<String> someList =  new ArrayList<>();

}
    public static void main( String[] args ) throws InterruptedException {
int [] arr ={2,3,4,4,2,7,5,8};
Stream.of(arr).
               forEach(t-> System.out.println(Arrays.asList(t)));

    }

//        LinkedList<String> names = new LinkedList<>();
//
//
//        long start = System.nanoTime();
//        System.out.println(start);
//        for (int i = 0; i < 100; i++) {
//            names.add("Ramin"+i);
//            System.out.println(names.get(i));
//        }
//        names.add(50 , "Phanni");
//        long end = System.nanoTime();
//        System.out.println(end);
//        System.out.println(end- start);

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int complement=0;
        for(int i=0;i<nums.length;i++) {
            complement=target-nums[i];
            if(hashMap.containsKey(nums[i])) {
                return new int[]{
                        hashMap.get(nums[i]),i};
            }
            if(!hashMap.containsKey(complement)) {
                hashMap.put(complement,i);
            }
        }
        return null;
    }
}
