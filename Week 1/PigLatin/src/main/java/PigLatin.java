/**
 * @author Zimi Li
 */
public class PigLatin {

    private final String vowels = "aeiouAEIOU";

    public String pigLatin(String sentence) {
        StringBuilder ret = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) word.append(c);
            else {
                ret.append(pigLatinWord(word));
                word = new StringBuilder();
                ret.append(c);
            }
        }
        ret.append(pigLatinWord(word));
        return ret.toString();
    }

    private String pigLatinWord(StringBuilder word) {
        if (word.length() == 0) return "";
        else if (vowels.contains(word.subSequence(0, 1))) return word + "way";
        else if (word.length() == 1) return word + "ay";
        else if (Character.isUpperCase(word.charAt(0)))
            return word.substring(1, 2).toUpperCase() + word.substring(2) + word.substring(0, 1).toLowerCase() + "ay";
        else
            return word.substring(1) + word.substring(0, 1) + "ay";
    }


}
