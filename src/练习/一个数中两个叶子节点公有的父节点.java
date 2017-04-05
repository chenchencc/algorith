package 练习;

/**
 * 在一棵树种，求两个叶子节点的共同父节点
 * @author chenchen30
 *
 */
public class 一个数中两个叶子节点公有的父节点 {
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
