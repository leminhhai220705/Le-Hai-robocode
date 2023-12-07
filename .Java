package Hai;




import robocode;
import java.awt.Color;
public class RobotLehai extends AdvancedRobot {


int gunDirection = 1;


public void run() {



   setBodyColor(Color.gray);


   setRadarColor(Color.red);


   setGunColor(Color.cyber);


   setBulletColor(Color.white);




   while (true) {


     turnGunRight(360);


   }

}


public void onScannedRobot(ScannedRobotEvent e) {



   setTurnRight(e.getBearing());



   setFire(3);


   setAhead(100);



   gunDirection = -gunDirection;





   setTurnGunRight(360 * gunDirection);


  


   execute();


 }


}

