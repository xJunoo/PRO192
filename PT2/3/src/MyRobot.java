
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tung Duy
 */
public class MyRobot implements IRobot{

    @Override
    public int f1(List<Robot> t) {
        int sum = 0;
        for (Robot robot : t) {
            String label = robot.getLabel();
            if (!label.contains("A") && !label.contains("B")) {
                sum += robot.getStep();
            }
        }
        return sum;
    }

    @Override
    public void f2(List<Robot> t) {
        Robot maxStepRobot = Collections.max(t, Comparator.comparingInt(Robot::getStep));
        t.remove(maxStepRobot);
    }

    @Override
    public void f3(List<Robot> t) {
        Collections.sort(t.subList(1, 4), (Robot rb1, Robot rb2) -> {
            if (rb1.getLabel().equals(rb2.getLabel())){
                return rb2.getStep()- rb1.getStep();
            }
            return rb1.getLabel().compareTo(rb2.getLabel());
        });
    }
    
}
