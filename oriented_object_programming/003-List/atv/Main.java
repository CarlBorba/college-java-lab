package atv;

import java.security.Permission;

public class Main{
    static void main(String[] args) {
        // 1 - Age conversion
        ConvertAge converted = new ConvertAge();

        // 2 - Media
        Media mediasCalc = new Media();

        // 3 - Balance Adjustment
        BalanceAdjustment productAdjustment = new BalanceAdjustment();

        // 4 - Product Value
        TotalValue productsValue = new TotalValue();

        // 5 - Salary Quantity
        SalaryQuantity salaries = new SalaryQuantity();

        // 6 - Predecessor and Successor
        PredecessorSuccessor number = new PredecessorSuccessor();
    }
}
