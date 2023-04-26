package ie.tudublin;

public class Follow {

    //instance fields
    public String word;
    public int count;

    //constructor
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    //accessor methods below:
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Follow [count=" + count + ", word=" + word + "]";
    }
}
