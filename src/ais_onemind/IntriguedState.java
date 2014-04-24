/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ais_onemind;

/*
Intrigued This entity is aware that something is up. To demonstrate this behavior, the entity 
will abandon its normal post or path and move to areas of interest, such as the aforementioned 
open doors or bodies. If a player is seen, the entity goes to the Alert state.
*/

/**
 *
 * @author NotCool
 */
public class IntriguedState extends State {
    IntriguedState(){
        super();
        this.setStateName("Intrigued");
    }
}