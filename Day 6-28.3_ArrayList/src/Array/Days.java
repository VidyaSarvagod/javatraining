package Array;

import java.util.ArrayList;
import java.util.RandomAccess;

public class Days {
    private ArrayList<String> strs=new ArrayList<String>();


    Days(String[] strs)
     {
         for (String str:strs) {
             this.strs.add("gggg");
         }

    }

    public int findlegth() {

        return strs.size();
    }


    public void print() {
        for(String str:strs)
        {
            System.out.println(str);
        }
    }

}
