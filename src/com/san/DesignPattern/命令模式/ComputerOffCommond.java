package com.san.DesignPattern.命令模式;

public class ComputerOffCommond implements Command {

    private Computer computer ;

    public ComputerOffCommond( Computer computer)
    {
        this.computer = computer;
    }

    @Override
    public void execute()
    {
        computer.off();
    }

}
