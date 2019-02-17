package permutations;

public class Permutations {

	public static void main(String[] args){
		permute(args[0],"");
	}
	
	public static void permute(String str , String prefix){
		
		//base case
		if(str == null || str.length()==0){
			System.out.println(prefix);
		}
		
		for( int i=0; i< str.length(); i++){
			String remaining = str.substring(0,i)+str.substring(i+1);
			permute(remaining, prefix+str.charAt(i));
		}
	}
}