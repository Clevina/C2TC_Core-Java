package com.practiceQuestions;

public class example10 {

	public static void main(String[] args) {
		String str="this is last index of exmaple";
		int index=str.lastIndexOf("last");
		System.out.println(index);
		index=str.lastIndexOf("of",25);
		System.out.println(index);
		index=str.lastIndexOf("of",10);
		System.out.println(index);
	}

}
