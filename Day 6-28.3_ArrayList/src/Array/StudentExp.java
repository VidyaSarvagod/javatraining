package Array;

import java.math.BigDecimal;

public class StudentExp {
    public static void main(String[] args) {
        int[] marks={10,20,30,45};

        Student student=new Student("Vidya",marks);
        int number=student.getNumberofMarks();
        System.out.println("Total marks is:" +number);

        int sum1=student.TotalSumOfMarksMarks();
        System.out.println("Total of Marks:" +sum1);


        int max1=student.getMaximumMarks();
        System.out.println("Maximum OF marks is:" +max1);

        BigDecimal average=student.average();
        System.out.println("Average is:" +average);


        int min1=student.getMiniumMarks();
        System.out.println("Minium OF marks is:" +min1);
        //BigDecimal average=student.getAverageMarks();



    }

}
