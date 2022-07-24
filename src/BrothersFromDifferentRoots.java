import java.util.HashMap;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data, TreeNode left, TreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class BrothersFromDifferentRoots {

    static void addRoot1(TreeNode root1, HashMap<Integer, Boolean> map){
        if(root1 == null) return;

        map.put(root1.data, true);
        addRoot1(root1.left, map);
        addRoot1(root1.right, map);
    }


    public static void main(String[] args) {

    }
}
