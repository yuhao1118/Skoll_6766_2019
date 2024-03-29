/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.elevatorCommands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ElevatorBtnCommand extends Command {
    public double speed;

    public ElevatorBtnCommand(double speed) {
        this.speed = speed;
    }

    @Override
    protected void initialize() {
        Robot.elevatorSubsytem.config();
    }

    @Override
    protected void execute() {
        Robot.elevatorSubsytem.setSpeed(speed);
    }

    @Override
    protected boolean isFinished() {
        return false;
//        return this.timeSinceInitialized() >= 1;
    }

    @Override
    protected void end() {
        Robot.elevatorSubsytem.setSpeed(0);
    }

    @Override
    protected void interrupted() {
        end();
    }
}
