package com.animal.base;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BirdTest
{
    private Bird bird = mock(Bird.class);

    @Test
    public void flyTest() {
        doCallRealMethod().when(bird).fly();
        bird.fly();
        verify(bird,times(1)).fly();
    }

    @Test
    public void singTest() {
        doCallRealMethod().when(bird).sing();
        bird.sing();
        verify(bird,times(1)).sing();
    }
}
