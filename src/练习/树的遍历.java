package 练习;

public class 树的遍历 {

	public static void main(String[] args) {
		Tree root = new Tree();
		root.setData("root");
		Tree t1 = new Tree();
		t1.setData("1");
		root.setRight(t1);
		/*Tree t2 = new Tree();
		t2.setData("2");
		t1.setLeft(t2);
		Tree t3 = new Tree();
		t3.setData("3");
		t2.setLeft(t3);
		Tree t4 = new Tree();
		t4.setData("4");
		root.setRight(t4);
		Tree t5 = new Tree();
		t5.setData("5");
		t4.setRight(t5);
		Tree t6 = new Tree();
		t6.setData("6");
		t1.setRight(t6);
		Tree t7 = new Tree();
		t7.setData("7");
		t5.setLeft(t7);
		Tree t8 = new Tree();
		t8.setData("8");
		t3.setRight(t8);*/
		fisrt(root);
	}
	/**
	 * 先序遍历
	 * @param t
	 */
	public static void fisrt(Tree t){
		if(t != null){
			System.out.println(t.getData());
			//左节点
			fisrt(t.getLeft());
            //右节点
			fisrt(t.getRight());
		}
	}
	
	public static void mid(Tree t){
		if(t == null) return;
			//左节点
			mid(t.getLeft());
			System.out.println(t.getData());
            //右节点
			mid(t.getRight());
		
	}
	
	public static void after(Tree t){
		if(t != null){
			//左节点
			after(t.getLeft());
            //右节点
			after(t.getRight());
			System.out.println(t.getData());
		}
	}
}
