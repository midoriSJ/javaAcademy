package day07;

import java.util.Arrays;
import java.util.Comparator;

public class java_20231031 {

	public static void main(String[] args) {
		
		/*
		int [] arr = new int [5];
		System.out.println(arr);
		*/
		
		/*
		int [] arr = new int[]{1, 2, 3, 4, 5};
		for(int i = 0; i <= 4; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
			
		}
		System.out.print("배열의 크기 = ");
		System.out.println(arr.length);
		*/
		
		/*
		int [] intArr = new int [5];
		System.out.println(intArr);
		String [] strArr = new String [5];
		System.out.println(strArr);
		int [] varArr = {1, 2, 3, 4, 5};
		System.out.println(varArr);
		
		
		System.out.print("intArray[0] = ");
		System.out.println(intArr[0]);
		System.out.print("intArray[1] = ");
		System.out.println(intArr[1]);
		
		System.out.print("stringArray[0] = ");
		System.out.println(strArr[0]);
		System.out.print("stringArray[1] = ");
		System.out.println(strArr[1]);
		
		System.out.print("varArray[0] = ");
		System.out.println(varArr[0]);
		System.out.print("varArray[1] = ");
		System.out.println(varArr[1]);
		*/
		
		/*
		char [] word = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWord = "";
		for(int i = 0; i < word.length; i++) {
			if((word[i] >= 'A' && word[i] <= 'Z') || (word[i] >= 'a' && word[i] <= 'z')) {
				myWord += word[i];
			}
		}
		System.out.println(myWord);
		*/
		
		/*
		int [] arr = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		System.out.print("정렬 전 배열 = ");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.print("정렬 후 배열 = ");
		System.out.println(Arrays.toString(arr));
		Integer [] arr2 = {1, 6, 2, 3, 10, 7, 4, 5, 8, 9};
		Arrays.sort(arr2, Comparator.reverseOrder());
		System.out.print("내림차순 배열 = ");
		System.out.println(Arrays.toString(arr2));
		*/
		
		/*
		int [] arr01 = {1, 2, 3};
		int [] arr02 = arr01;
		arr02[1] = 10;
		
		System.out.print("arr01 배열 : ");
		System.out.println(Arrays.toString(arr01));
		System.out.print("arr02 배열 : ");
		System.out.println(Arrays.toString(arr02));
		*/
		
		/*
		int [] arr01 = {1, 6, 4, 5, 3, 2};
		int [] newArr = new int[arr01.length];
		
		for(int i = 0; i < arr01.length; i++) {
			newArr[i] = arr01[i];
		}
		
		newArr[0] = 100;
		System.out.print("arr01 배열 : ");
		System.out.println(Arrays.toString(arr01));
		System.out.print("newArr 배열 : ");
		System.out.println(Arrays.toString(newArr));
		*/
		
		/*
		int [] arr01 = {1, 2, 3};
		int [] arr02 = Arrays.copyOf(arr01, arr01.length);
		int [] arr03 = new int [arr01.length];
		System.arraycopy(arr02, 0, arr03, 0, arr02.length-2);
		
		for(int i = 0; i < arr01.length; i++){
			arr02[i] = arr01[i];
		}
		
		arr02[2] = 200;
		arr03[1] = 300;
		System.out.print("arr01 배열 : ");
		System.out.println(Arrays.toString(arr01));
		System.out.print("arr02 배열 : ");
		System.out.println(Arrays.toString(arr02));
		System.out.print("arr03 배열 : ");
		System.out.println(Arrays.toString(arr03));
		*/
		
		/*
		int [][] arr = new int [3][];
		arr[0] = new int [2];
		arr[1] = new int [3];
		arr[2] = new int [1];
		*/
		
		int [][] arr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
	}

}
