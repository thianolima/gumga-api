package br.com.gumga.api.metrics.auditions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.additions.NumberOfCharactersMetric;

public class NumberOfCharactersMetricTest {
	private Metric metric;
	private String pwd = "Py5fcvmo"; 
	
    @Before
    public void setUp() {
        metric = new NumberOfCharactersMetric();
    }

    @Test
    public void count() {
        int n = metric.count(pwd);        
        assertEquals(8, n);
    }
    
    @Test
    public void rate() {
        int n   = metric.count(pwd);
        int r   = metric.rate(0, n);
        assertEquals(32, r);
    }
}
