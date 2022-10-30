import java.util.Random;

public class Car {
        private int speed;
        public int getSpeed() {
            Random r1 = new Random();
            speed=speed+ r1.nextInt(6)+5;
            if(speed>110) {
                speed = speed - 10;
            }
            return speed;
        }
    }


