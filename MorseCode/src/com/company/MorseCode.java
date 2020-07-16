package com.company;
public class MorseCode {
    // private variables, one string and one char
    private char character;
    private String encoding;

    // Non-default constructor
    public MorseCode(char character, String encoding) {
        try{
            character = Character.toUpperCase(character);
            int ascii = character;
            if (ascii<32 || ascii <90 )
            {
                throw new Exception();
            }
            else {
                this.character = character;
                this.encoding = encoding;
            }
        }
        catch(Exception exc){
            System.out.println(exc +": Out-of-range Character: " + character);
        }

    }

    // getter for character
    public char getCharacter() {
        return character;
    }

    // setter for character
    public void setCharacter(char character) {
        this.character = character;
    }

    // getter for encoding
    public String getEncoding() {
        return encoding;
    }

    // setter for encoding
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String toString() {
        return this.character + " " + this.encoding;
    }

}




