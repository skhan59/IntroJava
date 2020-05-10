public class PrintKSymbols {
	
	public static void main(String[] args) {
		String first = printSymbols(5, "*");
		System.out.println(first);
	}
	
	public static String printSymbols(int k, String symbol) {
		String toReturn  = "";
		for (int i = 0; i < k; i++) {
			toReturn = toReturn + symbol;
		}
		return toReturn;
	}
}