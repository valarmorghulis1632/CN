package linkedlist;

import java.util.ArrayList;

public class ArrayListPractise {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<>();
		list.add(10);
		list.add('C');
		list.add("wekjdhkjwqed");
		
		list.get(5);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		for(Character c:list){
			System.out.println(c);
		}
	}
}
