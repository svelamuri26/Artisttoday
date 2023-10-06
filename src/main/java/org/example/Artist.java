package org.example;

class Artist {
    private String firstName;
    private String lastName;
    private String Album;


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

