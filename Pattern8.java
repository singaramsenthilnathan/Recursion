package test.second;
public class Pattern8 
{
public static void main(String[] args)
{
Pattern8 pt = new Pattern8();
pt.avoid(1);
}
private void avoid(int i) 
{
if(i<=5)
{
	Pattern8.deserved(i,i);
	System.out.println();
	avoid(i+1);
}
}
public static void deserved(int j,int k)
{
if(j<=5)
{
	System.out.print(k);
	deserved(j+1,k+1);
}
}
}
/* OUTPUT:
12345
2345
345
45
5
*/
