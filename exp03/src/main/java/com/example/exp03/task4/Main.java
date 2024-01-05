package com.example.exp03.task4;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // 创建灯具对象
        Light livingRoomLight = new Light("客厅");
        Light kitchenLight = new Light("厨房");

        // 创建具体命令对象
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // 设置遥控器的插槽
        remoteControl.setCommand(1, livingRoomLightOn);
        remoteControl.setCommand(2, livingRoomLightOff);
        remoteControl.setCommand(3, kitchenLightOn);
        remoteControl.setCommand(4, kitchenLightOff);

        // 模拟用户按下遥控器的按钮
        remoteControl.pressButton(1);  // 打开客厅灯
        remoteControl.pressButton(2);  // 关闭客厅灯
        remoteControl.pressButton(3);  // 打开厨房灯
        remoteControl.pressButton(4);  // 关闭厨房灯
        remoteControl.pressButton(5);  // 该插槽没有设置命令
    }
}
