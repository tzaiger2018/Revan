package org.usfirst.frc.team6121.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class Actuators {
	//all motors variables get created in this file
	
		//Motors
		private static Talon rightDriveMotor;
		private static Talon rightDriveMotorSlave;
		
		private static Talon leftDriveMotor;
		private static Talon leftDriveMotorSlave;
		
		
		
		//Pneumatics
		private static Solenoid examplePneumatic;
		
		//Initializations
		public static void init(){
			//motors
			rightDriveMotor = new Talon(Constants.RIGHT_FRONT_DRIVE_MOTOR_PORT);
			rightDriveMotorSlave = new Talon(Constants.RIGHT_REAR_DRIVE_MOTOR_PORT);
			//rightDriveMotorSlave.follow(rightDriveMotor);
			
			
			leftDriveMotor = new Talon(Constants.LEFT_FRONT_DRIVE_MOTOR_PORT);
			leftDriveMotorSlave = new Talon(Constants.LEFT_REAR_DRIVE_MOTOR_PORT);
			//leftDriveMotorSlave.follow(leftDriveMotor);
			//pneumatics
			examplePneumatic = new Solenoid(Constants.EXAMPLE_PNEUMATIC_PORT);
			
		}
		
		//Actuator returns below
		public static Talon getRightDriveMotor(){
			return rightDriveMotor;
		}
		public static Talon getRightDriveMotorSlave(){
			return rightDriveMotorSlave;
		}
		public static Talon getLeftDriveMotor(){
			return leftDriveMotor;
		}
		public static Talon getLeftDriveMotorSlave(){
			return leftDriveMotorSlave;
		}
		
		//Pneumatic returns below
		public static Solenoid getExamplePneumatic(){
			return examplePneumatic;
		}
	}



