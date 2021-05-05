package test.second;
public class Pattern4 
{
public static void main(String[] args) 
{
Pattern4 pt = new Pattern4();
pt.deserved(1);
}
private void deserved(int i) 
{
if(i<=7)
{
	Pattern4.avoid(i,7);	
	System.out.println();
	deserved(i+1);
}
}
public static void avoid(int j,int q)
{
if(j>=1)
{
	System.out.print(q+" ");
	Pattern4.avoid(j-1, q-1);
}
}
}
/* OUTPUT:
7 
7 6 
7 6 5 
7 6 5 4 
7 6 5 4 3 
7 6 5 4 3 2 
7 6 5 4 3 2 1 
*/
