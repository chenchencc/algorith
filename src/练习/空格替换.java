package 练习;

public class 空格替换 {
	
public static String replaceSpace(StringBuffer str) {
	StringBuilder sb = new StringBuilder();
	int index = -1;//用来记录上一次出现空格开头的位置
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
