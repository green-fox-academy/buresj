package gardenapp;

import java.util.ArrayList;
import java.util.List;

public class Garden extends Flora {

    List<Flora> florae;

    public Garden() {
        Flora treeone = new Flora("orange", "tree", 0);
        Flora treetwo = new Flora("purple", "tree", 0);

        Flora flowerone = new Flora("yellow", "flower", 0);
        Flora flowertwo = new Flora("blue", "flower", 0);

        this.florae = new ArrayList<>();
        this.florae = new ArrayList<>();

        florae.add(treeone);
        florae.add(treetwo);
        florae.add(flowerone);
        florae.add(flowertwo);
    }

    public void show() {
        System.out.println(florae);
    }

    public void watering(double water) {

        int needWater = 0;
        double deployWater;

        for (Flora flora : florae) {
            if (flora.needsWater = true) {
                needWater++;
            }
        }

        deployWater = water / needWater;

        for (Flora flora : florae) {

            if(flora.waterAmount > 20){
                flora.needsWater = false;
            }
            if (flora.needsWater) {
                flora.watering(deployWater);
            }
        }
    }
}
