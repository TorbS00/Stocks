package com.github.beastyboo.stocks.config;

import com.github.beastyboo.stocks.adapter.repository.InMemoryStockRepository;
import com.github.beastyboo.stocks.application.Stocks;
import com.github.beastyboo.stocks.domain.port.StockRepository;

/**
 * Created by Torbie on 25.11.2020.
 */
public class StockConfig {

    private final Stocks core;
    private final StockRepository repository;

    public StockConfig(Stocks core) {
        this.core = core;
        repository = new InMemoryStockRepository(core);
    }



}