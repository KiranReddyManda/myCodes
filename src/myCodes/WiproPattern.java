/*
 
  1*  2*  3*  4*  5
 11* 12* 13* 14* 15
 21* 22* 23* 24* 25
 16* 17* 18* 19* 20 
  6*  7*  8*  9* 10
 
 */
package myCodes;

public class WiproPattern {
	public static void main(String[] args){
		for(int i=0;i<3;i++)
		{
			for(int j=1;j<=5;j++){
			int x=(i*10)+j;
			    if(x<=5){
				System.out.print(" ");}
				System.out.print(x+"");
				if(x%5!=0){
					System.out.print("*"+" ");
				}
			}
			System.out.println();

		}
		
		//SECOND PART
		for(int k=1;k>=0;k--)
		{
		
			for(int l=6;l<=10;l++){
				int f=(k*10)+l;
				if(f<10){
					System.out.print(" ");}
				System.out.print(f);
				
				if(f%5!=0){
					System.out.print("*"+" ");
				}
			}	
			System.out.println();
		}
	}
		
	}

