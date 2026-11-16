package com.premit.multidimensions;

public class Demo {
	public static void main(String[] args) {
		Integer[][] ob = new Integer[3][3];
		ob[0][0] = Integer.valueOf(1);
		ob[0][1] = Integer.valueOf(2);
		ob[0][2] = Integer.valueOf(3);
		
		ob[1][0] = Integer.valueOf(4);
		ob[1][1] = Integer.valueOf(5);
		ob[1][2] = Integer.valueOf(6);
		
		ob[2][0] = Integer.valueOf(7);
		ob[2][1] = Integer.valueOf(8);
		ob[2][2] = Integer.valueOf(9);

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(ob[i][j]+" ");
			}
			System.out.println();
		}
	}
}
