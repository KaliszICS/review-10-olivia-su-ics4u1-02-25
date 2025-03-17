public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pyramid(int num){
		String result = ""; 

		for (int i = 1; i <= num; i++){
			for (int j = 1; j <= (num - i); j++){
			result += " ";
			}
			for (int k = 0; k < i; k++){
				result += "*";
				if (k != i - 1){
					result += " ";
				}
			}
			if ( i < num){
				result += "\n";
				}
			}
			return result;

	}

	public static String square(int num){
		String result = "";
		for (int i = 1; i <= num; i++){
			for (int j = 1; j <= num; j++){
				if (j == 1 || j == num || i == 1 || i == num){
					result += "*";
				}
				else {
					result += " ";
				}
			}
			if (i < num){
				result += "\n";
			}
		}
		return result;
	}

	public static boolean hasLowercase(String word){
		for (int i = 0; i < word.length(); i++){
			if ((word.charAt(i) > 'a') && (word.charAt(i) < 'z')){
				return true;
			}
		}
		return false; 
	}

	// wahhhhhhhhhhhhhhhhhhhhhh
}

