/*
Alert. In this state, the entity has become aware of the player and will go through the 
actions of hunting down the player: moving into range of attack, alerting fellow guards, 
sounding alarms, and finding cover. When the entity is within range of the enemy, it switches 
to the Aggressive state.
 */

package ais_onemind;

/**
 *
 * @author NotCool
 */
public class AlertState extends State{
    AlertState(){
        super();
        this.setStateName("Alert");
    }
}
