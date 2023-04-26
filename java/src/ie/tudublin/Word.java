package ie.tudublin;

import java.util.ArrayList;
import processing.data.*;;


public class Word {
    public String word;

    ArrayList<Follow> words = new ArrayList<Follow>();

    //constructor
    public Word(String word) {
        this.word = word;
    }

    //accessor methods below:
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void findFollower(String str) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getWord() == str) {
                return ;
            }
        }
    
    }
 
    
    @Override
    public String toString() {
        return "Word [word=" + word + "]";
    }
}
