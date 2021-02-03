package Codezen.Assignment.BST.BST_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LCA_of_BT {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(lca_of_BT(root,scan.nextInt(),scan.nextInt()));
    }

    public static int lca_of_BT(Binary_Tree_Node<Integer> root,int a,int b)
    {
        ArrayList<Integer> path_A=find_path(root,a);
        ArrayList<Integer> path_B=find_path(root,b);
        if(path_A==null && path_B==null)
        {
            return -1;
        }
        if(path_A==null)
        {
            return b;
        }
        if(path_B==null)
        {
            return a;
        }
        HashSet<Integer> hashSet_A=new HashSet<>();
        for (int x:path_A)
        {
            hashSet_A.add(x);
        }
        for (int m :path_B)
        {
            if(hashSet_A.contains(m))
            {
                return m;
            }
        }
        return -1;
    }

    private static ArrayList<Integer> find_path(Binary_Tree_Node<Integer> root, int x) {
        if(root==null)
        {
            return null;
        }
        if(root.data==x)
        {
            ArrayList<Integer> arrayList=new ArrayList<>();
            arrayList.add(x);
            return arrayList;
        }
        ArrayList<Integer> left_ans=find_path(root.left,x);
        if(left_ans!=null)
        {
            left_ans.add(root.data);
            return left_ans;
        }
        ArrayList<Integer> right_ans=find_path(root.right,x);
        if(right_ans!=null)
        {
            right_ans.add(root.data);
            return right_ans;
        }
        return null;
    }



//    public static int lca_of_BT(Binary_Tree_Node<Integer> root,int a,int b)
//    {
//        int find_a=search_1(root,a);
//        if(find_a==-1)
//        {
//            int find_b=search_1(root,b);
//            return find_b;
//        }
//        else
//        {
//            int find_b=search_1(root,b);
//            if(find_b==-1)
//            {
//                return find_a;
//            }
//            return lca_of_BT_1(root, a, b);
//        }
//    }
//
//    public static int lca_of_BT_1(Binary_Tree_Node<Integer> root,int a,int b)
//    {
//        if(root==null)
//        {
//            return -1;
//        }
//        if(root.data==a)
//        {
//            return a;
//        }
//        if(root.data==b)
//        {
//            return b;
//        }
//        int left_ans=search(root.left,a,b);
//        if(left_ans==Integer.MIN_VALUE)
//        {
//            return lca_of_BT_1(root.right,a,b);
//        }
//        int right_ans=search(root.right,a,b);
//        if(right_ans==Integer.MIN_VALUE)
//        {
//            return lca_of_BT_1(root.left,a,b);
//        }
//        return root.data;
//    }
//
//    public static int search(Binary_Tree_Node<Integer> root, int a, int b)
//    {
//        if(root==null)
//        {
//            return Integer.MIN_VALUE;
//        }
//        if(root.data==a)
//        {
//            return a;
//        }
//        if(root.data==b)
//        {
//            return b;
//        }
//        int left_ans=search(root.left,a,b);
//        if(left_ans!=Integer.MIN_VALUE)
//        {
//            return left_ans;
//        }
//        int right_ans=search(root.right,a,b);
//        return right_ans;
//    }
//
//    public static int search_1(Binary_Tree_Node<Integer> root,int data)
//    {
//        if(root==null)
//        {
//            return -1;
//        }
//        if(root.data==data)
//        {
//            return data;
//        }
//        int left_ans=search_1(root.left,data);
//        if(left_ans!=-1)
//        {
//            return left_ans;
//        }
//        return search_1(root.right,data);
//    }
}
