package test.second;
public class RecSing
{
static int k=0;
public static void main(String[] args)
{
	RecSing rec = new RecSing();
	rec.avoid(k);
}
private void avoid(int l)
{
	String s ="SingaramSenthilnathan";		
	char[] ss = s.toCharArray();
	
	if(l<s.length())
	{
		System.out.print(ss[l]);
		avoid(l+1);
	}
	
}
}
