package com.learn;

public class app4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13;
		int b=11;
		int c=10;
		int d=12;
		int e=14;
		
		int r= (a>b && a>c && a>d && a>e)
				? a:(b>c && b>d && b>e)
						? b:(c>d && c>e)
								? c:(d>e)
										? d:e;
		System.out.println("result  :"+ r);
				

	}

}
