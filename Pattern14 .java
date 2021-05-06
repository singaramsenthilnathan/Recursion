package test.second;
public class Pattern14 
{
	int n=5;
public static void main(String[] args)
{
Pattern14 pt = new Pattern14();
pt.avoid(5);
}
private void avoid(int i) 
{
if(i>=1)
{
Pattern14.decide(i,n);
System.out.println();
n--;
i--;
avoid(i);
}
}
public static void decide(int j,int k)
{
if(j>=1)
{
	System.out.print(k+" ");
	decide(j-1,k+1);
}
}
}

/* OUTPUT:
5 6 7 8 9 
4 5 6 7 
3 4 5 
2 3 
1
*/
