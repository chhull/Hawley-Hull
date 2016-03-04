/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import java.io.Serializable;


/**
 *
 * @author hawle_000
 */
public class MoveView extends View implements Serializable{

    public MoveView() {
        super("\n-------------------------------"
            + "\n       Move  Menu              "
            + "\n-------------------------------"
            + "\nW - Move up"
            + "\nS - Move down"
            + "\nA - Move left"
            + "\nD - Move right"
            + "\nE - Exit"
            + "\n--------------------------------");
    }
    @Override
    public boolean doAction(String value) {
         value = value.toUpperCase();
    char selection;
     selection = value.charAt(0); 
       switch(selection){
           case 'W': 
               this.moveShipUp();
               break;
           case 'S':
              this.moveShipDown();
               break;
           case 'G':
              this.moveShipLeft();
              break;
           case 'M':
               this.moveShipRight();
               break;
           case 'E': 
               return true;
           default:
               System.out.println("Invalid Entry");
               break;
       }
       return false;
    }
  
    private void moveShipUp() {
        System.out.println("Move ship up stubbed");
        
    }

    private void moveShipDown() {
       System.out.println("Move ship down stubbed");
    }

    private void moveShipLeft() {
        System.out.println("Move ship left stubbed");
        
    }

    private void moveShipRight() {
    System.out.println("Move ship right stubbed");   
    }
}
