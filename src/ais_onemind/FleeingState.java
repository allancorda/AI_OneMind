/*
Fleeing. In this state, the entity tries to run from combat. Depending on the game, there 
may be a secondary goal of finding health or leaving the play area. When the entity finds health, 
it may return to the Alert state and resume combat. An entity that “leaves” is merely deleted.
 */

package ais_onemind;

/**
 *
 * @author NotCool
 */
public class FleeingState extends State {
    FleeingState(){
        super();
        this.setStateName("Flee");
    }
}
