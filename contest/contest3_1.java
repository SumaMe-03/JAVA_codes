//Given a sorted array arr[] of size N, the task is to remove the duplicate elements from the array.
//
//Sample Input 0
//
//2
//2
//2
//2
//2
//Sample Output 0
//
//2
import java.util.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


//class element{
//	public static boolean ele_exists(int[] arr, int num) {
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==num) {
//				return true;
//			}
//		}
//		return false;
//	}
//}

//public class contest3_1{	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner obj = new Scanner(System.in);
//		int size = obj.nextInt();
//		int count =0;
//		int arr[] = new int[size];
//		
//		for(int i=0;i<size;i++) {
//			arr[i]=obj.nextInt();
//		}
//		
//		
//		int new_arr[] = new int[size];
//		for(int i=0; i<size;i++) {
//			if(!ele_exists(new_arr, arr[i])) {
//				new_arr[count++] = arr[i];
//			}
//		}
//		
//		for(int i : new_arr) {
//			if(i!=0) {
//				System.out.println(i);
//			}
//		}
	
public class contest3_1 {

    public static boolean elementExists(Set<Integer> set, int num) {
        return set.contains(num);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }

        Set<Integer> uniqueElements = new HashSet<>();
        for (int i : arr) {
            if (!elementExists(uniqueElements, i)) {
                uniqueElements.add(i);
            }
        }

        for (int i : uniqueElements) {
            System.out.println(i);
        }
    }
}





