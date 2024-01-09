package com.odigos.collections;

import java.util.Iterator;
import java.util.TreeSet;

//1)collections can hold/store  homogeneous/similar and heterogeneous data 
//2)collection are not fixed in size , growable in nature  -->AL-->10-->16-->25 (cc*3/2)+1
//3)lots of utility methods
//1)duplicates are not allowed
//2)insertion order not followed/preserved 

public class SetEx {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();// 16

		set.add("hitesh");
		set.add("suresh");
		set.add("naresh");
		set.add("rajesh");
		set.add("somesh");
		set.add("hitesh");
		set.add("akash");
		set.add("chethan");

		System.out.println(set);
		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			String ename=itr.next();
			if(ename.endsWith("esh"))
				System.out.println(ename);
		}

	}

}
