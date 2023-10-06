package org.example;

import java.util.ArrayList;
import java.util.List;

    class Artist {
        private String firstName;
        private String lastName;

        public Artist(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }

        public String toCSVString() {
            return firstName + "," + lastName;
        }
    }

