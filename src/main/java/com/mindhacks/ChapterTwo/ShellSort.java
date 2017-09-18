package com.mindhacks.ChapterTwo;

public class ShellSort {

	public static void shellSort(int[] arr) {
        if (arr == null || arr.length < 2) {
			return;
		}
		int feet = arr.length / 2;
		int index = 0;
		while (feet > 0) {
			for (int i = feet; i < arr.length; i++) {
				index = i;
				while (index >= feet) {
					if (arr[index - feet] > arr[index]) {
						swap(arr, index - feet, index);
						index -= feet;
					} else {
						break;
					}
				}
			}
			feet /= 2;
		}
	}

	public static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
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
			shellSort(arr);
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
			shellSort(arr);
			if (!isSorted(arr)) {
				System.out.println("Wrong Case:");
				printArray(arr);
				break;
			}
		}
	}
}