package sort;

import common.Util;

public class Insert {

	public static void main(String[] args) {
		int[] a = new int[]{6,56,3,42,34,565,234,32};
		sort(a);
		Util.print(a);
	}
	
	public static void sort(int[] a){
		for(int i=1;i<a.length;i++){
			for(int j=i;j>0&&a[j]<a[j-1];j--){
				int t = a[j];
				a[j] = a[j-1];
				a[j-1] = t;
			}
		}
	}
}
