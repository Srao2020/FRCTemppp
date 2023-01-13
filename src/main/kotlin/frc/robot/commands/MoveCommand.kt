package frc.robot.commands

import edu.wpi.first.wpilibj2.command.CommandBase
import frc.robot.subsystems.Drivetrain

class MoveCommand : CommandBase()
{
    init
    {
        addRequirements(Drivetrain)
        // Call addRequirements() here to declare subsystem dependencies.
    }

    override fun execute() {
        Drivetrain.move(0.0, 0.0)
    }
}
