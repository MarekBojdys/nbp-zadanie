package com.clarite.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Assert;

import com.clarite.ClariteNbpApplication;
import com.clarite.config.AppConfig;
import com.clarite.pojo.CurrencyInfo;
import com.clarite.pojo.GoldInfo;
import com.clarite.service.RestTemplateService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={ClariteNbpApplication.class, RestTemplateService.class, AppConfig.class})
public class RestTemplateServiceTest {
	
	 @Autowired
	 private RestTemplateService restTemplateService;
	 
	 @Test
	 public void getGoldPriceTest() {
		GoldInfo[] goldInfo = this.restTemplateService.getGoldPrice();
		Assert.assertEquals(1, goldInfo.length);
		Assert.assertNotNull(goldInfo[0]);
		Assert.assertNotNull(goldInfo[0].getData());
		Assert.assertNotNull(goldInfo[0].getCena());
	 }

	 @Test
	 public void getCurrencyPriceTest() {
	    CurrencyInfo[] currencyInfo =  this.restTemplateService.getCurrencyPrice();
	    Assert.assertEquals(1, currencyInfo.length);
		Assert.assertNotNull(currencyInfo);
		Assert.assertTrue(currencyInfo[0].getRates().length > 5);
		Assert.assertNotNull(currencyInfo[0].getRates()[0].getCurrency());
	 }
	 
}
