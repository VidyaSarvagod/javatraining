
//Programm for Simple Intrest

package Primitive_data_type_BigDecimal;

import java.math.BigDecimal;

public class SimpleIntrestCalculationRunner {
    public static void main(String[] args) {
        SimpleIntrestCalculation calculator=new SimpleIntrestCalculation("4500.00",7.5);
        BigDecimal totalValue=calculator.calculateTotalValue(5);
        System.out.println(totalValue);



    }
}
