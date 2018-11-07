package myCodes;

public class OddManOut {
	public static void main(String[] args){
		int n=25;
		OddMan(n);
	}
	public static void OddMan( int n){
		int x=0;
		for(int i=0;i<n;i++){
			 x=(int)Math.pow(2,i);
			if(x>n)
			{
				x=(int)Math.pow(2,i-1);
				break;
			}
			
		}
		
		System.out.println((2*(n-x))+1);
		
		
	}
}


