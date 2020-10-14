package com.san.DesignPattern.命令模式;

public class ComputerOnCommond implements Command {

    private Computer computer ;

    public ComputerOnCommond( Computer computer)
    {
        this.computer = computer;
    }

    @Override
    public void execute()
    {
        computer.on();
    }

}
