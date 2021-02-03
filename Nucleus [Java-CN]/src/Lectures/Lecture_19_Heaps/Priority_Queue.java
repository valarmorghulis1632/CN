package Lectures.Lecture_19_Heaps;

import java.util.ArrayList;

public abstract class Priority_Queue <T> {
    ArrayList<Priority_Node<T>> heap;

    public Priority_Queue()
    {
        this.heap=new ArrayList<>();
    }

    public void add(T data,int priority)
    {
        Priority_Node<T> newNode = new Priority_Node<>(data, priority);
        heap.add(newNode);
        up_heapify(heap.size()-1);
    }

    public abstract void up_heapify(int index);
    public abstract void down_heapify(int index);

    public T remove()
    {
        T temp=heap.get(0).data;
        heap.set(0,heap.get(size()-1));
        heap.remove(size()-1);
        down_heapify(0);
        return temp;
    }

    public int size()
    {
        return heap.size();
    }

    public int get_parent(int index)
    {
        return (index-1)/2;
    }

    public int get_left_child_index(int index)
    {
        int left_index=(2*index)+1;
        if(left_index>=size())
        {
            return -1;
        }
        return left_index;
    }

    public int get_right_child_index(int index)
    {
        int right_index=(2*index)+2;
        if(right_index>=size())
        {
            return -1;
        }
        return right_index;
    }

    public void swap(int index_1,int index_2)
    {
        Priority_Node<T> temp=heap.get(index_1);
        heap.set(index_1,heap.get(index_2));
        heap.set(index_2,temp);
    }

}
