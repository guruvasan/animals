package com.animal.base;

import com.animal.birds.Chicken;
import com.animal.birds.Duck;
import static org.junit.Assert.*;

import com.animal.birds.Parrot;
import com.animal.birds.Rooster;
import org.junit.Test;

import java.util.Locale;

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

    @Test
    public void roosterSaysCock_a_doodle_do_Test() {
        Chicken chicken = new Chicken();
        Rooster rooster = new Rooster();
        chicken.setRooster(rooster);
        chicken.sing();

        assertNotNull(chicken.getRooster());
        bird = mock(Rooster.class);
        singTest();

    }

    @Test
    public void parrotSaysCock_a_doodle_do_And_Woof_Woof_Test() {
        Parrot parrot = new Parrot();
        Rooster rooster = new Rooster();
        parrot.setLivesNearBy(rooster);
        parrot.sing();

        bird = mock(Rooster.class);
        singTest();

        Dog  dog = new Dog();
        parrot.setLivesNearBy(dog);
        parrot.sing();

        dog = mock(Dog.class);
        doCallRealMethod().when(dog).sound();
        parrot.setLivesNearBy(dog);
        parrot.sing();
        verify(dog,times(1)).sound();
    }


    @Test
    public void roosterSaysCock_a_doodle_do_in_various_language_Test() {
        Rooster rooster = mock(Rooster.class);

        Locale locale = Locale.forLanguageTag("ta-IN"); // Tamil is my second language
        doCallRealMethod().when(rooster).sing(locale);
        rooster.sing(locale);

        Locale locale1 = Locale.forLanguageTag("hi-IN"); // Hindi was given Since not in the list Returned the default
        doCallRealMethod().when(rooster).sing(locale1);
        rooster.sing(locale1);
    }
}
