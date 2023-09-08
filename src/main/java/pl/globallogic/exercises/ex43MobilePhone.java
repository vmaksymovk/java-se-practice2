package pl.globallogic.exercises;

import java.util.ArrayList;

    public class ex43MobilePhone {
        private String myNumber;
        private ArrayList<ex43Contact> myContacts;

        public ex43MobilePhone(String myNumber) {
            this.myNumber = myNumber;
            this.myContacts = new ArrayList<>();
        }

        public boolean addNewContact(ex43Contact contact) {
            if (findContact(contact) == -1) {
                myContacts.add(contact);
                return true;
            }
            return false;
        }

        public boolean updateContact(ex43Contact oldContact, ex43Contact newContact) {
            int position = findContact(oldContact);
            if (position >= 0) {
                myContacts.set(position, newContact);
                return true;
            }
            return false;
        }

        public boolean removeContact(ex43Contact contact) {
            int position = findContact(contact);
            if (position >= 0) {
                myContacts.remove(position);
                return true;
            }
            return false;
        }

        public int findContact(ex43Contact contact) {
            return myContacts.indexOf(contact);
        }

        public int findContact(String name) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (myContacts.get(i).getName().equals(name)) {
                    return i;
                }
            }
            return -1;
        }

        public ex43Contact queryContact(String name) {
            int position = findContact(name);
            if (position >= 0) {
                return myContacts.get(position);
            }
            return null;
        }

        public void printContacts() {
            System.out.println("Contact List:");
            for (int i = 0; i < myContacts.size(); i++) {
                System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
            }
        }
    }


