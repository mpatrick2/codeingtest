package org.coding.challenge.dataObject;

public class SpecialtyIdObject {
    int id;
    String specialty;

    public SpecialtyIdObject() {
    }

    public SpecialtyIdObject(int id, String specialty) {
        this.id = id;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
