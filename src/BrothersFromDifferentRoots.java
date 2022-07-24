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
    static int count;
    static void addRoot1(TreeNode root1, HashMap<Integer, Boolean> map){
        if(root1 == null) return;

        map.put(root1.data, true);
        addRoot1(root1.left, map);
        addRoot1(root1.right, map);
    }
    static void checkRoot2(TreeNode root2, HashMap<Integer, Boolean> map, int target){
        if(root2 == null) return;

        int difference = target - root2.data;
        if(map.containsKey(difference)){
            count ++;
        }
        checkRoot2(root2.left, map, target);
        checkRoot2(root2.right, map, target);
    }
    static int brothersFromDifferentRoots(TreeNode root1, TreeNode root2, int target){
        HashMap<Integer, Boolean> map  = new HashMap<>();

        addRoot1(root1, map);
        count = 0;
        checkRoot2(root2, map, target);
        return count;
    }


    public static void main(String[] args) {

    }
}
