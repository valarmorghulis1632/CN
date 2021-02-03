package Codezen.Assignment.BST.BST_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Print_Nodes_at_Dist_K_from_Node {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        print_nodes_at_dist_k_from_node(root,root,scanner.nextInt(),scanner.nextInt());
    }

    public static boolean print_nodes_at_dist_k_from_node(Binary_Tree_Node<Integer> root_1,Binary_Tree_Node<Integer> root, int node, int k)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==node)
        {
            subtree_print_node(root,k);
            path_to_node(root_1,node,k);
            return true;
        }
        if(print_nodes_at_dist_k_from_node(root_1,root.left,node,k))
        {
            return true;
        }
        else
        {
            if(print_nodes_at_dist_k_from_node(root_1,root.right,node,k))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    private static Integer path_to_node(Binary_Tree_Node<Integer> root, int node, int k) {
        if(root==null)
        {
            return null;
        }
        if(root.data==node)
        {
            return k-1;
        }
        Integer ans_left=path_to_node(root.left,node,k);
        if(ans_left!=null && ans_left==0)
        {
            System.out.print(root.data+" ");
            return null;
        }
        else if(ans_left!=null)
        {
            subtree_print_node(root.right,ans_left-1);
            return ans_left-1;
        }
        Integer ans_right=path_to_node(root.right,node,k);
        if(ans_right!=null && ans_right==0)
        {
            System.out.print(root.data+" ");
            return null;
        }
        else if(ans_right!=null)
        {
            subtree_print_node(root.left,ans_right-1);
            return ans_right-1;
        }
        return null;
    }

    private static void subtree_print_node(Binary_Tree_Node<Integer> root, int k) {
        if(root==null)
        {
            return;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int count=0;
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null && !(queue.isEmpty()))
            {
                queue.add(null);
                count++;
                if(count>k)
                {
                    return;
                }
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                return;
            }
            if(count==k)
            {
                System.out.println(current_node.data);
            }
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
