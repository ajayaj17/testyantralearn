package com.assignment;

public class MergeSortApp {

	public static void main(String[] args) {
		int arr[] = { 90, 23, 56, 34, 65 ,35};
//		int beg = 0;
//		int end = (arr.length-1);
//		System.out.println(end);
		Merge merge = new Merge();
//		for (int i : arr) {
//			System.out.print(i+" ");
//		}
		merge.mergeSort(arr, 0, arr.length-1);
		for (int i : arr) {
		System.out.println(i);
		}

	}

}
