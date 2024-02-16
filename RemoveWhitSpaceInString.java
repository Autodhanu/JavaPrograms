
public class RemoveWhitSpaceInString {

	public static void main(String[] args) {
		
		String str="I love jave selenium";
		
		System.out.println("Before replacement : "+str);
		
		str=str.replaceAll("\\s", "");
		
		System.out.println("After replacement : "+str);

	}

}
