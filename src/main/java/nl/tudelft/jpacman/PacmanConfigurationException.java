package nl.tudelft.jpacman;

/**
 * Exception that is thrown when JPacman cannot be properly loaded
 * from its resources.
 * 
 * @author Arie van Deursen, 2014
 *
 */
public class PacmanConfigurationException extends RuntimeException {

	/**
	 * A configuration exception with a direct message.
	 * 
	 * @param message The exception message.
	 */
	public PacmanConfigurationException(String message) {
		super(message);
	}

	/**
	 * A configuration exception with a root cause and additional explanation.
	 * 
	 * @param message The explanation.
	 * @param cause The root cause.
	 */
	public PacmanConfigurationException(String message, Throwable cause) {
		super(message, cause);
	}

	/* Healthy, but not working code */

	 // determine distinct words in a file using an array list
    private static ArrayList<String> countWordsWithArrayList(Scanner fileScanner) {


        System.out.println("Total number of words: " + numWords);
        System.out.println("number of distincy words: " + result.size());
        return result;
    }


    // determine distinct words in a file and frequency of each word with a Map
    private static Map<String, Integer> countWordsWithMap(Scanner fileScanner) {


        System.out.println("Total number of words: " + numWords);
        System.out.println("number of distincy words: " + result.size());
        return result;
    }


    private static void showWords(ArrayList<String> words, int numWordsToShow) {
        for(int i = 0; i < words.size() && i < numWordsToShow; i++)
            System.out.println(words.get(i));
    }


}
