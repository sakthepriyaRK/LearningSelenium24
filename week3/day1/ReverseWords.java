package week3.day1;

public class ReverseWords 
{public static void main(String[] args) {
	
String str= "I am a Software tester";
    // Split the string into words using space as a delimiter
    String[] str_words = str.split(" ");
    char[][] a1 = new char[str_words.length][];    // Iterate through each word in the array
    for (int i = 0; i < str_words.length; i++) {
        a1[i]=str_words[i].toCharArray();

        // Check if the length of the word is odd
        if (str_words[i].length() % 2 != 0) {
        	
        	
        	
            // Reverse the word using StringBuilder and update the array element
            StringBuilder reverser = new StringBuilder(str_words[i]);
            str_words[i] = reverser.reverse().toString();
            System.out.println(reverser);
        }
        else
        {String sr=str_words[i].toString();
        System.out.println(sr);

        }
    }
    
    // Join the modified words to form a string and return the result
//    return String.join(" ", str_words);
}

}
