package com.example.mike.parrotlistapp;

import java.util.ArrayList;

public class ParrotList {
    private ArrayList<Parrot> list;

    public ParrotList(){
        list = new ArrayList<Parrot>();
        list.add(new Parrot(1,"Yellow Shouldered Parrot", "Amazona Barbavensis", "Green and Yellow"));
        list.add(new Parrot(2,"Grey Parrot", "Psittacus Eiithacus", "Grey"));
        list.add(new Parrot(3, "Blue and Yellow Macaw", "Ara Ararauna", "Blue and Yellow"));
        list.add(new Parrot(4,"Scarlet Macaw", "Ara Macao", "Red, Yellow and Blue"));
        list.add(new Parrot(5,"Yellow Headed Aamazon", "Amazona Oratrix", "Yellow, Green and Red"));
        list.add(new Parrot(6,"Yellow Eared Parrot", "Ognorhynchus Icterotis", "Green, Yellow and Red"));
        list.add(new Parrot(7,"Festive Amazon", "Amazona Festiva", "Green, Blue and Red"));
        list.add(new Parrot(8,"Chestnut Fronted Macaw", "Ara Severus", "Green, Brown, Blue and Red"));
        list.add(new Parrot(9,"Rosy Faced Love Bird", "Agapornus Roseicollis", "Green, Blue and Red"));
        list.add(new Parrot(10,"Shell Parakeet", "Melopsittacus Unduladus", "Blue, Black and White"));
    }

    public ArrayList<Parrot> getList() {
        return new ArrayList<Parrot>(list);
    }
}
