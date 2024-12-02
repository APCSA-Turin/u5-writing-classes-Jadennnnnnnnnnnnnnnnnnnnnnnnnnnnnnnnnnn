public class HiddenWord {
    private String secretWord;
 
    public HiddenWord(String word) {
       secretWord = word;
    }
 
    public String getHint(String guess) {
       String hint = "";
       for (int i = 0; i < guess.length(); i ++) {
          String guessLetter = guess.substring(i, i + 1);
          String wordLetter = secretWord.substring(i, i + 1);
          if (guessLetter.equals(wordLetter)) {
             hint += guessLetter;
          } else if (secretWord.indexOf(guessLetter) != -1) {
             hint += "+";
          } else hint += "*";
        }
        return hint;
    }
}
 