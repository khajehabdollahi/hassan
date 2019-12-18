package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    Scanner scanner = new Scanner(System.in);
    FamilyList familyList=new FamilyList();
    About about=new About();


    public void start(){

        int choice;

        do {

            System.out.print("\nWelcome! What do you want to do?\n" +
                    "\n" +
                    "1: Add Adult\n" +
                    "2: Add Kid\n" +
                    "3: Remove Adult\n" +
                    "4: Remove Kid\n" +
                    "5: Show all Adults\n" +
                    "6: Show all Kids\n" +
                    "7: Help\n" +
                    "8: About\n" +
                    "9: Exit\n" +
                    "Your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    addAdult();
                    break;
                case 2:
                    addKid();
                    break;
                case 3:
                    removeAdult();
                    break;
                case 4:
                    removeKids();
                    break;
                case 5:
                    showAllAdults();
                    break;
                case 6:
                    showAllKid();
                    break;
                case 7:
                    System.out.println("Hi welcome to help! How can I help you_");
                    break;
                case 8:
                    about.showAbout();
            }

        } while (choice!=9);

    } // End of start method.

    public void addAdult() {
        try {
            System.out.println("Please enter name:");
            String name = scanner.nextLine();
            System.out.println("Please enter family name:");
            String familyName = scanner.nextLine();
            System.out.println("Please enter age:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Please enter weight:");
            double weight = Double.parseDouble(scanner.nextLine());


            familyList.adults.add(new Adult(name,familyName,age,weight));
            familyList.saveAdult();
            System.out.println();
        }
        catch (Exception e){
            System.out.println("There is something wrong");
        }

    }
    public void addKid(){
        System.out.println("Please enter name:");
        String name = scanner.nextLine();
        System.out.println("Please enter family name:");
        String familyName = scanner.nextLine();
        System.out.println("Please enter age:");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Please enter weight:");
        double weight=Double.parseDouble(scanner.nextLine());

        familyList.kids.add(new Kid(name,familyName,age,weight));
        familyList.saveKidslist();
        System.out.println();
    }

    public void showAllAdults(){

        for(Adult adult:familyList.adults){
            System.out.println(adult);
        }

    }
    public void showAllKid(){
        for(Kid kid:familyList.kids){
            System.out.println(kid);
        }
    }

    public void removeAdult(){
        System.out.println("Please enter the name of the person you want to delete");
        String deletedName=scanner.nextLine();
        for(Adult adult:familyList.adults){
            if(deletedName.equals(adult.getName())){
                familyList.adults.remove(adult);
                System.out.println(deletedName +"is deleted now");
                break;
            }
        }

    }

    public void removeKids(){
        System.out.println("Please enter the name of the person you want to delete");
        String deletedName=scanner.nextLine();
        for(Kid kids:familyList.kids){
            if(deletedName.equals(kids.getName())){
                familyList.kids.remove(kids);
                System.out.println(deletedName +"is deleted now");
                break;
            }
        }

    }




}
