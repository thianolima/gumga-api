package br.com.gumga.api.metrics.auditions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.additions.MiddleNumbersOrSymbolsMetric;

public class MiddleNumbersOrSymbolsMetricTest {
	private Metric metric;
	private String pwd = "Py5fcvmo"; 
	
    @Before
    public void setUp() {
        metric = new MiddleNumbersOrSymbolsMetric();
    }

    @Test
    public void count() {
        int n = metric.count(pwd);        
        assertEquals(1, n);
    }
    
    @Test
    public void rate() {
        int n   = metric.count(pwd);
        int r   = metric.rate(0, n);
        
        assertEquals(2, r);
    }
}
