package Practice_Quests.BST;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

public class Count_Leaf_Nodes {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(count_leaf_nodes(root));
    }

    public static int count_leaf_nodes(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        return count_leaf_nodes(root.left)+count_leaf_nodes(root.right);
    }
}
