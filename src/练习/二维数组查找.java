package ��ϰ;
/**
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 * @author chenchen30
 *
 */
public class ��ά������� {

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
