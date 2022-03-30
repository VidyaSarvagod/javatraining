package Polymorphism;
//[1, 2, 3, 4, 5]
       // [1, 2, 3, 5]
       // 1 2 3 5

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListPractice {
    public static void main(String[] args) {
        int n=5;
        ArrayList<Integer> abc=new ArrayList<Integer>(n);
        for(int i=1;i<=n;i++)
        {
            abc.add(i);
        }

        System.out.println(abc);
        abc.remove(2);
        System.out.println(abc);
        //public String toString{
          //  return String.format("")

        List<String> words= List.of("s","d","k");
        System.out.println(words);
        //words.add("f"); //we can not add element in List

        List<String> vector=new Vector<>(words); //convert list word into Vector
        System.out.println(vector);
        vector.add("g");
       System.out.println(vector);
       vector.remove(2);
        System.out.println(vector);
        vector.add(3,"s");
        System.out.println(vector);
        List<String> Modified=List.of("aa","ss"); //new list creation




    }


    }

