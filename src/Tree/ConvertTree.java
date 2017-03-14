package Tree;


import java.util.Arrays;

/**
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
 * ���ؽ������������ء�
 * @author fish
 *
 */

public class ConvertTree {

	public static void main(String[] args) {
		int pre[] = {1,2,3,4,5,6,7};
		int in[] = {3,2,4,1,6,5,7};

		TreeNode result = reConstructBinaryTree(pre,in);
		
		

	}
	
	 public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        if(pre.length == 0||in.length == 0){
	            return null;
	        }
	        TreeNode now = new TreeNode(pre[0]);
	        for(int i=0;i<in.length;i++){
	           if(pre[0]==in[i]){
	               now.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1),Arrays.copyOfRange(in, 0,i));
	               now.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1,pre.length),Arrays.copyOfRange(in, i+1,in.length));      
	           }
	        }
	        return now;
	 }
}