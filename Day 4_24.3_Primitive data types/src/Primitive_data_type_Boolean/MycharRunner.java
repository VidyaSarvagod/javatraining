package Primitive_data_type_Boolean;

public class MycharRunner {
    public static void main(String[] args) {
        Mychar myChar=new Mychar('b');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isconsonant());
        myChar.printlowercaseAplabets();
        myChar.printUppercaseAlphabets();

    }
}
