package com.company;


import java.util.Scanner;

public class Main {

        private static Scanner scanner = new Scanner(System.in);
        public static MobilePhone mobilePhone = new MobilePhone("0039 220 4402");


        public static void main(String[] args) {

                boolean quit = false;
                startPhone();
                printActions();

                while (!quit) {
                        System.out.println("\nenter action: (6 to show available actions)");
                        int action = scanner.nextInt();
                        scanner.nextLine();

                        switch(action){

                                case 0:
                                        System.out.println("shutting down...");
                                        quit = true;
                                        break;
                                case 1:
                                        mobilePhone.printContacts();
                                        break;
                                case 2:
                                        addNewContact();
                                        break;
                                case 3: updateContact();
                                        break;
                                case 4:
                                        removeContact();
                                        break;
                                case 5:
                                        queryContact();
                                        break;
                                case 6:
                                        printActions();
                                        break;







                        }
                }

        }

        public static void addNewContact(){
                System.out.println("enter the name of the contact: ");
                String name = scanner.nextLine();
                scanner.nextLine();
                System.out.println("enter the phone number");
                String phoneNumber = scanner.nextLine();
                scanner.nextLine();
                Contact newContact  = Contact.createContact(name,phoneNumber);
                if (mobilePhone.addNewContact(newContact)){
                        System.out.println("contact with name: " + name + " and phone:  " + phoneNumber  +  " has been added to the phone");
                }else{
                        System.out.println("cannot add, " + name + " it already exists");
                }

        }

        private static void updateContact(){
                System.out.println("Enter existing contact name to update: ");
                String name = scanner.nextLine();
                Contact existingContact =  mobilePhone.queryContact(name);
                if(existingContact == null){
                        System.out.println("contact does not exists");
                        return;
                }


                System.out.println("enter new contact name:  ");
                String newName = scanner.nextLine();
                System.out.println("enter new contact phone number");
                String newNumber = scanner.nextLine();

                Contact newContact =  Contact.createContact(newName,newNumber);



              if(mobilePhone.updateContact(existingContact,newContact)){
                      System.out.println("contact succesfully updated");
              }   else{
                      System.out.println("error: not updated!");
              }



                }

                public static void removeContact(){
                System.out.println("enter existing contact");
                String name = scanner.nextLine();
                Contact existingContact = mobilePhone.queryContact(name);
                if (existingContact == null){

                        System.out.println("contact does not exists");
                        return;

                }
                        mobilePhone.removeContact(existingContact);
                        System.out.println("contact with " + name +  " has been removed");
                }


        public static void queryContact() {
                System.out.println("enter existing contact");
                String name = scanner.nextLine();
                Contact existingContact = mobilePhone.queryContact(name);
                if (existingContact == null) {

                        System.out.println("contact does not exists");
                        return;

                }
                System.out.println("Name is : " + existingContact.getName() + "   " + existingContact.getPhoneNumber());



        }



        private static void startPhone(){
                System.out.println("phone is starting....");
        }

        private static void printActions(){
                System.out.println("\nAvailabble actions:\npress");
                System.out.println("0 - to shutdown\n" +
                                   "1 - to print contacts\n" +
                                   "2 - add new contacts\n" +
                                   "3 - update exisiting contact\n" +
                                   "4 - remove exisiting contact\n" +
                                   "5 - query if an exisitng contact exists\n" +
                                   "6 - to print list of contacts" );
                System.out.println("choose your actions: ");
        }






        }





