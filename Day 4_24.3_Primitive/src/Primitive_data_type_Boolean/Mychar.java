//Program for Primitive Type Char
package Primitive_data_type_Boolean;

import java.sql.SQLOutput;

public class Mychar {
    
    private char ch;
    public Mychar(char ch) {
        this.ch=ch;

    }
    public boolean isVowel() {
        //a,e,i,o,u or A,E,E,I,O,U
        if(ch=='a'||ch=='A'){
            return true;
        }
        if(ch=='e'||ch=='E'){
            return true;
        }
        if(ch=='i'||ch=='I'){
            return true;
        }
        if(ch=='o'||ch=='O'){
            return true;
        }
        if(ch=='u'||ch=='U'){
            return true;
        }
        return false;

    }

    public boolean isAlphabet() {
        if(ch>=48 && ch<=57) {
            return true;
        }
        if(ch>=97 && ch<=122) {
            return true;
        }
        return false;

    }

    public static void printlowercaseAplabets() {

        for(char ch='a';ch<='z';ch++)
        {
            System.out.println(ch);
        }
    }

    public boolean isconsonant() {
        if(isAlphabet() && !isVowel())

        {
            return true;
        }
        return false;
    }

    public void printUppercaseAlphabets() {
        for(char ch='A';ch<='A';ch++)
        {
            System.out.println(ch);
        }

    }
}
