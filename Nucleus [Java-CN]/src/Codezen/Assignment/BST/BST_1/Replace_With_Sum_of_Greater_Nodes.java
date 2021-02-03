package Codezen.Assignment.BST.BST_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;

public class Replace_With_Sum_of_Greater_Nodes {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        replace_with_sum_of_greater_nodes(root);
        Creation_of_Binary_Tree.print_tree(root);
    }

    public static void replace_with_sum_of_greater_nodes(Binary_Tree_Node<Integer> root)
    {
        ArrayList<Binary_Tree_Node<Integer>> arrayList=gives_inorder_array(root);
        int i=0,sum=0;
        while (i<arrayList.size())
        {
            sum=0;
            int j=i;
            while (j<arrayList.size())
            {
                sum=sum+arrayList.get(j).data;
                j++;
            }
            arrayList.get(i).data=sum;
            i++;
        }
    }

    public static ArrayList<Binary_Tree_Node<Integer>> gives_inorder_array(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return new ArrayList<>();
        }
        ArrayList<Binary_Tree_Node<Integer>> arrayList_1=gives_inorder_array(root.left);
        arrayList_1.add(root);
        ArrayList<Binary_Tree_Node<Integer>> arrayList_2=gives_inorder_array(root.right);
        int i=0;
        while (i<arrayList_2.size())
        {
            arrayList_1.add(arrayList_2.get(i));
            i++;
        }
        return arrayList_1;
    }
}
