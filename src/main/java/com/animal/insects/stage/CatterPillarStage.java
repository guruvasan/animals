package com.animal.insects.stage;

import com.stages.Stage;

public class CatterPillarStage implements Stage
{

    public CatterPillarStage() {

    }

    @Override
    public Stage nextStage() {
        return new ButterFlyStage();
    }


}
