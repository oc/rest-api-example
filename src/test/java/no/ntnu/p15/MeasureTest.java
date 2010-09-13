package no.ntnu.p15;

import no.ntnu.p15.model.Measure;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class MeasureTest {

    @Test
    public void shouldSupportName() {
        Measure measure = new Measure("abc");
        assertThat(measure.getName(), equalTo("abc"));
    }
}
