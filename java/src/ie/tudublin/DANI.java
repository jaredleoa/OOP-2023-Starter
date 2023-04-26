package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	

	private String[] words;

void loadFile()
{
    String[] lines = loadStrings("shakespeare.txt"); // Load a text file into a String array
    String sonnet = String.join(" ", lines); // Join the lines into a single string
    sonnet = sonnet.replaceAll("[^\\w\\s]",""); // Remove punctuation characters
    sonnet = sonnet.toLowerCase(); // Convert the string to lower case 
    words = sonnet.split(" "); // Split the string into an array of words
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


	
    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
