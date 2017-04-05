package 练习;

public class 数的深度 {

	/**
	 * 求一棵树的深度
	 * @param args
	 */
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
		System.out.println(getDeep(root));
	}
	
	public static int getDeep(Tree t){
		if(t == null)
			return 0;
		int left = getDeep(t.getLeft());
		int right = getDeep(t.getRight());
		return Math.max(left, right)+1;
	}
}
class Tree{
	private Object data;
	private Tree left;
	private Tree right;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Tree getLeft() {
		return left;
	}
	public void setLeft(Tree left) {
		this.left = left;
	}
	public Tree getRight() {
		return right;
	}
	public void setRight(Tree right) {
		this.right = right;
	}
	public Tree(Object data, Tree left, Tree right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public Tree() {
		// TODO Auto-generated constructor stub
	}
}
