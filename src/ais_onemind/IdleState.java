/*
 Idle State: 
In this state, the entity is passively standing around or walking along a set path. 
Perceptions are low. Player sounds are not often checked for. 
Only if this entity is attacked or “sees” a player directly in front of it will its state change 
to a higher level of awareness.
 */

package ais_onemind;

/**
 *
 * @author NotCool
 */
public class IdleState extends State {
    IdleState(){
        super();
        this.setStateName("Idle");
    }
}
