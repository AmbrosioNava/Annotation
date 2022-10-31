package com.master.Annotation.service;

import com.master.Annotation.util.CurrencyEnum;

import java.util.List;
import java.util.Map;

public interface CurrencyService {
    public List<CurrencyEnum> index();
    public Map<String, Double> exchange(CurrencyEnum currency, int amount);
}
