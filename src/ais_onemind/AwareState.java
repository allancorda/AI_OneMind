/*
Aware. This entity is actively searching for intruders. It checks often for the sounds of the 
player and sees farther and wider than an idle entity. This entity will move to the 
Intrigued state if it notices something out of place (something to check for), 
such as open doors, unconscious bodies, or spent bullet casings.
 */

package ais_onemind;

/**
 *
 * @author NotCool
 */
public class AwareState extends State {
    AwareState(){
        super();
        this.setStateName("Aware");
    }
}
