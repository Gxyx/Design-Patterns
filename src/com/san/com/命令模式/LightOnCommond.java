package com.san.com.命令模式;

public class LightOnCommond implements Command {
    private Light light ;

    public LightOnCommond(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.on();
    }

}
