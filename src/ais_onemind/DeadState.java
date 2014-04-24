/*
Dead. In some games, the state of death may not be completely idle. Death or dying can have 
the entity “cry out,” alerting nearby entities, or go into a knocked-out state, where it can 
later be revived by a medic (and returned to a state of Alert).
 */

package ais_onemind;

/**
 *
 * @author NotCool
 */
public class DeadState extends State{
    DeadState(){
        super();
        this.setStateName("Dead");
    }
    
}
