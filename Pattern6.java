package test.second;
public class Pattern6 
{
public static void main(String[] args)
{
Pattern6 pt = new Pattern6();
pt.avoid(6);
}
private void avoid(int i) 
{
i=i-1;
if(1<=i)
{
Pattern6.deserved(i,1);
System.out.println();
avoid(i);
}
}
public static void deserved(int j,int k)
{
if(j>=1)
{
	System.out.print(k+" ");
	deserved(j-1,k+1);
}
}
}
/* OUTPUT:
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
