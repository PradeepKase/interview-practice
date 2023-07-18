package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_Two_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given an array of integers, find two numbers such that they add up to a specific target number.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the target value");
		int target=sc.nextInt();
		int[] arr={1,9,4,4,3,6,7,8};
		Arrays.sort(arr);
		int l=0;
		int r=arr.length-1;
		
		// with two pointer timecomplexity = O(n)
		while(l<r) {
			if(arr[l]+arr[r]==target) {
				System.out.println(arr[l]+" "+arr[r]);
				l++;
				r--;
			}else if(arr[l]+arr[r]<target) {
				l++;
			}else {
				r--;
			}
		}
		
		
		//without two pointer timecompleity = O(n2)
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		
//		System.out.println();
	}

}
