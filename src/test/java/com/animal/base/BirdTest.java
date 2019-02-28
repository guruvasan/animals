package com.animal.base;

import com.animal.birds.Chicken;
import com.animal.birds.Duck;
import static org.junit.Assert.*;
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

    @Test
    public void duckShouldSingQuackQuackTest() {
        bird = new Duck();
        bird.sing();
        assertEquals("Duck",bird.getName());
        assertTrue(bird.isSwimmable());


        bird = mock(Duck.class);
        singTest();
    }

    @Test
    public void chickenShouldSayCluckCluckTest() {
        bird = new Chicken();
        bird.sing();
        assertEquals("Chicken",bird.getName());
        assertFalse(bird.isSwimmable());

        bird = mock(Chicken.class);
        singTest();
    }
}
