package ��ϰ;

public class �ַ�����ת {
/**
 * �������һ���ַ���A����A��ǰ������һ����Ų�����ȥ�γɵ��ַ�����ΪA����ת�ʡ�����A="12345",
 * A����ת����"12345","23451","34512","45123"��"51234"�����������ַ���A��B��
 * ���ж�A��B�Ƿ�Ϊ��ת�ʡ�
���������ַ���A��B�����ǵĳ���lena��lenb���뷵��һ��boolֵ�����������Ƿ�Ϊ��ת�ʡ�
����������
"cdab",4,"abcd",4
���أ�true
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
