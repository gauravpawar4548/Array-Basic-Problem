
public class InsertEleArray {

	public static void main(String[] args) {
		int a[] ={1,2,3,4,5,6};
		
		int ele= 9;
		int ele1=10;
		
		int [] c=new int[a.length+2];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			
		}
		
		c[c.length-2]=ele;
		c[c.length-1]=ele1;
		for(int d:c)
		{
			System.out.print(d+" ");
		}

	}

}
