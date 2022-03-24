package Primitive_data_type_BigDecimal;

import java.math.BigDecimal;

public class SimpleIntrestCalculation {

    BigDecimal principle;
    BigDecimal interest;

    public SimpleIntrestCalculation(String principle1, double interest1) {
        this.principle=new BigDecimal(principle1);
        this.interest=new BigDecimal(interest1).divide(new BigDecimal(100));
        //BigDecimal totalValue=principle.add();
    }

    public BigDecimal calculateTotalValue(int noOfYears) {

              //Total Value=principle+principle*interest*noOfYear
        BigDecimal noOfYearsBigDecimal=new BigDecimal(noOfYears);
        BigDecimal totalValue= principle.add(principle.multiply(interest).multiply(noOfYearsBigDecimal));
        return totalValue ;
    }
}
