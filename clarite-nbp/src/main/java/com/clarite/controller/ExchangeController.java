package com.clarite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clarite.pojo.CurrencyInfo;
import com.clarite.pojo.GoldInfo;
import com.clarite.pojo.Rates;
import com.clarite.service.RestTemplateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@RestController
public class ExchangeController {
	private RestTemplateService restTemplateService;

    @Autowired
    public ExchangeController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }
    
	  @RequestMapping("/gold")
	    public GoldInfo getGoldPrice() {
	        return restTemplateService.getGoldPrice()[0];
	    }
	  
	  @RequestMapping("/currency")
	    public Rates[] getCurrencyPrice() {
	        return restTemplateService.getCurrencyPrice()[0].getRates();
	    }

	
}
