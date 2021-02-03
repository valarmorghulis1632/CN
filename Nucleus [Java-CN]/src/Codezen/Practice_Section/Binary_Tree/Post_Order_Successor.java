package Codezen.Practice_Section.Binary_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Post_Order_Successor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        System.out.print(postorder_successor(root,scanner.nextInt()));
    }

    private static int postorder_successor(Binary_Tree_Node<Integer> root, int m) {
        ArrayList<Integer> arrayList=postrorder_helper(root);
        int i=0;
        while (i<arrayList.size())
        {
            if(arrayList.get(i)==m)
            {
                try {
                    return arrayList.get(i+1);
                }
                catch (Exception e)
                {
                    return -1;
                }
            }
            i++;
        }
        return -1;
    }

    public static ArrayList<Integer> postrorder_helper(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return new ArrayList<>();
        }
        ArrayList<Integer> left_ans=postrorder_helper(root.left);
        ArrayList<Integer> right_ans=postrorder_helper(root.right);
        left_ans.addAll(right_ans);
        left_ans.add(root.data);
        return left_ans;
    }
}
