
import CIT260.CityOfAaron.model.Animal;
import CIT260.CityOfAaron.model.Condition;
import CIT260.CityOfAaron.model.InventoryItem;
import CIT260.CityOfAaron.model.ItemType;
import CIT260.CityOfAaron.model.Provision;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1
 */
public class CityOfAaronProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InventoryItem item = new InventoryItem();
        item.setName("Hammer");
        item.setQuantity(10);
        item.setCondition(Condition.Good);
        item.setItemType(ItemType.Tool);
        
        Animal animal = new Animal();
        animal.setName("Horse");
        animal.setAge(5);
        
        Provision provision = new Provision();
        provision.setName("Wheat");
        provision.setPerishable(true);
        
        System.out.println(item);
        System.out.println(animal);
        System.out.println(provision);
        
    }
    
}
