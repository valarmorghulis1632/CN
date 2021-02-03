package Codezen.Assignment.Binary_Tree.Binary_Tree_2;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        level_order_traversal(root);
    }

    public static void level_order_traversal(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null && !(queue.isEmpty()))
            {
                queue.add(null);
                System.out.println("");
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                return;
            }
            System.out.print(current_node.data+" ");
            if(current_node.left!=null)
            {
                queue.add(current_node.left);
            }
            if(current_node.right!=null)
            {
                queue.add(current_node.right);
            }
        }
    }
}
