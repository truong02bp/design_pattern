package command;

import command.command.Command;
import command.command.NoCommand;

/*
    This class is Invoker
 */
public class RemoteControl {
    private Command[] onCommands = new Command[6];
    private Command[] offCommands = new Command[6];
    private Command lastCommand;

    public RemoteControl() {
        NoCommand command = new NoCommand();
        for (int i = 0; i < 3; i++) {
            offCommands[i] = command;
            onCommands[i] = command;
        }
        lastCommand = command;
    }

    public void assignCommand(int slot, Command onCommand, Command offCommand) {
        offCommands[slot] = offCommand;
        onCommands[slot] = onCommand;
    }

    public void buttonOnPressed(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void buttonOffPressed(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void buttonUndoPressed() {
        lastCommand.undo();
    }
}
