
public class PartTwo {
	public int binarySearch(int [] arr, int key) {
		int lo=0, mid,hi = arr.length-1;// 1 + 0 + 3
		while (lo<=hi) {//n
			mid = (lo+hi)/2;//3*(n-1)
			if (key<arr[mid])//2*(n-1)
				hi=mid-1;//2
			else if (arr[mid]<key)//2*(n-1)
				lo=mid+1;//2
			else
				return mid;//1*n
		}
		return-1;//1
	}

}
