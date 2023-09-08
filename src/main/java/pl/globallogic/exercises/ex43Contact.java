package pl.globallogic.exercises;

public class ex43Contact {

        private String name;
        private String phoneNumber;

        public ex43Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public static ex43Contact createContact(String name, String phoneNumber) {
            return new ex43Contact(name, phoneNumber);
        }


}
