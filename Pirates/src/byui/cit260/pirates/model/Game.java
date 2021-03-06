/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;


import java.io.Serializable;

/**
 *
 * @author Coleen
 */
public class Game implements Serializable{
    private Ship ship;
    private Supply[] supplies;
    private Player player;
    private Map map;
    private String[] avatars;
    private Avatar avatar;
    private Scene[] scenes;
    private Location[][] location;

    public Location[][] getLocation() {
        return location;
    }

    public void setLocation(Location[][] location) {
        this.location = location;
    }
    

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public void setSupplies(Supply[] supplies) {
        this.supplies = supplies;
    }

    public void setAvatars(String[] avatars) {
        this.avatars = avatars;
    }
    
    
    
    public Supply[] getSupplies() {
        return supplies;
    } 
   public String[] getAvatars() {
        return avatars;
    }
   
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
   
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setScenes(Scene[] scenes) {
       this.scenes = scenes;
    }

    @Override
    public String toString() {
        return "Game{" + "ship=" + ship + ", supplies=" + supplies + ", player=" + player + ", map=" + map + ", avatars=" + avatars + ", avatar=" + avatar + ", scenes=" + scenes + ", location=" + location + '}';
    }
    


}
