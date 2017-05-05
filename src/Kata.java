public class Kata {

	public static String autocorrect(String inputs) {
		String s = "";
		s = inputs.replaceAll("(?i)u+\\b|you+\\b", "your sister");
		return s;

		/*
		 * String split[] = inputs.split("");
		 * 
		 * File file = new File("src/alphabetg");
		 * 
		 * try {
		 * 
		 * Scanner sc = new Scanner(file);
		 * 
		 * while (sc.hasNextLine()) { String a = sc.nextLine();
		 * System.out.print(a);
		 * 
		 * if (inputs.contains("y") && inputs.contains("o") &&
		 * inputs.contains("u") && !inputs.contains(a)) { for (int i = 0; i <
		 * split.length; i++) { split[i] = "your sister"; inputs = split[i]; } }
		 * if (inputs.contains("Y") && inputs.contains("O") &&
		 * inputs.contains("U")) { for (int i = 0; i < split.length; i++) {
		 * split[i] = "your sister"; inputs = split[i]; } } if
		 * (inputs.contains("Y") && inputs.contains("o") &&
		 * inputs.contains("u")) { for (int i = 0; i < split.length; i++) {
		 * split[i] = "your sister"; inputs = split[i]; } } if
		 * (inputs.contains("y") && inputs.contains("O") &&
		 * inputs.contains("u")) { for (int i = 0; i < split.length; i++) {
		 * split[i] = "your sister"; inputs = split[i]; } } if
		 * (inputs.contains("y") && inputs.contains("o") &&
		 * inputs.contains("U")) { for (int i = 0; i < split.length; i++) {
		 * split[i] = "your sister"; inputs = split[i]; } } if (inputs == "u") {
		 * inputs = "your sister"; return inputs; } if (inputs == "U") { inputs
		 * = "your sister"; return inputs; }
		 * 
		 * if (inputs == "youtube") { return "youtube"; } }
		 * 
		 * sc.close(); } catch (FileNotFoundException e) { e.printStackTrace();
		 * } return inputs;
		 */
	}

}
