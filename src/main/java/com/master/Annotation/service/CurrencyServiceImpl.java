package com.master.Annotation.service;

import com.master.Annotation.util.CurrencyEnum;
import com.master.Annotation.util.CurrencyUtil;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CurrencyServiceImpl implements CurrencyService{
    @Override
    public List<CurrencyEnum> index() {
        return Arrays.asList(CurrencyEnum.values());
    }

    @Override
    public Map<String, Double> exchange(CurrencyEnum currency, int amount) {
        Map<String, Double> response = new HashMap<>();
        Double currencyValue = CurrencyUtil.currencyValues.get(currency);
        response.put("MXN to "+ currency.name(), amount * currencyValue);
        return response;
    }
}
