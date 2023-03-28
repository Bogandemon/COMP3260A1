/* Classname: Analysis
 * Programmer: Kyle Dryden
 * Version: Java 14
 * Date: 16/03/2023
 * Description: Analysis tool used to perform the actual analysis from the files. Utilises a
 * 				hashmap to provide letter-value pairs.
 */

package primary;

import java.util.HashMap;

public class Analysis {
	
	private String testString; //String thats provided from the files.
	
	/* String-Integer paired HashMap used to pair the letters found with their occurrence values. Used for
	 * single-letter substitution, amongst diagram and trigram findings.
	 */
	private HashMap<String, Integer> occurrenceValues;
	
	//Constructor that gets a string sent to it.
	public Analysis(String testString) {
		this.testString = testString;
		occurrenceValues = new HashMap<String, Integer>();
	}
		
	//Public method that finds the how many of each ciphertext letters there are.
	public HashMap<String, Integer> letterFrequency() {
		String[] splitString = testString.split("");
		for (int i=0; i<testString.length(); i++) {
			if (splitString[i].contains(" ") || splitString[i].contains("\n")) {
				continue;
			}
			
			String testLetter = splitString[i];
			
			if (occurrenceValues.get(testLetter) == null) {
				occurrenceValues.put(testLetter, 1);
			}
			
			else {
				occurrenceValues.put(testLetter, occurrenceValues.get(testLetter) + 1);
			}
		}
		
		return occurrenceValues;
	}
	
	public double indexOfCoincidence(int N) {
		double returnValue = 0.0;
		
		for (String i : occurrenceValues.keySet()) {
			int Fi = occurrenceValues.get(i);
			
			int topValue = Fi * (Fi-1);
			int bottomValue = N * (N-1);
			returnValue += (double) topValue / bottomValue;
		}
		
		return returnValue;
	}
}
