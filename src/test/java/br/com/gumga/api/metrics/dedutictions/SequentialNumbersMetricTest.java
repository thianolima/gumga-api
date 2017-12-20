package br.com.gumga.api.metrics.dedutictions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.deductions.SequentialNumbersMetric;

public class SequentialNumbersMetricTest {
	private Metric metric;
	private String pwd = "re45699RT00987"; 
	
    @Before
    public void setUp() {
        metric = new SequentialNumbersMetric();
    }

    @Test
    public void count() {
        int n = metric.count(pwd);        
        assertEquals(2, n);
    }

    @Test
    public void rate() {
        int n   = metric.count(pwd);
        int r   = metric.rate(0, n);
        
        assertEquals(-6, r);
    }
}
