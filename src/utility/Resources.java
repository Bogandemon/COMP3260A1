/* Classname: Resources
 * Programmer: Kyle Dryden
 * Version: Java 14
 * Date: 05/08/2022
 * Description: Utility function that is primarily used for loading the file to be compiled.
 */

package utility;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Resources {
	
	//Method used for loading other the source file from the argument into the scanner.
	public static List<String> readAllLines(String fileName) throws Exception {
		List<String> result = new ArrayList<String>();
				
		Scanner fileImport = new Scanner(new File(fileName));
				
		while (fileImport.hasNextLine()) {
			String nextLine = fileImport.nextLine();
			result.add(nextLine);
		}
				
		return result;
	}
}