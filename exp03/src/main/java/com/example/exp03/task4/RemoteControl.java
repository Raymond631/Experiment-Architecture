package com.example.exp03.task4;

import java.util.HashMap;

public class RemoteControl {
    private HashMap<Integer, Command> commandSlots;

    public RemoteControl() {
        commandSlots = new HashMap<>(5);
    }

    public void setCommand(int slot, Command command) {
        commandSlots.put(slot, command);
    }

    public void pressButton(int slot) {
        Command command = commandSlots.get(slot);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("该插槽没有设置命令");
        }
    }
}
