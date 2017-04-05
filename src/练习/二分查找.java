package 练习;

public class 二分查找 {

	public static void main(String[] args) {
		int[] a = new int[]{3,7,4,24,5};
		System.out.println(getPos(new int[]{3,7,4,24,5},4,0,5));
	}
	//循环
	public static int getPos(int[] a,int val){
		int l = 0;
		int h = a.length;
		while(l<=h){
			int mid = (l+h)/2;
			if(a[mid]>val)
				h = mid;
			if(a[mid] <val)
				l = mid;
			return mid;
		}
		return -1;
	}
	//递归
	public static int getPos(int[] a,int val,int l,int h){
		int mid = (l+h)/2;
		if(a[mid]>val)
			getPos(a, val, l, mid);
		if(a[mid]<val)
			getPos(a, val,mid,h);
		return mid;
	}
}
