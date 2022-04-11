package command;

import command.command.CeilingFanOffCommand;
import command.command.CeilingFanOnCommand;
import command.command.DoorCloseCommand;
import command.command.DoorOpenCommand;
import command.command.LightOffCommand;
import command.command.LightOnCommand;
import command.receiver.CeilingFan;
import command.receiver.Door;
import command.receiver.Light;

public class Client {

    public static void main(String[] args) {
        // create Invoker
        RemoteControl remoteControl = new RemoteControl();

        // create Receiver
        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");

        CeilingFan livingRoomCeilingFan = new CeilingFan("Living room");
        CeilingFan bedRoomCeilingFan = new CeilingFan("Bed room");

        Door houseDoor = new Door("House");
        Door bedRoomDoor = new Door("Bed room");

        // create Command light
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // create Command fan
        CeilingFanOnCommand ceilingFanLivingRoomOn = new CeilingFanOnCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanLivingRoomOff = new CeilingFanOffCommand(livingRoomCeilingFan);
        CeilingFanOnCommand ceilingFanBedRoomOn = new CeilingFanOnCommand(bedRoomCeilingFan);
        CeilingFanOffCommand ceilingFanBedRoomOff = new CeilingFanOffCommand(bedRoomCeilingFan);

        // create Command door
        DoorOpenCommand houseDoorOpen = new DoorOpenCommand(houseDoor);
        DoorCloseCommand houseDoorClose = new DoorCloseCommand(houseDoor);
        DoorOpenCommand bedRoomDoorOpen = new DoorOpenCommand(bedRoomDoor);
        DoorCloseCommand bedRoomDoorClose = new DoorCloseCommand(bedRoomDoor);

        // assign command to invoker
        remoteControl.assignCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.assignCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.assignCommand(2, ceilingFanLivingRoomOn, ceilingFanLivingRoomOff);
        remoteControl.assignCommand(3, ceilingFanBedRoomOn, ceilingFanBedRoomOff);
        remoteControl.assignCommand(4, houseDoorOpen, houseDoorClose);
        remoteControl.assignCommand(5, bedRoomDoorOpen, bedRoomDoorClose);

        remoteControl.buttonOnPressed(3);
        remoteControl.buttonOffPressed(3);
        remoteControl.buttonOnPressed(5);
        remoteControl.buttonOnPressed(1);
        remoteControl.buttonUndoPressed();
    }
}
