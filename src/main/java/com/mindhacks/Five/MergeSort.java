package com.mindhacks.Five;

public class MergeSort {

	public static void mergeSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		process(arr, 0, arr.length - 1);
	}

	public static void process(int[] arr, int left, int right) {
		if (left == right) {
			return;
		}
		int mid = (left + right) / 2;
		process(arr, left, mid);
		process(arr, mid + 1, right);
		merge(arr, left, mid, right);
	}

	public static void merge(int[] arr, int left, int mid, int right) {
		int[] help = new int[right - left + 1];
		int l = left;
		int r = mid + 1;
		int index = 0;
		while (l <= mid && r <= right) {
			if (arr[l] <= arr[r]) {
				help[index++] = arr[l++];
			} else {
				help[index++] = arr[r++];
			}
		}
		while (l <= mid) {
			help[index++] = arr[l++];
		}
		while (r <= right) {
			help[index++] = arr[r++];
		}
		for (int i = 0; i < help.length; i++) {
			arr[left + i] = help[i];
		}
	}

	public static int[] generateArray(int len, int range) {
		if (len < 1) {
			return null;
		}
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = (int) (Math.random() * range);
		}
		return arr;
	}

	public static void printArray(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static boolean isSorted(int[] arr) {
		if (arr == null || arr.length < 2) {
			return true;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int len = 10;
		int range = 10;
		int testTimes = 50000;
		for (int i = 0; i < testTimes; i++) {
			int[] arr = generateArray(len, range);
			mergeSort(arr);
			if (!isSorted(arr)) {
				System.out.println("Wrong Case:");
				printArray(arr);
				break;
			}
		}

		int len2 = 13;
		int range2 = 10;
		int testTimes2 = 50000;
		for (int i = 0; i < testTimes2; i++) {
			int[] arr = generateArray(len2, range2);
			mergeSort(arr);
			if (!isSorted(arr)) {
				System.out.println("Wrong Case:");
				printArray(arr);
				break;
			}
		}
	}
}