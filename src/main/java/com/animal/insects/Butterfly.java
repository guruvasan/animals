package com.animal.insects;

import com.animal.base.Insect;
import com.animal.insects.stage.ButterFlyStage;
import com.animal.insects.stage.CatterPillarStage;
import com.stages.Stage;

public class Butterfly extends Insect
{
    private static final String BUTTERFLY = "Butterfly";
    private static final String CATTERPILLAR = "CatterPillar";

    private Stage insectStage;


    public Butterfly() {
        super();
        this.insectStage = new CatterPillarStage();  // Default will be Catterpillar
        setName(CATTERPILLAR);
        setFlyable(Boolean.FALSE);
        System.out.println("[Butterfly]  Properties :: "+super.toString());
    }

    public Butterfly(Stage insectStage) { // Create Butterfly with specific Stage Object
        this();
        this.insectStage = insectStage;

    }


    public void moveToNextStage() {
        this.insectStage = insectStage.nextStage();
    }


    @Override
    public void walk() {
        if(isButterFly()) {
            System.out.println("[ButterFly]  Walking.");
        } else {
            System.out.println("[ButterFly]  CatterPillar Crawling. ");
        }
    }

    @Override
    public void fly() {
        if(isButterFly()) {
            System.out.println("[ButterFly]  Can Fly :: ");
        } else {
            System.out.println("[ButterFly] CatterPillar Can Not Fly :: ");
        }
    }

    private boolean isButterFly() {
        return this.insectStage instanceof ButterFlyStage;
    }


    @Deprecated
    @Override
    public void sound() {
        System.err.println("[ButterFly]  Can Not Make Any Sound :: ");
    }

    @Override
    public String getName() {
        if(isButterFly()) {
            return BUTTERFLY;
        }
        return CATTERPILLAR;
    }

    @Override
    public boolean isFlyable() {
        if(isButterFly()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
