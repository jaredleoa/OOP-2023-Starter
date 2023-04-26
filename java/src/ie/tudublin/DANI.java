package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.TableRow;

public class DANI extends PApplet {

	

	private String[] words;
	private String[] sonnet;

void loadFile()
{
    String[] lines = loadStrings("shakespeare.txt"); // Load a text file into a String array
    String sonnet = String.join(" ", lines); // Join the lines into a single string
    sonnet = sonnet.replaceAll("[^\\w\\s]",""); // Remove punctuation characters
    sonnet = sonnet.toLowerCase(); // Convert the string to lower case 
    words = sonnet.split(" "); // Split the string into an array of words
	
}

public void printSonnetToConsole() {
	System.out.println(sonnet);
}

public void printSonnetToScreen() {
	background(0);
	fill(255);
	noStroke();
	textSize(20);
	textAlign(CENTER, CENTER);
	text(sonnet, width/2, height/2);
}

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	//method to find Word
	public void findWord(String str)
	{
		for(int i = 0; i < words.length; i++)
		{
			if(words[i] == toString())
			{
				return;
			}
		}
	}

	public void printModel()
	{
		
	}


	


    public String[] writeSonnet()
    {
        ArrayList<String> sentence = new ArrayList<String>();
    String currentWord = words[(int)random(words.length)];
    sentence.add(currentWord);

    for(int i = 0; i < 7; i++) {
        ArrayList<String> follows = new ArrayList<String>();
        for(int j = 0; j < words.length - 1; j++) {
            if(words[j].equals(currentWord)) {
                follows.add(words[j + 1]);
            }
        }
    }

    String[] sentenceArray = new String[sentence.size()];
    sentence.toArray(sentenceArray);
    return sentenceArray;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {
		if (keyPressed) {
			sonnet = writeSonnet(); // generate a new sonnet
			printSonnetToScreen(); // display the new sonnet on screen
		}
	}

	float off = 0;
	//:(
	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
