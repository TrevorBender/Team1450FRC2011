package Robot.Subsystems;

import Robot.Commands.Shooter.DefaultShooterCommand;
import Robot.Utils.BallReadySwitch;
import Robot.Utils.ShooterSpeedSensor;
import RobotMain.IODefines;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 */
public class Shooter extends Subsystem {

    private Jaguar shooterMotor = new Jaguar(IODefines.SHOOTER_MOTOR);
    private Victor arcMotor = new Victor(IODefines.SHOOTER_ANGLE_MOTOR);
    private ShooterSpeedSensor shooterSpeedSensor = new ShooterSpeedSensor();
    private Relay triggerRelay = new Relay(IODefines.TRIGGER_RELAY);
    private BallReadySwitch ballReadySwitch = new BallReadySwitch();

    public Shooter() {
        triggerRelay.setDirection(Relay.Direction.kBoth);
        ballReadySwitch.setBallReadyListener(new BallReadySwitch.BallReadyListener() {
            public void ballReady(boolean ready) {
                System.out.println("Ball ready = " + ready);
            }
        });
    }

    protected void initDefaultCommand() {
        setDefaultCommand(new DefaultShooterCommand());
    }

    public void resetSpeedSensor() {
        shooterSpeedSensor.reset();
    }
    
    public void dontSpin() {
        shooterMotor.set(0.0);
    }

    public void throttle(double throttle) {
        shooterMotor.set(-throttle);
    }

    public void triggerOn() {
        triggerRelay.set(Relay.Value.kForward);
    }
    
    public void triggerOff() {
        triggerRelay.set(Relay.Value.kOff);
    }

    public void setArc(double arc) {
        // use half power
        arcMotor.set(arc);
    } 
}
