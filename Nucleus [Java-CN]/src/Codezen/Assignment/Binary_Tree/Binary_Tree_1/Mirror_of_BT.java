package Codezen.Assignment.Binary_Tree.Binary_Tree_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

public class Mirror_of_BT {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        Creation_of_Binary_Tree.print_tree(mirror_of_BT(root));
    }

    public static Binary_Tree_Node<Integer> mirror_of_BT(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return null;
        }
        Binary_Tree_Node<Integer> temp=root.left;
        root.left=mirror_of_BT(root.right);
        root.right=mirror_of_BT(temp);
        return root;
    }
}
