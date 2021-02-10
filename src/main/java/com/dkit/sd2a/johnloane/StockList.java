package com.dkit.sd2a.johnloane;

import java.util.HashMap;
import java.util.Map;

public class StockList
{
    private final Map<String, StockItem> list;

    public StockList()
    {
        this.list = new HashMap<>();
    }

    public int addStock(StockItem item)
    {
        if(item != null)
        {
            //Check if we already have this item
            StockItem inStock = list.getOrDefault(item.getName(), item);
            if(inStock != item)
            {
                item.adjustStock(inStock.getQuantityInStock());
            }
            list.put(item.getName(), item);
            return item.getQuantityInStock();
        }
    }
}
