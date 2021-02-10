package com.dkit.sd2a.johnloane;

import java.util.Objects;

public class StockItem implements Comparable<StockItem>
{
    private final String name;
    private double price;
    private int quantityInStock = 0;

    public StockItem(String name, double price, int quantityInStock)
    {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public StockItem(String name, double price)
    {
        this(name, price, 0);
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantityInStock()
    {
        return quantityInStock;
    }

    public void setPrice(double price)
    {
        if(price > 0.0)
        {
            this.price = price;
        }
    }

    public void adjustStock(int quantity)
    {
        int newQuantity = this.quantityInStock + quantity;
        if(newQuantity >=0)
        {
            this.quantityInStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockItem stockItem = (StockItem) o;
        return Objects.equals(name, stockItem.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    @Override
    public String toString()
    {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }

    @Override
    public int compareTo(StockItem o)
    {
        if(this == o)
        {
            return 0;
        }

        if(o != null)
        {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }
}
