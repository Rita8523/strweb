package SchoolBag.BagPack;
import SchoolBag.setWeight;
import SchoolBag.Object.*;
import java.util.*;

public class BagPack implements setWeight {

    private List<ProductObject> stationeryCollection;
    private double totalWeight; 

    public BagPack() {
        stationeryCollection = new ArrayList<ProductObject>();
        totalWeight = 0.0; 
    }

    public void addStationery(ProductObject obj) {
        stationeryCollection.add(obj);
        updateTotalWeight(); 
    }

    public void printBackpackContents() {
        int i = 1;
        Iterator<ProductObject> it = stationeryCollection.iterator();
        System.out.println("=============================================");
        while (it.hasNext()) {
            System.out.println(i + ") " + it.next().toString());
            i++;
        }
        System.out.println();
        System.out.println("Общий вес рюкзака: " + totalWeight + " кг");
        System.out.println("=============================================");
    }

    private void updateTotalWeight() {
        totalWeight = 0.0; 
        for (ProductObject obj : stationeryCollection) {
            totalWeight += obj.getTotalWeight(); 
        }
    }

    @Override
    public double countTotalWeight() {
        return totalWeight; 
}}
