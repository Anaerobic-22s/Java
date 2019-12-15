import javax.swing.tree.TreeNode;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class test {
    //中序遍历
    void inOrderTrsversal(TreeNode root){
        if (root == null){
            return;
        }
        inOrderTrsversal(root.left);
        System.out.print(root.value + " ");
        inOrderTrsversal(root.right);
    }
    //后序遍历
    void OrderTrsversal(TreeNode root){
        if (root == null){
            return;
        }
        inOrderTrsversal(root.left);
        inOrderTrsversal(root.right);
        System.out.print(root.value + " ");
    }
}
class Solution{
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return;
        }
        list.add(root.val);
        List<Integer> list1 = preorderTraversal(root.left);
        list.addAll(list1);
        System.out.print(root.val);
        List<Integer> list2 = preorderTraversal(root.right);
        list.addAll(list2);
    }
}
