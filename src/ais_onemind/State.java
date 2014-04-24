/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ais_onemind;

/**
 *
 * @author NotCool
 */
public class State {
    private String stateName;
    private State s;

    
    public void switchState(State s){
        this.s = s;
    }

    /**
     * @return the stateName
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * @param stateName the stateName to set
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    /**
     * @return the s
     */
    public State getState() {
        return s;
    }
}
