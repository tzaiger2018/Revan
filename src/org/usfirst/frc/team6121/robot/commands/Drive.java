/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6121.robot.commands;

import org.usfirst.frc.team6121.robot.Actuators;
import org.usfirst.frc.team6121.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;

/**
 * An example command.  You can replace me with your own command.
 */
public class Drive {
	//Initiations for every Actuator used in this file. Set them all to 0
		public static void init(){
		Actuators.getLeftDriveMotor().set(ControlMode.PercentOutput, Constants.STOP_MOTOR);
		Actuators.getRightDriveMotor().set(ControlMode.PercentOutput, Constants.STOP_MOTOR);
		}
		//creating the drive code for tank drive
		public static void drive(double leftSpeed, double rightSpeed){
			//Ensures that the value for left and right speeds will always be between the Max and Min values
			leftSpeed = Math.min(leftSpeed, Constants.MAX_MOTOR_SPEED);
			leftSpeed = Math.max(leftSpeed, Constants.MIN_MOTOR_SPEED);
			rightSpeed = Math.min(rightSpeed, Constants.MAX_MOTOR_SPEED);
			rightSpeed = Math.max(rightSpeed, Constants.MIN_MOTOR_SPEED);
			
			//Sets the speeds for the Motors
			Actuators.getLeftDriveMotor().set(ControlMode.PercentOutput, leftSpeed);
			Actuators.getRightDriveMotor().set(ControlMode.PercentOutput, rightSpeed);
			
		}
	}