package com.bridgelabz.commercialdataprocessing;

import java.util.ArrayList;
import java.util.List;

public class StockAccount {
    private List<CompanyShares> companySharesList;

    public StockAccount() {
        this.companySharesList = new ArrayList<>();
    }

    public void buy(String stockSymbol, int numberOfShares) {
        CompanyShares existing = findCompanyShare(stockSymbol);
        if (existing != null) {
            existing.setNumberOfShares(existing.getNumberOfShares() + numberOfShares);
            existing.setTransactionDateTime(java.time.LocalDateTime.now());
            System.out.println(numberOfShares + " shares added to existing stock: " + stockSymbol);
        } else {
            companySharesList.add(new CompanyShares(stockSymbol, numberOfShares));
            System.out.println("Bought new stock: " + stockSymbol + " with " + numberOfShares + " shares.");
        }
    }

    public void sell(String stockSymbol, int numberOfShares) {
        CompanyShares existing = findCompanyShare(stockSymbol);
        if (existing != null) {
            if (existing.getNumberOfShares() >= numberOfShares) {
                existing.setNumberOfShares(existing.getNumberOfShares() - numberOfShares);
                existing.setTransactionDateTime(java.time.LocalDateTime.now());
                System.out.println("Sold " + numberOfShares + " shares of " + stockSymbol);
            } else {
                System.out.println("Not enough shares to sell.");
            }
        } else {
            System.out.println("Stock not found: " + stockSymbol);
        }
    }

    private CompanyShares findCompanyShare(String stockSymbol) {
        for (CompanyShares share : companySharesList) {
            if (share.getStockSymbol().equalsIgnoreCase(stockSymbol)) {
                return share;
            }
        }
        return null;
    }

    public void printReport() {
        System.out.println("----- Stock Report -----");
        for (CompanyShares share : companySharesList) {
            System.out.println(share);
        }
    }
}
