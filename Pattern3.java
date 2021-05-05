/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7*/

public class Pattern3 
{
public static void main(String[] args) 
{
Pattern3 pt = new Pattern3();
pt.deserved(1);
}
public void deserved(int i) 
{
if(i<=7)
{
Pattern3.Avoid(i,i);
System.out.println();
deserved(i+1);
}	
}
public static void Avoid(int k,int q) 
{
if(k>=1)
{
System.out.print(q);
Pattern3.Avoid(k-1,q);
}
}
}
