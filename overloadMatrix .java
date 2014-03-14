import java.io.*;
class Matrix extends Throwable
{
	int r,c,i,j;
	int a[][];
	public Matrix(int val)
	{
		r = c = val;
		a = new int[r][c];
	}
	void getMatrix() throws Exception
	{
		System.out.println("Enter Matrix  Value : ");
		java.util.Scanner s = new java.util.Scanner(System.in);
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				a[i][j] = s.nextInt();
		
	}
	void Multiply(Matrix a1,Matrix b1)
	{
		int k;
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
			{
				a[i][j]=0;
				for(k=0;k<c;k++)
					a[i][j] += a1.a[i][k]*b1.a[k][j];
			}
	}
	public String toString()
	{
		System.out.println("New Matrix");
		for(int v[] : a)
		{
			for(int l : v)
				System.out.print(l+" ");
			System.out.println();
		}
		return new String(" ");
	}
}
class overloadMatrix  
{
	public static void main(String ar[]) throws Exception
	{
		int val;
		System.out.println("Enter Value ");
		java.util.Scanner s = new java.util.Scanner(System.in);
		val = s.nextInt();
		Matrix a1 = new Matrix(val);
		Matrix b1 = new Matrix(val);
		Matrix c1 = new Matrix(val);
		a1.getMatrix();
		b1.getMatrix();
		c1.Multiply(a1,b1);
		System.out.println(c1);

	}
}