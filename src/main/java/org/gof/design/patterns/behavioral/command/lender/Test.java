package org.gof.design.patterns.behavioral.command.lender;

import org.gof.design.patterns.behavioral.command.lender.pattern.*;

public class Test {


    public static void main(String[] args) {
        Command taxOffice = new TaxOffice();

        Lender lender = new Lender();

        lender.lend(taxOffice, 100);


    }

}
