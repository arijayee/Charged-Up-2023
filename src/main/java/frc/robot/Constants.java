// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final class DriveConstants {
    public static final int kLeftMotor1Port = 7;
    public static final int kLeftMotor2Port = 17;
    public static final int kRightMotor1Port = 8;
    public static final int kRightMotor2Port = 18;
  }

  public static final class ElevatorConstants { 
    public static final int kElevMotorPort = 25; // 25 is a placeholder
  }

  public static final class ArmConstants {
    public static final int kArmMotorPort = 5; // 5 is a placeholder
  }

  public static final class ClawConstants {
    public static final int kClawMotorPort = 19; // 19 is a placeholder
  }

  public static final class LightingConstants {  }

  public static final class AutoConstants {  }

  public static final class IOConstants {
    public static final int kDriverControllerPort = 0;
    public static final int kCoDriverControllerPort = 1;
  }
}
