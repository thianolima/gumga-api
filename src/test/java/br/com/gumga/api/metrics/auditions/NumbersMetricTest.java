package br.com.gumga.api.metrics.auditions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.additions.NumbersMetric;

public class NumbersMetricTest {
	private Metric metric;
	private String pwd = "T3L@2017) "; 
	
    @Before
    public void setUp() {
        metric = new NumbersMetric();
    }

    @Test
    public void count() {
        int n = metric.count(pwd);        
        assertEquals(5, n);
    }
    
    @Test
    public void rate() {
        int n   = metric.count(pwd);
        int r   = metric.rate(0, n);
        
        assertEquals(20, r);
    }
}

