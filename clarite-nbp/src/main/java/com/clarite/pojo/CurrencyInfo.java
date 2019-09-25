package com.clarite.pojo;

public class CurrencyInfo {
	 private String no;

	    private Rates[] rates;

	    private String table;

	    private String effectiveDate;

	    public String getNo ()
	    {
	        return no;
	    }

	    public void setNo (String no)
	    {
	        this.no = no;
	    }

	    public Rates[] getRates ()
	    {
	        return rates;
	    }

	    public void setRates (Rates[] rates)
	    {
	        this.rates = rates;
	    }

	    public String getTable ()
	    {
	        return table;
	    }

	    public void setTable (String table)
	    {
	        this.table = table;
	    }

	    public String getEffectiveDate ()
	    {
	        return effectiveDate;
	    }

	    public void setEffectiveDate (String effectiveDate)
	    {
	        this.effectiveDate = effectiveDate;
	    }
}
