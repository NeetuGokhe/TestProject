package com.demo.searching;

public class BinarySearch {
	static int[] intArray = {2,5,7,9,11,24,45};
	static int  isPresent = 8;
	public static void main(String[] args) {
		int fisrt = 0;
		int last = intArray.length;
		searchNumber(intArray, fisrt, last);
	}
	static int searchNumber(int[] arrayBhai, int first, int last){
		int mid = (first + last) /2;
		if(arrayBhai[mid] == isPresent){
			System.out.println("number is = " + isPresent);
			return 1;
		}if(arrayBhai[mid] < isPresent){
			searchNumber(arrayBhai,mid+1,last);
		}if(arrayBhai[mid] > isPresent){
			searchNumber(arrayBhai,first,mid-1);
		}if(first == last){
			System.out.println("number not found");
			return 0;
		}
		return -1;
	}
}
