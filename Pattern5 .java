package test.second;
public class Pattern5 
{
public static void main(String[] args) 
{
Pattern5 pt = new Pattern5();
pt.avoid(1);
}
private void avoid(int i) 
{
if(i<=7)
{
	Pattern5.deserved(i,i);
	System.out.println();
	avoid(i+1);
}
}
public static void deserved(int j,int k)
{
if(j>=1)
{
System.out.print(k+" ");
deserved(j-1,k-1);
}
}
}

/* OUTPUT:
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
6 5 4 3 2 1 
7 6 5 4 3 2 1 
*/
