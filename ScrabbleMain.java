import java.util.*;

public class ScrabbleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScrabbleScorer ss = new ScrabbleScorer();
		List<String> li = new ArrayList<>();
		li.add("hello");
		li.add("world");
		li.add("zebra");
		
		System.out.println(ss.scoreForTile('6'));
		System.out.println();
		System.out.println(ss.scoreForWord("hello"));
		System.out.println(ss.scoreForWord("world"));
		System.out.println(ss.scoreForWord("zebra"));
		System.out.println();
		System.out.println(li.toString());
		System.out.println(ss.highestScoringWord(li));
	}

}
