package Array;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList1{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("gdggsa");
        list.add("sfasHFAS");
        list.add("fgsafs");
        list.add("dadasd");
        list.add("aeqw22e10");


        Iterator it= list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("**************************************************");
        System.out.println(list.get(0));
        System.out.println("**************************************************");
        System.out.println(list.set(0,"Vidya"));
        System.out.println(list);
        System.out.println("***************************************************");
        System.out.println("Enter name of element to Delete");
        Scanner sc=new Scanner(System.in);
        String Str=sc.next();
        for(String str1:list)
        {
           // String str;
            if(Str== str1)
            {
                list.remove(str1);
            }

        }
        System.out.println(list);


    }


    }


