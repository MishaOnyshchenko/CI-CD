package com.epam.lab.demo.app;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;

public class AppTest {
    private App app = new App();
    private App spy = Mockito.spy(app);

    @Test
    public void testReadFileRunsPrintTheStringAndSleepForSecond() throws IOException, InterruptedException {
        //GIVEN
        doNothing().when(spy).printTheStringAndSleepForSecond(anyString());
        //WHEN
        spy.readFile();
        //THEN
        Mockito.verify(spy, Mockito.times(27)).printTheStringAndSleepForSecond(anyString());
    }
}
