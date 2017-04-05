package 练习;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * 有一棵二叉树，请设计一个算法，按照层次打印这棵二叉树。
给定二叉树的根结点root，请返回打印结果，结果按照每一层一个数组进行储存
所有数组的顺序按照层数从上往下，且每一层的数组内元素按照从左往右排列。保证结点数小于等于500
 * @author chenchen30
 *
 */
public class 按照层打印二叉树 {

	 public int[][] printTree(TreeNode root) {
	        // write code here
		 Queue<TreeNode> queue = new LinkedBlockingQueue<>();
		 queue.offer(root);
		 while(!queue.isEmpty()){
			 root = queue.poll();
			 if(root!=null){
				int val =  root.val;
			 }
		 }
		 return null;
	 }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}