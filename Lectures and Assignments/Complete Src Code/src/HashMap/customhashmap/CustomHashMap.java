package HashMap.customhashmap;

import java.util.ArrayList;

public class CustomHashMap<K, V> {

	ArrayList<MapNode<K, V>> bucket;
	int bucketSize;
	int noOfEntries;

	public CustomHashMap() {
		this.bucket = new ArrayList<>();
		this.bucketSize = 10;
		this.noOfEntries = 0;
		for(int i =0;i<bucketSize;i++){
			bucket.add(null);
		}
	}

	
	
	
	
	
	
	
	public void put(K key, V value) {
		int index = getIndex(key);
		MapNode<K,V> head = bucket.get(index);
		
		while(head!=null){
			if(head.key.equals(key)){
				head.value = value;
				return;
			}
			head= head.next;
		}
		
		MapNode<K,V> newNode = new MapNode<>(key,value);
		newNode.next =bucket.get(index);
		bucket.set(index, newNode);
		noOfEntries++;
		if((noOfEntries*(1.0))/bucketSize>.7){
			grow();
		}
	}
	
	
	
	private void grow() {
		ArrayList<MapNode<K,V>> temp = bucket;
		bucket= new ArrayList<>();
		bucketSize = bucketSize*2;
		for(int i =0;i<bucketSize;i++){
			bucket.add(null);
		}
		
		for(MapNode<K,V> head : temp){
			while(head!=null){
				put(head.key,head.value);
				head = head.next;
			}
		}
		
		noOfEntries++;
	}








	public  V get(K key){
		int index = getIndex(key);
		MapNode<K,V> head = bucket.get(index);
		
		while(head!=null){
			if(head.key.equals(key)){
				return head.value;
			}
			head= head.next;
		}
		return null;
	}

	
	boolean remove(K key){
		int index = getIndex(key);
		MapNode<K,V> head = bucket.get(index);
		
		if(head.key.equals(key)){
			bucket.set(index, head.next);
			noOfEntries--;
			return true;
		}
		while(head.next!=null){
			if(head.next.key.equals(key)){
				head.next = head.next.next;
				noOfEntries--;
				return true;
			}
			head= head.next;
		}
		return false;
	}
	
	
	ArrayList<V> getValues(){
		ArrayList<V> list = new ArrayList<>();
		for(MapNode<K,V> head : bucket){
			while(head!=null){
				list.add(head.value);
				head = head.next;
			}
		}
		return list;
	}
	
//	ArrayList<K> getKeys(){
//		
//	}
	
	int size(){
		return noOfEntries;
	}
	
	
	
	
	
	
	
	
	
	private int getIndex(K key) {
		int hashcode = Math.abs(key.hashCode());
		return compress(hashcode);

	}

	private int  compress(int hashcode) {
		return hashCode()%bucketSize;
		
	}
}
