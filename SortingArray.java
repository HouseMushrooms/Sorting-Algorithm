package ArraySort;
import java.util.Arrays;
import java.util.ArrayList;
public class SortingArray {
    public static void main(String[] args){
        int array[] = {10, 7, 4, 8, 12, 30, -42};
        System.out.println(sort(array));
}
    public static ArrayList<Integer> sort(int[] array){
            //finding the lowest num in the array
        int minInt = Arrays.stream(array).min().getAsInt();
            //finding the highest num in the array
        int maxInt = Arrays.stream(array).max().getAsInt();
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();


            //checking which numbers from the lowest to the highest in the array are in the array
        for (int num = minInt; num <= maxInt; num++){
            boolean test = false;
            for(int element:array){
                //checking to see if the num is in the array
                if(element == num){
                    test = true;
                            //the number is there, add it to the new array
                        if(test == true){
                            sortedArray.add(num);
                            continue;
                            //the number is not there, keep checking
                        } else if(test == false){
                            continue;
                    }
                }
            }  
       }
        return sortedArray;
    }
}
