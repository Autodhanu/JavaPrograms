
public class CharactersTrianglePattern {

	public static void main(String[] args) {
		
		int assciValue=65;
		
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)(assciValue+j)+" ");
				//System.out.print(i);
			}
			System.out.println();
		}

	}

}
