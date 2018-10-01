import edu.duke.*;
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    public boolean  isVowel(char ch) {
        char chl = Character.toLowerCase(ch);
        if(chl == 'a' || chl == 'e' || chl == 'i' || chl == 'o' || chl == 'u')
            return true;
        return false;
    }
    public String replaceVowels(String phrase, char ch) {
        StringBuilder sb = new StringBuilder(phrase);
        for(int i =0; i<sb.length(); i++) {
            char chVowel = sb.charAt(i);
            if(isVowel(chVowel)){ 
                sb.setCharAt(i,ch);
            }
        }
        return sb.toString();
    }
    public String emphasize (String phrase, char ch) {
        StringBuilder sb = new StringBuilder(phrase);
        for(int i =0; i < sb.length(); i++){
            char chChecker = sb.charAt(i);
            char chCheckerLow = Character.toLowerCase(chChecker); 
            char chLow = Character.toLowerCase(ch); 
            if(chLow == chCheckerLow) {
                if((i+1) % 2 == 0)
                    sb.setCharAt(i,'+');
                if((i+1) % 2 != 0)
                    sb.setCharAt(i,'*');
            }
        }
        return sb.toString();
    }
    public void tester() {
        System.out.println(emphasize("dna ctgaaactga", 'a'));
        System.out.println(emphasize("Mary Bella Abracadabra" , 'a'));
    }
}
