package br.com.gumga.api.metrics.dedutictions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.deductions.SequentialLettersMetric;

public class SequentialLettersMetricTest {
	private Metric metric;
	private String pwd = "re45699RST00987"; 
	
    @Before
    public void setUp() {
        metric = new SequentialLettersMetric();
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
        
        assertEquals(-3, r);
    }
}
