package edu.parinya.softarchdesign.structural;

import edu.parinya.softarchdesign.structural.HealthcareServiceable;
import edu.parinya.softarchdesign.structural.HealthcareWorker;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class HealthcareWorkerTeam  implements HealthcareServiceable {

    protected List<HealthcareServiceable> members = new ArrayList<>();
    public HealthcareWorkerTeam() {
        this.members =  new ArrayList<>();
    }

    public void addMember(HealthcareServiceable component){
        this.members.add(component);
    }

    public void removeMember(HealthcareServiceable  component){
        this.members.remove(component);
    }

    @Override
    public void service() {
        for ( int i = 0; i<this.members.size();i++){
            this.members.get(i).service();
        }
    }

    @Override
    public double getPrice() {
        int price = 0;
        for ( int i = 0; i<this.members.size();i++){
            price+= this.members.get(i).getPrice();
        }
        return price;
    }


}
