package com.san.DesignPattern.命令模式;

public class DoorOnCommond implements Command {

    private Door door ;

    public DoorOnCommond( Door door)
    {
        this.door = door;
    }

    @Override
    public void execute()
    {
        door.open();
    }
}
