package br.com.gumga.api.metrics.auditions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.gumga.api.metrics.Metric;
import br.com.gumga.api.metrics.additions.RequirementsMetric;

public class RequirementsMetricTest {
	private Metric metric;
	private String pwd = "Aar@awDf) "; 
	
    @Before
    public void setUp() {
        metric = new RequirementsMetric();
    }

    @Test
    public void count() {
        int n = metric.count(pwd);        
        assertEquals(4, n);
    }
    
    @Test
    public void rate() {
        int n = metric.count(pwd);
        int r = metric.rate(0, n);
        
        assertEquals(8, r);
    }    
}
