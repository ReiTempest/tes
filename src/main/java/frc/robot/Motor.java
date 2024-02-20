// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
  CANSparkMax motor2;
  CANSparkMax motor3;
  CANSparkMax motor4;
  /** Creates a new Motor. */
  public Motor() {
    motor2 = new CANSparkMax(10, MotorType.kBrushless);
    motor3 = new CANSparkMax(22, MotorType.kBrushless);
    motor4 = new CANSparkMax(23, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
