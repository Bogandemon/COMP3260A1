/* Classname: COMP3260
 * Programmer: Kyle Dryden, Joshua O'Brien
 * Version: Java 14
 * Date: 15/03/2023
 * Description: 
 */

package primary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utility.Resources;

public class COMP3260 {
	public static void main(String[] args) throws Exception {
		List<String> fileStrings = new ArrayList<String>();
		String testString = "";
		String fileLocation = "Files/";
		String finalOutput = "";
		
		String testFile = "c1";
		
		
		fileStrings = Resources.readAllLines(fileLocation + testFile);
		
		for (int i=0; i<fileStrings.size(); i++) {
			testString += fileStrings.get(i) + "\n";
		}
		
		System.out.println(testString);
		
		Analysis analysisPiece = new Analysis(testString);
		
		HashMap<String, Integer> letterFrequency = analysisPiece.letterFrequency();
		
		for (String i : letterFrequency.keySet()) {
			System.out.println(i + " " + letterFrequency.get(i));
		}
	}
}
