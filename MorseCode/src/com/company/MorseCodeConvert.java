package com.company;
import java.io.*;
import java.util.*;

public class MorseCodeConvert {
    // private member variable
    private final ArrayList<MorseCode> listCodes = new ArrayList<MorseCode>(); //arraylist of type Morsecode class, this will store the objects from MorsecCode class

    // non-default constructor
    public MorseCodeConvert(String testFile){
        File morsecodeFile = new File("src/" + testFile);
        try {
            Scanner scanner = new Scanner(morsecodeFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // line = "!     -.-.---"
                String[] splitting = line.split("\\s");
                if (splitting.length > 2 || splitting.length < 2)
                { //if more than one character  is in the line, skip it

                    System.out.println("Skipping this line: " + line);
                }
                else
                    {
                    String firstPart = splitting[0];
                    String secondPart = splitting[1];

                    if (firstPart.length() > 1)
                    {
                        System.out.println("Skipping this line: " + line);
                    }
                    else {
                        char character = firstPart.charAt(0); //char holding the first half of the characters at index 0
                        MorseCode morsecode = new MorseCode(character, secondPart); //creating an instance of the morsecode

                        if (morsecode.getEncoding() != null) {
                            listCodes.add(morsecode); //adding the index value to morsecode array
                        }
                    }
                }
            }

        }catch(Exception exe) {
            System.out.println("Failed to open the file " + testFile);
        }
    }

    // printEncodingList() => void
    public void printEncodingList() {
        for(int i = 0; i < listCodes.size(); i++){
            if(listCodes.get(i) != null){
                System.out.println(listCodes.get(i).getCharacter() + " " + listCodes.get(i).getEncoding());
            }
        }
    }

    //Accepts a string parameter and prints the corresponding morse code for that string.
   public void encodeString(String s) {
        if(s ==null||s == "")
        {  //comparing the strings
            System.out.println("");
        }
        else
            {
            for(int i = 0; i< s.length(); i++){
                char str = s.charAt(i);
                if(str>='a' && str<='z')//checking if the letters are valid  and then making them uppercase
                {
                    str = Character.toUpperCase(str);//str gets converted to the uppercase letters
                }
                if(str==' '){ // space = space in morse code
                    System.out.printf(" ");

                }
                else{
                    for(int j = 0; j<listCodes.size(); j++)
                    {
                        if(str==listCodes.get(j).getCharacter())
                        {
                            System.out.printf(listCodes.get(j).getEncoding()+" ");
                            break;
                        }
                        if(j == listCodes.size() - 1 && s.charAt(i)!= ' '){
                            System.out.printf("?"); // if the character is not in listCodes and is not a space print '?'
                            break;
                        }
                    }
                }
            }
        }
        System.out.printf("%n");
    }
    //Opens the file and encodes each string in the file by using the encodeString method
    public void encodeFile(String fname) throws FileNotFoundException {
                Scanner file = null; //setting the instance of the Scanner class to null
                try {
                    file = new Scanner(new FileInputStream(new File(fname)));
                    //reading the file
                    while (file.hasNext()) {
                        encodeString(file.nextLine());//each line of file is being converted to morse code
                    }
                }
                catch(FileNotFoundException fne){
                    throw fne; //if you don't find the file, throw an exception
                }
                finally{
                    if(file !=null){
                        file.close(); // file is being closed
                    }
                }
                }
            }



