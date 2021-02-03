package Lectures.Lecture_14_Generic_Tree;

import java.util.ArrayList;

public class Generic_Tree_Node<T>
{
    public T data;
    public ArrayList<Generic_Tree_Node<T>> children;

    public Generic_Tree_Node(T data)
    {
        this.data=data;
        children=new ArrayList<>();
    }
}
