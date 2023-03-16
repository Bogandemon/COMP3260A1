/* Classname: Analysis
 * Programmer: Kyle Dryden, Joshua O'Brien
 * Version: Java 14
 * Date: 15/03/2023
 * Description: 
 */

package primary;

import java.util.HashMap;

public class Analysis {
	private String testString;
	private HashMap<String, Integer> occurrenceValues;
	
	public Analysis() {
		testString = "";
		occurrenceValues = new HashMap<String, Integer>();
	}
	
	public Analysis(String testString) {
		this.testString = testString;
		occurrenceValues = new HashMap<String, Integer>();
	}
	
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
}
