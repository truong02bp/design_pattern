package command.command;

import command.receiver.CeilingFan;

public class FanSpeedHighCommand implements Command {

    private final CeilingFan ceilingFan;
    private CeilingFan.SpeedStatus preSpeed;

    public FanSpeedHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceilingFan.getSpeedStatus();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        switch (preSpeed) {
            case LOW:
                ceilingFan.low();
                break;
            case HIGH:
                ceilingFan.high();
                break;
            case MEDIUM:
                ceilingFan.medium();
                break;
        }
    }
}
