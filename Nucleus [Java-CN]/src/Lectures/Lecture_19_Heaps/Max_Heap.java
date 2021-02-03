package Lectures.Lecture_19_Heaps;

public class Max_Heap<T> extends Priority_Queue<T>  {

    @Override
    public void up_heapify(int index) {
        int parent_index=get_parent(index);
        if (parent_index!=-1 && heap.get(index).priority>heap.get(parent_index).priority)
        {
            swap(index,parent_index);
            up_heapify(parent_index);
        }
    }

    @Override
    public void down_heapify(int index) {
        int left_index=get_left_child_index(index);
        int right_index=get_right_child_index(index);
        int highest_priority=-1;
        if(left_index!=-1 && right_index!=-1)
        {
            if(heap.get(left_index).priority>heap.get(right_index).priority)
            {
                highest_priority=left_index;
            }
            else
            {
                highest_priority=right_index;
            }
        }

        else if(left_index!=-1)
        {
            highest_priority=left_index;
        }

        if(highest_priority!=-1 && heap.get(index).priority<heap.get(highest_priority).priority)
        {
            swap(index,highest_priority);
            down_heapify(highest_priority);
        }
    }
}
