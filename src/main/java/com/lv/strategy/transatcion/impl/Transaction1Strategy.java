package com.lv.strategy.transatcion.impl;

import com.lv.strategy.transatcion.ITransactionStrategy;
import org.springframework.stereotype.Service;

@Service
public class Transaction1Strategy implements ITransactionStrategy {
    @Override
    public String getTransType() {
        return "transaction1";
    }
}
