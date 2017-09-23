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


}