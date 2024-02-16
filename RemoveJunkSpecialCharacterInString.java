
public class RemoveJunkSpecialCharacterInString {

	public static void main(String[] args) {
		
		//String str="this has 0() df ** % hii";
		
		String str = "###&&*tyt&&9898yu@!ui__ ";
		
		str=str.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.println(str);

	}

}
