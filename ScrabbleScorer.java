import java.util.*;

/*
 * This class scores words in the game of Scrabble.
 * A word's score is the total of its individual tile scores.
 */
public class ScrabbleScorer {
    private final Map<Character, Integer> tileScores;
    
    public ScrabbleScorer() {
    	
        char[] tiles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        
        // TODO: initialise the array of individual letter scores
        int[] scores = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
        
        // TODO: create the `tileScores` map
        tileScores = new HashMap<>();
        
        // TODO: populate the `tileScores` map using the `tiles`
        // and `scores` arrays
        for (int i=0 ; i <26; i++) {
        	tileScores.put(tiles[i], scores[i]);
        }
    }
    
    /*
     * Calculates the score for an individual letter tile.
     * If the character is not a letter, then 0 is returned.
     */
    public int scoreForTile(char tile) {
        // TODO: convert the tile to an uppercase character
    	char tUp = Character.toUpperCase(tile);
        // TODO: check if the `tileScores` map contains this tile
        boolean is = tileScores.containsKey(tUp);
        // TODO: get the tile score from the `tileScores` map
        if (is) {
        	return tileScores.get(tUp);
        }else {
        	return 0;
        }
    }
    
    /*
     * Calculates the score for a word.
     */
    public int scoreForWord(String word) {
        char[] tiles = word.toCharArray();
        
        // TODO: calculate the total score of the tiles
        int re = 0;
        for (char ti : tiles) {
        	re +=scoreForTile(ti);
        
        }
        return re;
    }
    
    /*
     * Returns the highest-scoring word from a list of words,
     * or null if the list is empty.
     */
    public String highestScoringWord(List<String> words) {
        // TODO: find the word with the highest score
    	String wordd= "";
        for (int i= 1; i<words.size(); i++) {
        	if(scoreForWord(words.get(i))> scoreForWord(words.get(i-1))) {
        		wordd = words.get(i);
        	}else {
        		wordd = words.get(i-1);
        	}
    	
        }
        return wordd;
    }
}
        
    	
        	
      