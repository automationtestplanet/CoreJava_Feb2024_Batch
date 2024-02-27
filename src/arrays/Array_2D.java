package arrays;

import java.util.Arrays;
import java.util.*;

public class Array_2D {

	public static void main(String[] args) {
		
		int[][] intArr = {{10,20,30},{100,200,300},{1000,2000,30000}};
		
		for(int[] eachArray:intArr) {			
			for(int eacValue:eachArray) {
				System.out.print(eacValue+ " ");
			}
			System.out.println("");
		}
		
		int[][] intArr2 = new int[3][3];
		
		int[] intArr3 = {50, 20, 40, 10, 30 };
		
		for(int eachVal: intArr3)
				System.out.println(eachVal);
		
		Arrays.sort(intArr3);
		System.out.println("-----------------------");
		for(int eachVal: intArr3)
			System.out.println(eachVal);
		
		
		System.out.println("-----------------");
		int[] arr4 = new int[5];
		
//		arr4[0] = 100;
		
		for(int eachVal: arr4)
			System.out.println(eachVal);
		
		
		Array_2D[] Array_2D_Arr = new Array_2D[3];
		for(Array_2D eachVal: Array_2D_Arr)
			System.out.println(eachVal);
		
	}

}
