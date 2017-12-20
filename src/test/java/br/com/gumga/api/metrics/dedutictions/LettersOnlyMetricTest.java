package br.com.gumga.api.metrics.dedutictions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.deductions.LettersOnlyMetric;

public class LettersOnlyMetricTest {
	private Metric metric;
	private String pwd = "ANGELO BRIVIO"; 
	
    @Before
    public void setUp() {
        metric = new LettersOnlyMetric();
    }

    @Test
    public void count() {
        int n = metric.count(pwd);        
        assertEquals(13, n);
    }

    @Test
    public void rate() {
        int n   = metric.count(pwd);
        int r   = metric.rate(0, n);
        
        assertEquals(-13, r);
    }
}
