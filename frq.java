public boolean simulate() {
	int d = 0;
	for (int i = 0; i < maxHops; i++) {
		d += hopDistance();
	}
	if (d >= goalDistance) { return true; }
	else { return false; }
}

public double runSimulation(int num) {
	int tru_doe = 0;
	for (int i = 0; i < num; i++) {
		if (simulate()) { true_doe += 1; } 
	}
	return (tru_doe / num);
}


public WordPairList(String[] words) {
	allPairs = new ArrayList<WordPair>();
	for (int i = 0; i < words.length; i++) {
		for (int j = i+1; j < words.length; j++) {
			allPairs.add(WordPair(words[i], words[j]));
		}
	}
}

public int numMatches() {
	int match = 0;
	for (int i = 0; i < allPairs.size(); i++) {
		if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond()) {
			match += 1;
		}
	}
	return match;
}

public class CodeWordChecker implements StringChecker {
	private int min;
	private int max;
	private String bad_sqnc;

	public CodeWordChecker(int mi, int ma, String bad) {
		min = mi;
		max = ma;
		String bad_sqnc = bad;
	}
	public CodeWordChecker(String bad) {
		min = 6;
		max = 20;
		bad_sqnc = bad;
	}
	public boolean isValid(String str) {
		if (str.length < min) { return false; }
		else if (str.length > max) { return false; }
		else if (str.indexOf(bad_sqnc) != -1) { return false; }
		else { return true; }
	}
}

public int[] getColumn(int[][] arr1, int c) {
	int[] arr2 = new int[arr1.length];
	for (int i = 0; i < arr1.length; i++) {
		arr2[i] = arr1[i][c];
	}
	return arr2;
}

public i

