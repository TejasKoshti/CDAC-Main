package com.day10.hashtable;

import java.util.Iterator;

import javax.sound.midi.Soundbank;

public class HashTableLP implements HashTable{

	private int size;
	private double loadFactor;
	private Integer[] buckets;
	private int keysCount;
	
	public HashTable() {
		size = 5;
		loadFactor = 0.7;
		keysCount = 0;
		buckets = new Integer[size];
	}
	
	private int modN(int key){
		return key % size;
	}
	
	private void resizeHashTable() {
		size = size * 2;
		System.out.println("\n Resizing to new size" + size);
		Integer[] oldBuckets = buckets;
		keysCount = 0;
		
		for( Integer key : oldBuckets) {
			if (key != null) {
				insert(key);
			}
		}
		System.out.println("Resizing Done");
	}
	
	public void insert(int key) {
		if (keysCount >= (size * loadFactor)) {
			resizeHashTable();
		}
		
		int bucketId = modN(key);
		
		if (buckets[bucketId] == null) {
			buckets[bucketId] = key;
			++keysCount;
			System.out.println("Stroing key" +key+ "in bucktes");
			return;
		}
	
		int i = (bucketId + 1) % size;
		int count = 1;
		
		while (count < size) {
			if (buckets[i] == null) {
				buckets[i] = key;
				++keyCount;
				System.out.println("Strong key" +key+ "in bucktes" );
				return;
			}
			
			++count;
			i = (i + 1)% size;
		} 
		
		return false;
		
	}
	
	
	
}
