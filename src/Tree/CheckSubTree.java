package Tree;


/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * @author fish
 *
 */
public class CheckSubTree {

	    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
			if(root1==null||root2==null){
	            return false;
	        }
	        return IsSubtree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
	        
	    }
	    
	    private boolean IsSubtree(TreeNode root1,TreeNode root2){
	        if(root2 == null){
	            return true;
	        }
	        
	        if(root1 == null ){
	            return false;
	        }
	        
	        if(root1.val==root2.val){
	        	return  IsSubtree(root1.left,root2.left)&&IsSubtree(root1.right,root2.right);   
	        }else{
	            return false;
	        }
	    }

}
