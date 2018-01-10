package bulat.example.pitestexample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import bulat.example.pitestexample.injection.DaggerTestComponent;

public class PitestTest {

    @Inject
    PitestWrapper pitestWrapper;

    @Before
    public void setUp() {
        DaggerTestComponent.builder().build().inject(this);
    }

    @Test
    public void pitest() throws Exception {
        Assert.assertEquals("http://192.168.0.1:8080", pitestWrapper.getApi());
    }
}