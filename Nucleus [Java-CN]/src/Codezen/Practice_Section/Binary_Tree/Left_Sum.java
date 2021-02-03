package Codezen.Practice_Section.Binary_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Left_Sum {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(left_sum(root));
    }

    private static int left_sum(Binary_Tree_Node<Integer> root) {
        if(root==null)
        {
            return 0;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int sum=0;
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null && !queue.isEmpty())
            {
                queue.add(null);
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                return sum;
            }
            if(current_node.left!=null)
            {
                queue.add(current_node.left);
                sum=sum+current_node.left.data;
            }
            if(current_node.right!=null)
            {
                queue.add(current_node.right);
            }
        }
        return sum;
    }
}
