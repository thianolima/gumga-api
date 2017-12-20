package br.com.gumga.api.metrics.dedutictions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.deductions.SequentialSymbolsMetric;

public class SequentialSymbolsMetricTest {
	private Metric metric;
	private String pwd = "1! @#$ %^*1A"; 
	
    @Before
    public void setUp() {
        metric = new SequentialSymbolsMetric();
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
