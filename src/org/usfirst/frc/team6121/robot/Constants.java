/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6121.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class Constants {
	//Motor max and min constants
		public static final double MAX_MOTOR_SPEED = 1;
		public static final double MIN_MOTOR_SPEED = -1;
		public static final double HALF_MOTOR_SPEED = .5;
		public static final double STOP_MOTOR = 0;
		
		//Portmap
		public static final int LEFT_FRONT_DRIVE_MOTOR_PORT = 0;
		public static final int LEFT_REAR_DRIVE_MOTOR_PORT = 1;
		public static final int RIGHT_FRONT_DRIVE_MOTOR_PORT = 2;
		public static final int RIGHT_REAR_DRIVE_MOTOR_PORT = 3;
		public static final int EXAMPLE_PNEUMATIC_PORT = 1;
	}

