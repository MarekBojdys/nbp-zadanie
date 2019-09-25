package com.clarite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.clarite.pojo.CurrencyInfo;
import com.clarite.pojo.GoldInfo;


@Service
public class RestTemplateService {
	
	
		@Autowired
		private RestTemplate restTemplate;

		public GoldInfo[] getGoldPrice() {
			final String url = "http://api.nbp.pl/api/cenyzlota";
			GoldInfo[] goldInfo = this.restTemplate.getForObject(url, GoldInfo[].class);
			return goldInfo;	
		}

		public CurrencyInfo[] getCurrencyPrice() {
			final String url = "http://api.nbp.pl/api/exchangerates/tables/A/";
			CurrencyInfo[] currencyInfo = this.restTemplate.getForObject(url, CurrencyInfo[].class);
			return currencyInfo;	
		}
}

