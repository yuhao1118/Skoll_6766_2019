/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

public class BackGroundCommand extends Command {

    public BackGroundCommand() {
        SmartDashboard.putData(this);
    }

    @Override
    protected void initialize() {
        Robot.timeConstants.set();
        Robot.physicsConstants.set();
        Robot.portConstants.set();
        Robot.elevatorPID.set();
        Robot.intakePID.set();
    }

    @Override
    protected void execute() {
        Robot.timeConstants.refresh();
        Robot.physicsConstants.refresh();
        Robot.portConstants.refresh();
        Robot.elevatorPID.refresh();
        Robot.intakePID.refresh();

//        Robot.elevatorSubsytem.getSpeed();
//        Robot.intakeSubsystem.getSpeed();
//        Robot.elevatorSubsytem.getPosition();
//        Robot.intakeSubsystem.getPosition();

    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted() {
    }
}
