package Lecture29Hashmaps;

import java.util.ArrayList;

public class Map<k,v> {
	
	ArrayList<MapNode<k,v>> buckets;
	int count;
	int numBuckets;
	
	
	public Map() {
		buckets = new ArrayList<>();
		numBuckets = 5;
		
		for (int i = 0; i < numBuckets; i++) {
			buckets.add(null);
		}
		
	}
	//lecture 12
	public int size() {
		return count;
	}
	
	public v removeKey(k key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<k,v> head =  buckets.get(bucketIndex);
		MapNode<k,v> prev = null;
		//element is already there just update its value
		while (head != null) {
			if(head.key.equals(key)) {
				if( prev != null) {
					prev.next = head.next;
				}else {
					buckets.set(bucketIndex,head.next);
				}
				count--;
				return head.value;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
//	}
	
	
	public v getValue(k key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<k,v> head =  buckets.get(bucketIndex);
		
		//element is already there just update its value
		while (head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	//Lecture 11
	private int getBucketIndex(k key) {
		int hc = key.hashCode();
		int index = hc % numBuckets;
		return index;
	}
	
	private void reHash() {
		ArrayList<MapNode<k,v>> temp = buckets;
		buckets = new ArrayList<>();
		
		for (int i = 0; i < 2* numBuckets; i++) {
			buckets.add(null);
		}
		
		count = 0;
		numBuckets = numBuckets*2;
		for (int i = 0; i <temp.size(); i++) {
			MapNode<k,v> head = temp.get(i);
			
			while(head != null) {
				k key = head.key;
				v value = head.value;
				insert(key,value);
				head = head.next;
			}
		}
	}
	
	public double loadFactor() {
		return (1.0*count)/numBuckets;
	}
	
	
	
	public void insert(k key ,v value) {
		int bucketIndex = getBucketIndex(key);
		MapNode<k,v> head =  buckets.get(bucketIndex);
		
		//element is already there just update its value
		while (head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		//element is not present insert into 0th position
		head = buckets.get(bucketIndex);
		MapNode<k,v> newNode = new MapNode<>(key,value);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		count++;
		
		double loadFactor = (1.0*count)/numBuckets;
		if(loadFactor > 0.7) {
			reHash();
		}
	}
	
	
}
