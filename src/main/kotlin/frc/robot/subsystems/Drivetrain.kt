package frc.robot.subsystems

import edu.wpi.first.wpilibj.motorcontrol.Spark
import edu.wpi.first.wpilibj2.command.SubsystemBase

// By making a subsystem a Kotlin object, we ensure there is only ever one instance of it.
// It also reduces the need to have reference variables for the subsystems to be passed around.
object Drivetrain : SubsystemBase()
{
    var leftMotor1 = Spark(0).apply {

    }
    var leftMotor2 = Spark(1).apply {

    }
    var rightMotor1 = Spark(2).apply {

    }
    var rightMotor2 = Spark(3).apply {

    }
    fun move (
        left : Double,
        right : Double
    ) {
        leftMotor1.set(left)
        leftMotor2.set(left)
        rightMotor1.set(right)
        rightMotor2.set(right)
    }
}

