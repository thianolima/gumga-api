package br.com.gumga.api.metrics.dedutictions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.deductions.ConsecutiveNumbersMetric;

public class ConsecutiveNumbersMetricTest {
	private Metric metric;
	private String pwd = "AA99U 45678E"; 
	
    @Before
    public void setUp() {
        metric = new ConsecutiveNumbersMetric();
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
        
        assertEquals(-10, r);
    }
}
