package sort;

import common.Util;

public class Select {
public static void main(String[] args) {
	int[] a = new int[]{6,56,3,42,34,565,234,32};
	sort(a);
	Util.print(a);
}
public static void sort(int[] a){
	for(int i=0;i<a.length;i++){
		int min = i;
		for(int j=i;j<a.length;j++){
			if(a[min]>a[j])
				min = j;
		}
		int t = a[min];
		a[min] = a[i];
		a[i] = t;
	}
}
	
}
