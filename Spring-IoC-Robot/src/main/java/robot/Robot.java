package robot;

import robot.partsOfBody.interfaces.Hand;
import robot.partsOfBody.interfaces.Head;
import robot.partsOfBody.interfaces.Leg;

/**
 * Created by Michael Rudyy on 22-Jun-17.
 */

public class Robot {
    //@Autowired
    //@Qualifier("firstHead")
    private Head head;
    //@Autowired
    //@Qualifier("firstHand")
    private Hand hand;
    //@Autowired
    //@Qualifier("firstLeg")
    private Leg leg;

    Robot() {
    }

    public Robot(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    void action() {
        this.head.action();
        this.hand.action();
        this.leg.action();
    }


    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }
}
