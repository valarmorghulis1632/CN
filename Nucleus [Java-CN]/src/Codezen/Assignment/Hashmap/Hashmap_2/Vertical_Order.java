package Codezen.Assignment.Hashmap.Hashmap_2;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Vertical_Order {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        vertical_order(root);
    }

    private static void vertical_order(Binary_Tree_Node<Integer> root) {
        HashMap<Integer,ArrayList<Integer>> hashMap=new HashMap<>();
        add_in_map(root,hashMap,0);
        for (Map.Entry<Integer,ArrayList<Integer>> entry:hashMap.entrySet())
        {
            ArrayList<Integer> arrayList=entry.getValue();
            int i=0;
            while (i<arrayList.size())
            {
                System.out.print(arrayList.get(i)+" ");
                i++;
            }
            System.out.println("");
        }
    }

    public static void add_in_map(Binary_Tree_Node<Integer> root, HashMap<Integer, ArrayList<Integer>> hashMap,int order) {
        if(root==null)
        {
            return;
        }
        if(hashMap.containsKey(order))
        {
            ArrayList<Integer> temp=hashMap.get(order);
            temp.add(root.data);
            hashMap.put(order,temp);
        }
        else
        {
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(root.data);
            hashMap.put(order,temp);
        }
        add_in_map(root.left,hashMap,order-1);
        add_in_map(root.right,hashMap,order+1);
    }
}
