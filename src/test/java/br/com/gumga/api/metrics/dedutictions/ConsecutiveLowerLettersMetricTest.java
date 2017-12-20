package br.com.gumga.api.metrics.dedutictions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.deductions.ConsecutiveLowercaseLettersMetric;

public class ConsecutiveLowerLettersMetricTest {
	private Metric metric;
	private String pwd = "aaUT00dde9BC"; 
	
    @Before
    public void setUp() {
        metric = new ConsecutiveLowercaseLettersMetric();
    }

    @Test
    public void count() {
        int n = metric.count(pwd);        
        assertEquals(3, n);
    }

    @Test
    public void rate() {
        int n   = metric.count(pwd);
        int r   = metric.rate(0, n);
        
        assertEquals(-6, r);
    }
}
