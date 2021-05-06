package test.second;
public class RevofFloyd 
{
	int n=10;
public static void main(String[] args) 
{
RevofFloyd rf = new RevofFloyd();
rf.avoid(4);
}
private void avoid(int i) 
{
if(i>=1)
{
	RevofFloyd.decide(i,n);
	System.out.println();
	i--;
	n=n-(i+1);
	avoid(i);
}
}
public static void decide(int j,int k)
{
if(j>=1)
{
	System.out.print(k+" ");
	decide(j-1,k-1);
}
}
}

/* OUTPUT:
10 9 8 7 
6 5 4 
3 2 
1
*/
