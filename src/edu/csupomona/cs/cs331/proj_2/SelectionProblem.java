/**
 * 
 */
package edu.csupomona.cs.cs331.proj_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author David
 * 
 */
public class SelectionProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int TIMES = 5;
		int n, k, t;
		long startTime, endTime;
		long totalTimeK1 = 0;
		long totalTimeK2 = 0;
		long totalTimeK3 = 0;
		long totalTimeK4 = 0;
		int[] array;
		int[] size = { 10, 50, 100, 250, 500, 1000, 1500, 2000, 3000, 3500, 3700};

		for (int i = 0; i < size.length; i++) {
			n = size[i];

			array = generateArray(n);

			k = 1;
			for (int j = 0; j < TIMES; j++) {
				startTime = System.nanoTime();
				selectKth1(array, k);
				endTime = System.nanoTime();
				totalTimeK1 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth2(array, k);
				endTime = System.nanoTime();
				totalTimeK2 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth3(array, k);
				endTime = System.nanoTime();
				totalTimeK3 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth4(array, k);
				endTime = System.nanoTime();
				totalTimeK4 += endTime - startTime;
			}

			totalTimeK1 = totalTimeK1 / TIMES;
			totalTimeK2 = totalTimeK2 / TIMES;
			totalTimeK3 = totalTimeK3 / TIMES;
			totalTimeK4 = totalTimeK4 / TIMES;

			System.out.println("For n=" + n + " k(1)=" + k
					+ ": \n\tSelect Kth 1 time: " + totalTimeK1 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 2 time: " + totalTimeK2 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 3 time: " + totalTimeK3 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 4 time: " + totalTimeK4 * Math.pow(10, -9)
					+ " seconds.\n");

			k = n / 4;
			for (int j = 0; j < TIMES; j++) {
				startTime = System.nanoTime();
				selectKth1(array, k);
				endTime = System.nanoTime();
				totalTimeK1 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth2(array, k);
				endTime = System.nanoTime();
				totalTimeK2 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth3(array, k);
				endTime = System.nanoTime();
				totalTimeK3 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth4(array, k);
				endTime = System.nanoTime();
				totalTimeK4 += endTime - startTime;
			}

			totalTimeK1 = totalTimeK1 / TIMES;
			totalTimeK2 = totalTimeK2 / TIMES;
			totalTimeK3 = totalTimeK3 / TIMES;
			totalTimeK4 = totalTimeK4 / TIMES;

			System.out.println("For n=" + n + " k(n/4)=" + k
					+ ": \n\tSelect Kth 1 time: " + totalTimeK1 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 2 time: " + totalTimeK2 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 3 time: " + totalTimeK3 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 4 time: " + totalTimeK4 * Math.pow(10, -9)
					+ " seconds.\n");

			k = n / 2;
			for (int j = 0; j < TIMES; j++) {
				startTime = System.nanoTime();
				selectKth1(array, k);
				endTime = System.nanoTime();
				totalTimeK1 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth2(array, k);
				endTime = System.nanoTime();
				totalTimeK2 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth3(array, k);
				endTime = System.nanoTime();
				totalTimeK3 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth4(array, k);
				endTime = System.nanoTime();
				totalTimeK4 += endTime - startTime;
			}

			totalTimeK1 = totalTimeK1 / TIMES;
			totalTimeK2 = totalTimeK2 / TIMES;
			totalTimeK3 = totalTimeK3 / TIMES;
			totalTimeK4 = totalTimeK4 / TIMES;

			System.out.println("For n=" + n + " k(n/2)=" + k
					+ ": \n\tSelect Kth 1 time: " + totalTimeK1 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 2 time: " + totalTimeK2 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 3 time: " + totalTimeK3 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 4 time: " + totalTimeK4 * Math.pow(10, -9)
					+ " seconds.\n");

			k = (3 * n) / 4;
			for (int j = 0; j < TIMES; j++) {
				startTime = System.nanoTime();
				selectKth1(array, k);
				endTime = System.nanoTime();
				totalTimeK1 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth2(array, k);
				endTime = System.nanoTime();
				totalTimeK2 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth3(array, k);
				endTime = System.nanoTime();
				totalTimeK3 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth4(array, k);
				endTime = System.nanoTime();
				totalTimeK4 += endTime - startTime;
			}

			totalTimeK1 = totalTimeK1 / TIMES;
			totalTimeK2 = totalTimeK2 / TIMES;
			totalTimeK3 = totalTimeK3 / TIMES;
			totalTimeK4 = totalTimeK4 / TIMES;

			System.out.println("For n=" + n + " k(3n/4)=" + k
					+ ": \n\tSelect Kth 1 time: " + totalTimeK1 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 2 time: " + totalTimeK2 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 3 time: " + totalTimeK3 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 4 time: " + totalTimeK4 * Math.pow(10, -9)
					+ " seconds.\n");
			
			k = n;
			for (int j = 0; j < TIMES; j++) {
				startTime = System.nanoTime();
				selectKth1(array, k);
				endTime = System.nanoTime();
				totalTimeK1 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth2(array, k);
				endTime = System.nanoTime();
				totalTimeK2 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth3(array, k);
				endTime = System.nanoTime();
				totalTimeK3 += endTime - startTime;

				startTime = System.nanoTime();
				selectKth4(array, k);
				endTime = System.nanoTime();
				totalTimeK4 += endTime - startTime;
			}

			totalTimeK1 = totalTimeK1 / TIMES;
			totalTimeK2 = totalTimeK2 / TIMES;
			totalTimeK3 = totalTimeK3 / TIMES;
			totalTimeK4 = totalTimeK4 / TIMES;

			System.out.println("For n=" + n + " k(n)=" + k
					+ ": \n\tSelect Kth 1 time: " + totalTimeK1 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 2 time: " + totalTimeK2 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 3 time: " + totalTimeK3 * Math.pow(10, -9)
					+ " seconds.\n\tSelect Kth 4 time: " + totalTimeK4 * Math.pow(10, -9)
					+ " seconds.\n");
		}
	}

	public static int[] generateArray(int n) {
		Random r = new Random();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = r.nextInt(100);

		}
		return array;
	}

	public static int selectKth1(int[] a, int k) {
		mergeSort(a);
		return a[k - 1];
	}

	private static int[] mergeSort(int[] a) {
		if (a.length <= 1) {
			return a;
		}

		int[] left = new int[a.length / 2];
		int[] right = new int[a.length - left.length];

		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, left.length, right, 0, right.length);

		mergeSort(left);
		mergeSort(right);

		merge(left, right, a);
		return a;
	}

	private static void merge(int[] left, int[] right, int[] a) {
		int iLeft = 0;
		int iRight = 0;

		int j = 0;
		while (iLeft < left.length && iRight < right.length) {
			if (left[iLeft] < right[iRight]) {
				a[j] = left[iLeft];
				iLeft++;
			} else {
				a[j] = right[iRight];
				iRight++;
			}
			j++;
		}
		System.arraycopy(left, iLeft, a, j, left.length - iLeft);
		System.arraycopy(right, iRight, a, j, right.length - iRight);
	}

	public static int selectKth2(int[] a, int k) {
		int pivot, pivotPos, check, max, min;
		int[] copy = new int[a.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = a[i];
		}

		max = copy.length - 1;
		min = 0;
		while (true) {
			pivotPos = min;
			check = max;
			pivot = copy[pivotPos];
			while (pivotPos + 1 < copy.length && check >= pivotPos + 1) {
				if (copy[check] < pivot) {
					swap(copy, check, pivotPos + 1);
					swap(copy, pivotPos, pivotPos + 1);
					pivotPos++;
				} else {
					check--;
				}
			}
			if (pivotPos == k - 1) {
				return pivot;
			} else if (pivotPos > k - 1) {
				max = pivotPos - 1;
			} else {
				min = pivotPos + 1;
			}
		}
	}

	public static int selectKth3(int[] a, int k) {
		int[] copy = new int[a.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = a[i];
		}
		return selectKth3Helper(copy, k, 0, copy.length - 1);
	}

	private static int selectKth3Helper(int[] a, int k, int min, int max) {
		int pivot, pivotPos, check;
		pivotPos = min;
		check = max;
		pivot = a[pivotPos];
		while (pivotPos + 1 < a.length && check >= pivotPos + 1) {
			if (a[check] < pivot) {
				swap(a, check, pivotPos + 1);
				swap(a, pivotPos, pivotPos + 1);
				pivotPos++;
			} else {
				check--;
			}
		}
		if (pivotPos == k - 1) {
			return pivot;
		} else if (pivotPos > k - 1) {
			return selectKth3Helper(a, k, min, pivotPos - 1);
		} else {
			return selectKth3Helper(a, k, pivotPos + 1, max);
		}
	}

	public static int selectKth4(int[] a, int k) {
		int pivot, pivotPos, next, check, max, min;
		int[] copy = new int[a.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = a[i];
		}

		max = copy.length - 1;
		min = 0;
		while (true) {
			if (min == max) {
				return copy[min];
			}
			pivotPos = getMM(copy, min, max);
			next = min;
			check = max;
			pivot = copy[pivotPos];
			while (pivotPos > next) {
				if (copy[next] > pivot) {
					swap(copy, next, pivotPos);
					int t = pivotPos;
					pivotPos = next;
					next = t;
					break;
				} else {
					next++;
				}
			}
			while (pivotPos + 1 < copy.length && check >= pivotPos + 1) {
				if (copy[check] < pivot) {
					swap(copy, check, pivotPos + 1);
					swap(copy, pivotPos, pivotPos + 1);
					pivotPos++;
				} else {
					check--;
				}
			}
			if (pivotPos == k - 1) {
				return pivot;
			} else if (pivotPos > k - 1) {
				max = pivotPos - 1;
			} else {
				min = pivotPos + 1;
			}
		}
	}

	private static int getMM(int[] a, int min, int max) {

		int[] copy = new int[max - min];
		int t = min;
		for (int i = 0; i < copy.length; i++) {
			copy[i] = a[t++];
		}

		if (copy.length < 5) {
			if (copy.length > 2) {
				t = copy[1];
			} else {
				t = copy[0];
			}
		} else {

			ArrayList<int[]> groups = new ArrayList<int[]>();
			int counter = 0;
			int groupAmt = copy.length / 5;
			int[] temp;
			for (int i = 0; i < groupAmt; i++) {
				temp = new int[5];
				for (int j = 0; j < temp.length; j++) {
					if (counter == copy.length) {
						break;
					}
					temp[j] = copy[counter++];
				}
				Arrays.sort(temp);
				groups.add(temp);
			}

			int[] medians = new int[groupAmt];
			for (int i = 0; i < groupAmt; i++) {
				medians[i] = groups.get(i)[2];
			}

			Arrays.sort(medians);
			t = medians[0];
			if (medians.length > 2) {
				if (medians.length % 2 == 0) {
					t = medians[medians.length / 2 - 1];
				} else {
					t = medians[medians.length / 2];
				}
			}
		}

		for (int i = min; i < max; i++) {
			if (a[i] == t) {
				return i;
			}
		}
		return -1;
	}

	private static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
