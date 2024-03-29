package frc.robot.commands.intakeCommands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class IntakeBallCommand extends Command {
    double upSpeed = 0;
    double downSpeed = 0;


    public IntakeBallCommand(double upSpeed, double downSpeed) {
        this.downSpeed = downSpeed;
        this.upSpeed = upSpeed;

    }

    @Override
    protected void initialize() {
        Robot.intakeSubsystem.intake_config();
    }

    @Override
    protected void execute() {
        Robot.intakeSubsystem.setIntakeUDSpeed(upSpeed, downSpeed);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
        Robot.intakeSubsystem.setIntakeUDSpeed(0, 0);
    }

    @Override
    protected void interrupted() {
        end();
    }
}
