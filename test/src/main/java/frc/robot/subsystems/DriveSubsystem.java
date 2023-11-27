// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/* In this file, you will need to create two motor control groups with two motors in them each
 * that means that you will have four motors in total
 */
package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup; //Importing MotorControllerGroup
/*
The other imports are going to be CANSparkMax importS
You see the exact imports on the API
We will go over Third-Party Vendor imports on Wednesday but you can just do your imports from REV already
*/

public class DriveSubsystem extends SubsystemBase {

  public DriveSubsystem() 
  {
    /*
     Example of CANSparkMax Initialization
     CANSparkMax motor = new CANSparkMax(1, KBrushed);
     */
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
