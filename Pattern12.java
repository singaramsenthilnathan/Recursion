package test.second;
public class Pattern12 
{
	int n=7;
public static void main(String[] args) 
{
Pattern12 pt = new Pattern12();
pt.avoid(1);
}

private void avoid(int i) 
{
if(i<=7)
{
	Pattern12.decide(i,n);
	System.out.println();
	i++;
	n=n-1;
	avoid(i);
}
}
public static void decide(int j,int k)
{
if(k>=1)	
{
	System.out.print(k+" ");
	decide(j,k-1);
}
}
}
/* OUTPUT:
7 6 5 4 3 2 1 
6 5 4 3 2 1 
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 
*/
