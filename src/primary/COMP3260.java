/* Classname: COMP3260
 * Programmer: Kyle Dryden
 * Version: Java 14
 * Date: 15/03/2023
 * Description: Used to pick the file and choose the appropriate analysis methods. Will be used for a
 * 				command-line interface later.
 */

package primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utility.Resources;

public class COMP3260 {
	public static void main(String[] args) throws Exception {
		
		
		List<String> fileStrings = new ArrayList<String>(); //List variable that initially holds every line from the ciphertext files.
		String testString = ""; //String variable that concatenates all strings from the file and list of strings to a singular string.
		String fileLocation = "Files/"; //String variable that holds the file the ciphertext files are found in.
		String finalOutput = ""; //String variable that will return the final output once the cipher is decrypted.
		
		String testFile = fileLocation + "c1"; //Current test variable for changing the ciphered file being tested.
		
		//Uses utility file that reads all lines from the ciphered file.
		fileStrings = Resources.readAllLines(testFile);
		
		//For loop that concatenates the entire file to a singular string.
		for (int i=0; i<fileStrings.size(); i++) {
			testString += fileStrings.get(i) + "\n";
		}
		
		//Analysis object that will be used to perform different analytical methods to the ciphered string.
		Analysis analysisPiece = new Analysis(testString);
		
		HashMap<String, Integer> letterFrequency = analysisPiece.letterFrequency();
		
		for (String i : letterFrequency.keySet()) {
			System.out.println(i + " " + letterFrequency.get(i));
		}
	}
}
