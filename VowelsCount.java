import java.util.Scanner;
public class VowelsCount {

	public static void main(String[] args) {
		
		Scanner input = null;
		String Input;
		String outString="";
		int count=0,flag=0;

		try{
			input = new Scanner(System.in);
			System.out.println("Enter String :");
			Input=input.nextLine();

			String[] splitInput = Input.split("\\s+");
			for(String s : splitInput){
				
				//regexp to match the digits
				if(s.matches(".*\\d+.*")){					
					flag=1;
					break;
				}
				
				//check for the arithmetic symbols
				if(s.contains("+")||s.contains("-")||s.contains("*")||s.contains("/")||s.contains("%")){
					flag=2;
					break;
				}
				else{
					outString += s;
				}
			}
			if(flag==1){
				System.out.println("Input contains numbers");
			}
			if(flag==2){
				System.out.println("Input contains Arithmetic sysmbols");
			}
			else{
				count=outString.length() - (outString.toLowerCase().replaceAll("a|e|i|o|u|y|", "").length());
				System.out.println("Vowels in string '"+Input+"' = "+count);	
			}

		}
		catch(Exception ex){
			System.out.println(ex);

		}
		finally{
			if(input!=null)
				input.close();
		}


	}

}
