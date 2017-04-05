package 练习;

public class 字符串旋转 {
/**
 * 如果对于一个字符串A，将A的前面任意一部分挪到后边去形成的字符串称为A的旋转词。比如A="12345",
 * A的旋转词有"12345","23451","34512","45123"和"51234"。对于两个字符串A和B，
 * 请判断A和B是否互为旋转词。
给定两个字符串A和B及他们的长度lena，lenb，请返回一个bool值，代表他们是否互为旋转词。
测试样例：
"cdab",4,"abcd",4
返回：true
 * @param A
 * @param lena
 * @param B
 * @param lenb
 * @return
 */
	 public static boolean chkRotation(String A, int lena, String B, int lenb) {
	        // write code here
	        if(lena!=lenb) return false;
	       StringBuilder sb = new StringBuilder();
	       sb.append(A).append(A);
	       int indexb = 0;
	       
	       for(int i=0;i<sb.length();i++){
	    	   //
	    	   char ch = sb.charAt(i);
	    	   if(ch == B.charAt(indexb)){
	    		   int y = i;
	    		   while(y<sb.length()&&indexb<lenb){
	    			   if(sb.charAt(y) == B.charAt(indexb))
	    			   {
	    				   y++;
	    				   indexb++;
	    			   }
	    			   if( indexb == lenb)
	    				   return true;
	    			   break;
	    		   }
	    	   }
	       }
	       return false;
	    }
	 public static void main(String[] args) {
		System.out.println(chkRotation("ab4cd", 4, "cdab4", 4));
	}
}
