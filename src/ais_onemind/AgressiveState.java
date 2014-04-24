/*
Aggressive. This is the state where the enemy has engaged in combat with the player. 
The entity attacks the player when it can and seeks cover between rounds of attack 
(based on attack cool-downs or reloading). The entity only leaves this state if the enemy is 
killed (return to normal), if the enemy moves out of firing range (go back to the Alert stage), 
or if the entity dies (go to the Dead state). If the entity becomes low on health, it may switch 
to the Fleeing state, depending on the courage of the specific entity.
 */

package ais_onemind;

/**
 *
 * @author NotCool
 */
public class AgressiveState extends State {
    AgressiveState(){
        super();
        this.setStateName("Agressive");
    }
}
