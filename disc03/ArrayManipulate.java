// import java.util.*; 
import java.util.stream.IntStream;
public class ArrayManipulate{
	
	public static int[] insert(int[] arr, int item, int position){
		int[] returnval = new int[arr.length+1];
		int i = 0;
		while (i<position){
			returnval[i] = arr[i];
			i+=1;
		}
		returnval[i] = item;
		while (i<arr.length){
			returnval[i+1] = arr[i];
			i+=1;
		}
		
		for (int x:returnval){
			System.out.println(x);
		}
		return returnval;
	}

	public static void reverse(int[] arr) {
		int right = arr.length-1;
		int left = 0;
		while (left<right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		for (int x:arr){
			System.out.println(x);
		}
	}

	public static int[] replicate(int[] arr) {
		int summ = IntStream.of(arr).sum();
		int[] res = new int[summ];
		int i=0;
		for (int item:arr){
			for (int counter=0; counter<item; counter++){
				res[i] = item;
				i++;
			}
		}
		for (int x:res){
			System.out.println(x);
		}
		return res;
	}

	
	public static void main(String[] args){
		int[] arr = new int[]{1,2,3,4};
		ArrayManipulate.reverse(arr);
		
	}
}