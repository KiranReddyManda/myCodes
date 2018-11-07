package myCodes;


public class MaxSubstring {
public static void main(String[] args){
	String a="sreedhar";
	String b="reedhar";
	MaxString1(a,b);
}
public static void MaxString1(String a,String b)
{
	int max=0;
	int i1=0;
	int[][] c=new int[a.length()][b.length()];
	
	for(int i=0;i<a.length();i++){
		for(int j=0;j<b.length();j++){
			if(a.charAt(i)==b.charAt(j)){
				
				if(i==0||j==0){
					c[i][j]=1;
					//System.out.println(c[i][j]);
				}else{
					c[i][j]=c[i-1][j-1]+1;
					//System.out.println(c[i][j]);
					
				}
			}else{
				c[i][j]=0;
				//System.out.println(c[i][j]);
			}
		}
	}
	for(int i=0;i<a.length();i++){
		for(int j=0;j<b.length();j++){
			if(c[i][j]>max){
				max=c[i][j];
				i1=i;
			}
			
		}}
	//System.out.println(i1);
	//System.out.println(j1);
	String s="";
	while(max>0){
		
		s=a.charAt(i1)+s;
		i1--;
		max--;
	}
	System.out.println(s);
}
}

