package command;

import command.command.Command;
import command.command.NoCommand;

/*
    This class is Invoker
 */
public class RemoteControl {
    private Command[] onCommands = new Command[6];
    private Command[] offCommands = new Command[6];

    public RemoteControl() {
        NoCommand command = new NoCommand();
        for (int i=0; i<3; i++){
            offCommands[i] = command;
            onCommands[i] = command;
        }
    }

    public void assignCommand(int slot, Command onCommand, Command offCommand) {
        offCommands[slot] = offCommand;
        onCommands[slot] = onCommand;
    }

    public void buttonOnPressed(int slot) {
        onCommands[slot].execute();
    }

    public void buttonOffPressed(int slot) {
        offCommands[slot].execute();
    }

}
