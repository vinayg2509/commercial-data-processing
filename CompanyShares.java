package com.bridgelabz.commercialdataprocessing;

import java.time.LocalDateTime;

public class CompanyShares
{
    private String stockSymbol;
    private int numberOfShares;
    private LocalDateTime transactionDateTime;

    public CompanyShares(String stockSymbol, int numberOfShares) {
        setStockSymbol(stockSymbol);
        setNumberOfShares(numberOfShares);
       this .transactionDateTime=LocalDateTime.now();
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(LocalDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    @Override
    public String toString() {
        return "CompanyShares{" +
                "stockSymbol='" + stockSymbol + '\'' +
                ", numberOfShares=" + numberOfShares +
                ", transactionDateTime=" + transactionDateTime +
                '}';
    }
}
