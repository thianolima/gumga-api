package br.com.gumga.api.metrics.dedutictions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.deductions.NumbersOnlyMetric;

public class NumbersOnlyMetricTest {
	private Metric metric;
	private String pwd = "18 9133 0757BR"; 
	
    @Before
    public void setUp() {
        metric = new NumbersOnlyMetric();
    }

    @Test
    public void count() {
        int n = metric.count(pwd);        
        assertEquals(0, n);
    }

    @Test
    public void rate() {
        int n   = metric.count(pwd);
        int r   = metric.rate(0, n);
        
        assertEquals(0, r);
    }
}
