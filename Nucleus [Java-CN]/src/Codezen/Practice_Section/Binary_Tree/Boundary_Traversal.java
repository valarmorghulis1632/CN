package Codezen.Practice_Section.Binary_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Boundary_Traversal {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        find_boundary_traversal(root);
    }

    private static void find_boundary_traversal(Binary_Tree_Node<Integer> root) {
        ArrayList<Integer> left_path=new ArrayList<>();
        left_path.add(root.data);
        left_path=get_left_path(root.left,left_path);
        ArrayList<Integer> right_path=get_right_path(root.right);
        ArrayList<Integer> leaves=get_leaves(root);
        left_path.addAll(leaves);
        left_path.addAll(right_path);
        for (int x :left_path)
        {
            System.out.print(x+" ");
        }
    }

    private static ArrayList<Integer> get_leaves(Binary_Tree_Node<Integer> root) {
        if(root==null)
        {
            return null;
        }
        Queue<Binary_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (!queue.isEmpty())
        {
            Binary_Tree_Node<Integer> current_node=queue.remove();
            if(current_node.left==null && current_node.right==null)
            {
                arrayList.add(current_node.data);
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
        return arrayList;
    }

    private static ArrayList<Integer> get_right_path(Binary_Tree_Node<Integer> root) {
        if(root.right==null && root.left==null)
        {
            return new ArrayList<>();
        }
        ArrayList<Integer> list;
        if(root.right!=null)
        {
            list=get_right_path(root.right);
        }
        else
        {
            list=get_right_path(root.left);
        }
        list.add(root.data);
        return list;
    }

    private static ArrayList<Integer> get_left_path(Binary_Tree_Node<Integer> root, ArrayList<Integer> arrayList) {
        if(root.left==null && root.right==null)
        {
            return arrayList;
        }
        arrayList.add(root.data);
        if(root.left!=null)
        {
            return get_left_path(root.left,arrayList);
        }
        else
        {
            return get_left_path(root.right,arrayList);
        }
    }
}
