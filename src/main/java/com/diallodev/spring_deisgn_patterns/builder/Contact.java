package com.diallodev.spring_deisgn_patterns.builder;

public class Contact {

    private final String firstName;
    private final String lastName;
    private final String emailAddress;


    private Contact(String firstName, String lastName, String emailAddress) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static ContactBuilder builder() {
        return new ContactBuilder();
    }

    public static class ContactBuilder {
        private String firstName;
        private String lastName;
        private String emailAddress;

        public ContactBuilder() {
            super();
        }



        public ContactBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ContactBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ContactBuilder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Contact build() {
            return new Contact(this.firstName, this.lastName, this.emailAddress);
        }
    }
}
