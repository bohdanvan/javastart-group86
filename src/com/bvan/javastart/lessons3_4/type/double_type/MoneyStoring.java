package com.bvan.javastart.lessons3_4.type.double_type;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class MoneyStoring {

    public static void main(String[] args) {
        long money = 280366;
        double moneyForOutput = (double)money / 10000;
        System.out.println(moneyForOutput);

        BigDecimal decimal;
        BigInteger integer;
    }
}
