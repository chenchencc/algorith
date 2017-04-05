package 练习;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class 树按层遍历 {

	public static void main(String[] args) {
		Tree root = new Tree();
		root.setData("root");
		Tree t1 = new Tree();
		t1.setData("1");
		root.setLeft(t1);
		Tree t2 = new Tree();
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
		t3.setRight(t8);
		foreach(root);
	}
	/**
	 * 按层遍历
	 * @param t
	 */
	public static void foreach(Tree t){
		//首先将遍历的节点放入队列中
		Queue<Tree> queue = new LinkedBlockingDeque<Tree>();
		
		if(t!=null){
			queue.offer(t);//root
			Tree tt = null;
			while(!queue.isEmpty()){
				tt = queue.poll();
				if(tt!=null){
					System.out.print(tt.getData());
					if(tt.getLeft()!=null)
					  queue.offer(tt.getLeft());
					if(tt.getRight()!=null)
					  queue.offer(tt.getRight());
					
				}
				/*tt = tt.getLeft();
				tt = tt.getRight();
				if(tt != null)*/
			}
		}
	}
}
