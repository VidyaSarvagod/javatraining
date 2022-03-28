package Array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentNew {
    private String name;
    private static ArrayList<Integer> marks = new ArrayList<Integer>();

    StudentNew(String name, int... marks) {
        this.name = name;
        for (int mark : marks) {
            this.marks.add(mark);
        }

    }

    public int getNumberofMarks() {
        return marks.size();
    }

    public static int TotalSumOfMarksMarks() {
        int sum = 0;
        for (int mark : marks)
            sum=sum+mark;
        return sum;

    }

    public int getMaximumMarks() {

        return Collections.max(marks);
    }

    public int getMiniumMarks() {
        return Collections.min(marks);
    }

    public BigDecimal average() {
        int sum = TotalSumOfMarksMarks();
        int number = getNumberofMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 2, RoundingMode.UP);

    }
    public String toString()
    {
        return  name + marks;
    }

    public void addNewMark(int mark) {
          marks.add(mark);
    }

    public void remove() {
        marks.remove(2);
    }
}
