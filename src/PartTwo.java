public class PartTwo {
	public int binarySearch(int [] arr, int key) {
		int lo = 0, mid, hi = arr.length - 1; // 1 + 0 + 3
		while (lo <= hi) {// log n 
			mid = (lo + hi)/2;
			if (key < arr[mid])
				hi = mid - 1;
			else if (arr[mid] < key)
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}
}
