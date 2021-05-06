package test.second;
public class Pattern11 
{
int c;
static int n =1;
public static void main(String[] args) 
{
Pattern11 pt = new Pattern11();
pt.avoid(5,1);
}
public static void use(int b,int c)
{
if(b>=1)
{
System.out.print(c);
use(b-1,c);
}
}
private static void avoid(int i,int a)
{
if(i>=1 && a<=5)	
{
Pattern11.deserved(i,1);
Pattern11.use(a,n);
System.out.println();
i--;
a++;
n=n+1;
avoid(i,a);
}
}
public static void deserved(int j,int k)
{
if(j>1)
{
System.out.print(k);
deserved(j-1,k);
}
}
}
/* OUTPUT:
11111
11122
11333
14444
55555
*/
