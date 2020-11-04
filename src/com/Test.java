package com;


public class Test {
	
	
	public static void main(String as[]) {
		long x=System.currentTimeMillis();
		long total=0;
		for(int i=0; i<1000000; i++) {
			total+=i;
		}
		System.out.println(total);
		long y=System.currentTimeMillis();
		
		System.out.println("Total time taken="+(y-x));
	}
}
