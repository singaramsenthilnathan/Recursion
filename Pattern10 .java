package test.second;
public class Pattern10 
{
	static int n=2;
public static void main(String[] args) 
{
Pattern10 pt = new Pattern10();
pt.avoid(5);
pt.divide(n);
}
private static void avoid(int i) 
{
if(i>=1)
{
Pattern10.deserved(1,i);

}
}
public static void deserved(int j,int k)
{
if(j<=k)
{
	System.out.print(j+" ");
	deserved(j+1,k);
}
else
{
	System.out.println();
	k--;
	avoid(k);
}
}
public static void divide(int a)
{
if(a<=5)
{
	Pattern10.sum(1,a);
}
}
private static void sum(int b, int c)
{
if(b<=c)
{
	System.out.print(b+" ");
	sum(b+1,c);
}
else
{
	System.out.println();
	n++;
	divide(n);
}
}
}
/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
