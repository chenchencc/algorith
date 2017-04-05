package sort;

import common.Util;

public class Shell {
	public static void main(String[] args) {
		int[] a = new int[]{6,56,3,42,34,565,234,32};
		sort(a);
		Util.print(a);
	}
	public static void sort(int[] a){
		int h = 1;
		while(h<a.length/3)
			h = 3*h+1;
		while(h>=1){
			for(int i=h;i<a.length;i++){
				for(int j=i;j>=h&&a[j]<a[j-h];j-=h){
					int t = a[j];
					a[j] = a[j-h];
					a[j-h] = t;
				}
			}
			h = h/3;
		}
	}
}
