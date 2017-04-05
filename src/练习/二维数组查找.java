package 练习;
/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author chenchen30
 *
 */
public class 二维数组查找 {

	public static boolean Find(int target, int [][] a) {
	       int len = a.length-1;//x
	       int i = 0;//y
	       while(len>=0&&i<a[0].length){
	    	   if(a[len][i]>target)
	    		   len--;
	    	   else if(a[len][i]<target)
	    		   i++;
	    	   else{
	    		   return true;	    		   
	    	   }
	    		   
	       }
	       return false;
	}
	public static void main(String[] args) {
		int[][] a = new int[][]{{1,3,5,6},{2,4,6,7},{3,5,8,9}};

Find(8, a);
	}
}
