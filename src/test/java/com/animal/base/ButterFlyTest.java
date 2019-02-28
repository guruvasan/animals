package com.animal.base;

import com.animal.insects.Butterfly;
import static org.junit.Assert.*;

import com.animal.insects.stage.ButterFlyStage;
import com.stages.Stage;
import org.junit.Test;

public class ButterFlyTest
{
    private Butterfly butterfly;

    @Test
    public void butterflyMetamorphosisTest () {
        butterfly = new Butterfly();
        asertCatterPillar();

        butterfly.moveToNextStage();


        assertButterFly();

        Stage stage = new ButterFlyStage();
        butterfly = new Butterfly(stage);

        assertButterFly();
    }

    private void asertCatterPillar() {
        assertEquals("CatterPillar",butterfly.getName());
        assertFalse(butterfly.isFlyable());
    }

    private void assertButterFly() {
        assertEquals("Butterfly",butterfly.getName());
        assertTrue(butterfly.isFlyable());
    }
}
