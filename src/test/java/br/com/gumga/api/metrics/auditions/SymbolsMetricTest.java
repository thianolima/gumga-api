package br.com.gumga.api.metrics.auditions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.additions.SymbolsMetrics;

public class SymbolsMetricTest {
	private Metric metric;
	private String pwd = "{CoR@çÃ0}"; 
	
    @Before
    public void setUp() {
        metric = new SymbolsMetrics();
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
        
        assertEquals(30, r);
    }
}
