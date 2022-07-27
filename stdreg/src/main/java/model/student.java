package model;

import java.util.ArrayList;
import java.util.List;

public class student {

    String name;
    int id;
    double CGP;

    public student(String name, int id, double CGP) {
        this.name = name;
        this.id = id;
        this.CGP = CGP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCGP() {
        return CGP;
    }

    public void setCGP(double CGP) {
        this.CGP = CGP;
    }
}
