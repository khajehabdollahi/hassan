package com.company;

import java.util.ArrayList;

public class FamilyList {
    ArrayList<Adult>adults=new ArrayList<>();
    ArrayList<Kid>kids=new ArrayList<>();



    public void saveKidslist(){

    FileUtility.saveObject("KidsList.ser",kids);
    }
    public void saveAdult(){
        FileUtility.saveObject("Adaults.ser",adults);
    }


}
