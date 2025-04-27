package com.bridgelabz.commercialdataprocessing;

public class MainStock
{
    public static void main(String[] args) {
        StockAccount stockAccount=new StockAccount();

        stockAccount.buy("Apple",5);
        stockAccount.buy("Tata",90);
        stockAccount.buy("Mahindra",99);
        stockAccount.sell("Mahindra",9);
        stockAccount.sell("WIPRO", 10); // Testing selling a non-existing stock
        stockAccount.printReport();




    }
}
