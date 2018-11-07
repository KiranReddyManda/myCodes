package myCodes;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicates {
	public static void main(String[] args){
		int[] a={1,2,1,2,3,4,5,6,3};
		ArrayDup(a);
	}
	public static void ArrayDup(int[] a){
		Set<Integer> hs=new HashSet<Integer>();
		boolean b;
		for(int i:a){
			b=hs.add(i);
			if(b==false){
				System.out.print(i+" ");
			}
		}
	}

}
