package Lectures.Lecture_19_Heaps;

public class Heap_Test {
    public static void main(String[] args) {
        Priority_Queue<Integer> queue=new Max_Heap<>();
        queue.add(22,22);
        queue.add(2,2);
        queue.add(5,5);
        queue.add(10,10);
        queue.add(7,7);

        while (queue.size()!=0)
        {
            System.out.print(queue.remove()+" ");
        }
    }
}
