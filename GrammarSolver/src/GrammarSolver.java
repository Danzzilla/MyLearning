import java.util.*;
/**
 * This program reads an input file with a grammar in Backus-Naur Form 
 * and allows the user to randomly generate elements of the grammar
 * 
 * @author Daniel Svirida
 * @version 1
 */

public class GrammarSolver {
	
	/** stores the grammar non-terminal and its rules */
	private Map<String, String[]> grammar;
	
	/**
	 * Constructor - Initializes a new grammar solver over the given BNF rules and breaks
	 * them apart and stores them into a Map named grammar
	 * 
	 * @param Rules - BNF grammar rules passed as a List<String>
	 * 
	 * @exception IllegalArgumentException If Rules is empty
	 * @exception IllegalArgumentException If Rules contains more than one line for the same non-terminal
	 */
	public GrammarSolver(List<String> Rules) {
		if(Rules.isEmpty()) throw new IllegalArgumentException("Rules list is null or empty");
		
		grammar = new TreeMap<String, String[]>();
		
		for(String line : Rules) {
			String[] terminalSplit = line.split("::=");
			String key = terminalSplit[0].trim();
			String[] ruleArray = terminalSplit[1].split("[|]");
			
			if(grammar.containsKey(key)) {
				throw new IllegalArgumentException("Rules contains more than one line for the same non-terminal");
			}else{
				grammar.put(key, ruleArray);
			}
		}
	}
	
	/**
	 * Determines if the passed down String is a non-terminal in grammar
	 * 
	 * @exception IllegalArgumentException If symbol is null
	 * @param symbol - grammar symbol that needs to be checked if it is a non-terminal
	 * @return True - If the symbol is a non-terminal
	 * <p>	   False - If the symbol is not a non-terminal
	 */
	public boolean contains(String symbol) {
		if(symbol == null) throw new IllegalArgumentException("The symbol is null");
		
		if(grammar.containsKey(symbol)) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Sorts the keySet of grammar and returns the Set of keys
	 * @return sorted - SortedSet containing grammar's keySet
	 */
	public Set<String> getSymbols(){
		SortedSet<String> sorted = new TreeSet<String>();
		sorted.addAll(grammar.keySet());

		return sorted;
	}
	
	/**
	 * Generates a random occurrence of the given symbol
	 * 
	 * @param symbol - Terminal or non-terminal word
	 * @return generatedString - String made from all the symbols added
	 * <p>     symbol - if symbol is a terminal word
	 * @exception IllegalArgumentException If symbol is null
	 */
	public String generate(String symbol) {
		if(symbol == null) throw new IllegalArgumentException("symbol is null");
		
		Random rand = new Random();
		String[] splitSymbol = symbol.split("[ ]+");
		String generatedString = "";
		
		if((splitSymbol.length == 1) && (grammar.containsKey(splitSymbol[0]))) {
			String[] terminalRules = grammar.get(splitSymbol[0]);
			return generatedString += "" + generate(terminalRules[rand.nextInt(terminalRules.length)].trim()).trim();
		}
			
		else if((splitSymbol.length > 1) && (grammar.containsKey(splitSymbol[0]))) {
			for(int i = 0; i < (splitSymbol.length); i++) {
				String[] terminalRules = grammar.get(splitSymbol[i]);
				generatedString += " " + generate(terminalRules[rand.nextInt(terminalRules.length)].trim()).trim();
			}
			
			return generatedString;
		}
		
		else return symbol;
	}
}
