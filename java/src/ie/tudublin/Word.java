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
 
    
    @Override
    public String toString() {
        return "Word [word=" + word + "]";
    }
}
