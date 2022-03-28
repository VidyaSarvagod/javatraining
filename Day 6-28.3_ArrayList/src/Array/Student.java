package Array;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name;
    private static int[] marks;

    Student(String name, int[] marks)
    {
        this.name=name;
        this.marks=marks;
    }

    public static int getNumberofMarks() {
        return marks.length;
    }

    public static int TotalSumOfMarksMarks() {
       int sum=0;
       for(int mark:marks)
       {
           sum+=mark;
       }
        return sum;
    }

    public int getMaximumMarks() {
       int max=Integer.MIN_VALUE;
       // int max=0;
        for(int mark:marks)
        {
            if(mark>max)
            {
                max=mark;
            }
        }
        return max;
    }

    public int getMiniumMarks() {
        int min=Integer.MAX_VALUE;
       // int min=0;
        for(int mark:marks)
        {
            if(mark<min)
            {
                min=mark;
            }
        }
        return min;
    }

    public BigDecimal average() {
        int sum=TotalSumOfMarksMarks();
        int number=getNumberofMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 2,RoundingMode.DOWN);

    }
}
