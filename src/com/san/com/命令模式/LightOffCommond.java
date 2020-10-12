package com.san.com.命令模式;

public class LightOffCommond implements Command {
    private Light light;
    public LightOffCommond(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
