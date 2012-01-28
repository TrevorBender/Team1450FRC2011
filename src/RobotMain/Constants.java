/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RobotMain;

/**
 *
 * @author chad
 */
public class Constants {
    //public static final double elevatorDistancePerPulse = Elevator.distancePerPulse;
    //public static final double elevatorDistanceToTop = Elevator.distanceToTop;
    //public static final double driveDistancePerPulse = Drives.distancePerPulse;

    public class Elevator {
        // Private constants
        private static final double inchesPerShaftRotation = 0.5;
        private static final double encoderTicksPerRev = 250.0;
        private static final double encoderGearTeeth = 16.0;
        private static final double shaftGearTeeth = 21.0;

        // Public constants
        public static final double distanceToTop = 42.0;
        public static final double lowerLimit = 0;
        public static final double upperLimit = distanceToTop;
        public static final double initialPosition = 0;
        public static final double distancePerPulse = (inchesPerShaftRotation /
                encoderTicksPerRev) * (encoderGearTeeth/shaftGearTeeth);
        public static final double scoringPosition = 19;
        public static final long loopTime = 50;
    }

    public class Drives {
        // Private constants
        private static final double inchesPerWheelRotation = 20.25;
        private static final double encoderTicksPerRev = 250.0;
        private static final double encoderGearTeeth = 12.0;
        private static final double wheelGearTeeth = 26.0;
        private static final double startToDriverStation = 216.4;
        private static final double scoringPegLength = 19.5;
        private static final double robotPegClearance = 10;

        // Public constants
        public static final double distancePerPulse = (inchesPerWheelRotation /
                encoderTicksPerRev) * (encoderGearTeeth/wheelGearTeeth);
        public static final double distancePerPulse_DEBUG_BOT = (inchesPerWheelRotation /
                encoderTicksPerRev);
        public static final double distanceToScoringRack = (startToDriverStation - 
                (scoringPegLength + robotPegClearance));
        public static final long loopTime = 50;
        public static final double distanceBackFromScoringRack = distanceToScoringRack - 36;

    }

    public class Wrist {
        public static final double lowerLimitPotVal = 143;
        public static final double upperLimitPotVal = 743;
        public static final double initialPosition = 743;
        public static final double straightPosition = 333;
        public static final double scoringPosition = 484;
        public static final double upPosition = 300;
        public static final double potRange = upperLimitPotVal - lowerLimitPotVal;
        public static final long loopTime = 50;
    }

    public class Solenoid {
        public static final long loopTime = 50;
    }

    public class LimitSwitches
    {
        public static final long loopTime = 50;
    }

    public class MiniBotDeployment
    {
        public static final long loopTime = 50;
        public static final double speed = 0.5;
        public static final long enableAfterTime = 105000;
    }

}
