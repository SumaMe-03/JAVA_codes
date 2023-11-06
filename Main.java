//Find the first number less than 100 in a given list of numbers
//Eg:
// 95
// 616
// 314
// 76
// 89
// 54
// 11
//Output: 95

import java.util.*;
import java.io.*;

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        int temp;
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < 100) {
                arr1.add(array.get(i));
            }
        }
        
        for (int i = 0; i < arr1.size() - 1; i++) {
            for (int j = 0; j < arr1.size() - i - 1; j++) {
                if (arr1.get(j) > arr1.get(j + 1)) {
                    temp = arr1.get(j);
                    arr1.set(j, arr1.get(j + 1));
                    arr1.set(j + 1, temp);
                }
            }
        }

        return arr1.get(arr1.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(num);
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}
