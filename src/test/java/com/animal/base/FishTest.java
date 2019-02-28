package com.animal.base;

import com.animal.fishes.ClownFish;
import com.animal.fishes.Shark;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class FishTest
{

    Fish fish ;

    @Before
    public void setUp() {
        fish = mock(Fish.class);
    }

    @Test
    public void swimTest()
    {
        doCallRealMethod().when(fish).swim();
        fish.swim();
        verify(fish,times(1)).swim();
    }

    @Test
    public void sharkFishTest() {
        fish = new Shark();
        assertEquals("Shark",fish.getName());
        assertTrue(fish.isLarge());
        assertFalse(fish.isMakesJokes());
        assertTrue(fish.isEatOtherFishes());
    }

    @Test
    public void clownFishTest() {
        fish = new ClownFish();
        assertEquals("ClownFish",fish.getName());
        assertFalse(fish.isLarge());
        assertTrue(fish.isMakesJokes());
        assertFalse(fish.isEatOtherFishes());

    }
}
