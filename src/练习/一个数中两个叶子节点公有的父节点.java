package ��ϰ;

/**
 * ��һ�����֣�������Ҷ�ӽڵ�Ĺ�ͬ���ڵ�
 * @author chenchen30
 *
 */
public class һ����������Ҷ�ӽڵ㹫�еĸ��ڵ� {
	public static void main(String[] args) {
		Tree root = new Tree();
		Tree t1 = new Tree();
		root.setLeft(t1);
		Tree t2 = new Tree();
		t1.setLeft(t2);
		Tree t3 = new Tree();
		t2.setLeft(t3);
		Tree t4 = new Tree();
		root.setRight(t4);
		Tree t5 = new Tree();
		t4.setLeft(t5);
	}
	
	public static void search(){
		//
	}
}
