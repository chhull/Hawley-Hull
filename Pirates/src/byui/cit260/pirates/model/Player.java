/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Coleen
 */
public class Player implements Serializable{
 private String name;
private double bestTime;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }

    public Player(String name, double bestTime) {
        this.name = name;
        this.bestTime = bestTime;
    }
    
    public Player() {
    }
    public String getName() { return name; }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }

    public double getBestTime() { return bestTime; }

}