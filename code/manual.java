package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "ManualControl (Blocks to Java)", group = "")
public class ManualControl extends LinearOpMode {

  private Servo turn_bucket;
  private DcMotor right;
  private DcMotor arm_up;
  private DcMotor left;
  private DcMotor arm_forward;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    turn_bucket = hardwareMap.servo.get("turn_bucket");
    right = hardwareMap.dcMotor.get("right");
    arm_up = hardwareMap.dcMotor.get("arm_up");
    left = hardwareMap.dcMotor.get("left");
    arm_forward = hardwareMap.dcMotor.get("arm_forward");

    right.setDirection(DcMotorSimple.Direction.REVERSE);
    arm_up.setDirection(DcMotorSimple.Direction.REVERSE);
    // Reverse one of the drive motors.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
          // Basic controls of the motors for Drive
          left.setPower(gamepad1.left_stick_y);
          right.setPower(gamepad1.right_stick_y);
        
          if(gamepad.a
      }
    }
  }
}
