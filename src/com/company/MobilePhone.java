package com.company;

import java.util.ArrayList;

import static com.company.Main.mobilePhone;

public class MobilePhone {
    private String number;

    private ArrayList<Contact> myContacts ;

    public MobilePhone(String number) {
        this.number = number;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0 ){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;


    }
    public boolean updateContact(Contact oldContact,Contact newContact){
        int foundPosition = findContact(oldContact);
        if (foundPosition <0){
            System.out.println(oldContact.getName() + "does not exists");
            return false;
        }
        myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName() + " has been updated to " + newContact.getName());
        return true;


    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if (foundPosition <0){
            System.out.println(contact.getName() +" doesn't exists");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println( "contact with name "   + contact.getName() + " has been removed");

        return true;

    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i=0;i<this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i;
            }

            }
        return -1;
        }
    public String queryContact(Contact contact){
        if(findContact(contact) >=0){
            return contact.getName();
        }

        return null;



    }
    public Contact queryContact(String name){
        int foundPosition = findContact(name);

        if (foundPosition >=0){
           return this.myContacts.get(foundPosition);
                }
        return null;
        }







    public void printContacts(){
        System.out.println("Contact List\n");

        for (int i=0; i<this.myContacts.size();i++){
            System.out.println((i+1) +"."+

            this.myContacts.get(i).getName()+ "-->" + this.myContacts.get(i).getPhoneNumber());



        }
    }


}








