package ��ϰ;

public class �ո��滻 {
	
public static String replaceSpace(StringBuffer str) {
	StringBuilder sb = new StringBuilder();
	int index = -1;//������¼��һ�γ��ֿո�ͷ��λ��
	for(int i=0;i<str.length();i++){
		char ch = str.charAt(i);
		if(ch == ' '){
			sb.append("%20");
		}else{
			sb.append(ch);
		}
	}
	return sb.toString();
}

public static void main(String[] args) {
	System.out.println(replaceSpace(new StringBuffer("qwe we werrr r")));
}

}
