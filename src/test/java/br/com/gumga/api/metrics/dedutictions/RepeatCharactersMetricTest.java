package br.com.gumga.api.metrics.dedutictions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.deductions.RepeatCharactersMetric;

public class RepeatCharactersMetricTest {

	private Metric metric;
	private String pwd = "AAC44"; 
	
    @Before
    public void setUp() {
        metric = new RepeatCharactersMetric();
    }

    @Test
    public void count() {
        int n = metric.count(pwd);        
        assertEquals(4, n);
    }
    
    
    @Test
    public void rate() {
        int n   = metric.count(pwd);
        int r   = metric.rate(0, n);
        
        assertEquals(-4, r);
    }    
}
