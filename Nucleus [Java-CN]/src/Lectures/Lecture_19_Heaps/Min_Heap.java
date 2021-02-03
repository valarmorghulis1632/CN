package Lectures.Lecture_19_Heaps;

public class Min_Heap<T> extends Priority_Queue<T> {
    @Override
    public void up_heapify(int index) {
        int parent_index=get_parent(index);
        if(parent_index!=-1 && heap.get(parent_index).priority>heap.get(index).priority)
        {
            swap(index,parent_index);
            up_heapify(parent_index);
        }
    }

    @Override
    public void down_heapify(int index) {
        int left_index=get_left_child_index(index);
        int right_index=get_right_child_index(index);
        int lowest_priority=-1;
        if(left_index!=-1 && right_index!=-1)
        {
            if(heap.get(left_index).priority>heap.get(right_index).priority)
            {
                lowest_priority=right_index;
            }
            else
            {
                lowest_priority=left_index;
            }
        }

        else if(left_index!=-1)
        {
            lowest_priority=left_index;
        }

        if(lowest_priority!=-1 && heap.get(lowest_priority).priority<heap.get(index).priority)
        {
            swap(index,lowest_priority);
            down_heapify(lowest_priority);
        }
    }
}
