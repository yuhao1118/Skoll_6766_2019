/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ElevatorRawCommand extends Command {
    public ElevatorRawCommand() {

    }

    @Override
    protected void initialize() {
        Robot.elevatorSubsytem.config();
    }

    @Override
    protected void execute() {
        double input = Robot.m_oi.getRightAxis(3) - Robot.m_oi.getRightAxis(2);
        if (input < 0.1 && input > -0.1) {
            Robot.elevatorSubsytem.setSpeed(0.05);
        }
        Robot.elevatorSubsytem.setSpeed(input);
    }

    @Override
    protected boolean isFinished() {
        return false;
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
