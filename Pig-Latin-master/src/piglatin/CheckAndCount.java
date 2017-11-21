package piglatin;

/**
 * This class use for check answer from player's input with correct answer
 * and calculate the score of players.
 * 
 * @author Kunyaruk Katebunlu
 */
public class CheckAndCount {

    /**
     * Check answer from player's input with correct answer from data.
     * 
     * @param ans is correct answer from data
     * @param in is answer from player's input
     * @return true, if answer is correct and false, if answer is incorrect.
     */
    public static boolean checkA(String ans, String in) {
        String inAns = in.toLowerCase();
        return inAns.equals(ans);
    }
    
    /**
     * Calculate score for easy level after checked answer.
     * 
     * @param check is result from check the answer
     * @param score is initial score
     * @return total score
     */
    public static int scoreEasy(boolean check, int score){
        if(check == true) return score += 10;
        return score += 0;
    }
    
    /**
     * Calculate score for medium level after checked answer.
     * 
     * @param check is result from check the answer
     * @param score is initial score
     * @return total score
     */
    public static int scoreMedium(boolean check, int score){
        if(check == true) return score += 50;
        return score += 0;
    }
    
    /**
     * Calculate score for hard level after checked answer.
     * 
     * @param check is result from check the answer
     * @param score is initial score
     * @return total score
     */
    public static int scoreHard(boolean check, int score){
        if(check == true) return score += 200;
        return score += 0;
    }
    
}
