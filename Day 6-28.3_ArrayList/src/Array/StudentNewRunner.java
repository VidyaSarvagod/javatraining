package Array;

import java.math.BigDecimal;

public class StudentNewRunner {

    public static void main(String[] args) {
        int[] marks={10,20,30,45};

        //StudentNew student=new StudentNew("Vidya",23,22,34);
        //StudentNew student1=new StudentNew("Rushali",22,56,67);
        StudentNew student2=new StudentNew("Munni",44,67,89);

        int number=student2.getNumberofMarks();
        System.out.println("Total marks is:" +number);

       int sum1=student2.TotalSumOfMarksMarks();
        System.out.println("Total of Marks:" +sum1);


        int max1=student2.getMaximumMarks();
        System.out.println("Maximum OF marks is:" +max1);

        BigDecimal average=student2.average();
        System.out.println("Average is:" +average);


        int min1=student2.getMiniumMarks();
        System.out.println("Minium OF marks is:" +min1);

        System.out.println(student2);

        student2.addNewMark(35);
        System.out.println(student2);

        student2.remove();
        System.out.println(student2);






    }





}
