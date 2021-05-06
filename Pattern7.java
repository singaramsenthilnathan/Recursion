package test.second;
public class Pattern7 
{
public static void main(String[] args) 
{
Pattern7 pt = new Pattern7();
pt.avoid(5);
}
private void avoid(int i) 
{
if(i>=1)
{
	Pattern7.deserved(5,i);
	System.out.println();
	avoid(i-1);
}	
}
public static void deserved(int j,int k)
{
if(j>=1)
{
	System.out.print(k);
	deserved(j-1,k);
}
}
}
/* OUTPUT:
55555
44444
33333
22222
11111
*/
