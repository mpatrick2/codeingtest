package org.coding.challenge.dataObject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpecialtyIdImplTest {

    @Test
    void addSpecialtyAndId() {

    }

    @Test
    void returnSpecialties_valid_2() {
        SpecialtyIdImpl specialtyIdImpl = new SpecialtyIdImpl();
        List<Object> specialtyIdLst = new ArrayList<Object>();
        specialtyIdLst.add(7623);
        specialtyIdLst.add(8235);
        int expected = 2;

        // load specialties
        for (SpecialtyIdObject  element : getSpecialtyList()) {
            specialtyIdImpl.AddSpecialtyAndId(element);
        }
        List<String> specialties = specialtyIdImpl.ReturnSpecialties(specialtyIdLst);
        Iterator iterator = specialties.iterator();
        assertEquals("security", iterator.next().toString());
        assertEquals("data engineering", iterator.next().toString());

        assertEquals(expected, specialties.size());
    }
    @Test
    void returnSpecialties_invalid() {
        SpecialtyIdImpl specialtyIdImpl = new SpecialtyIdImpl();
        List<Object> specialtyIdLst = new ArrayList<Object>();
        specialtyIdLst.add(76231);
        specialtyIdLst.add(8235);
        int expected = 1;

        // load specialties
        for (SpecialtyIdObject  element : getSpecialtyList()) {
            specialtyIdImpl.AddSpecialtyAndId(element);
        }
        List<String> specialties = specialtyIdImpl.ReturnSpecialties(specialtyIdLst);
        Iterator iterator = specialties.iterator();
        assertEquals(expected, specialties.size());
        assertEquals("data engineering", iterator.next().toString());
    }

    private List<SpecialtyIdObject> getSpecialtyList() {
        List <SpecialtyIdObject> specialtyIdObjects = new ArrayList<>();
        specialtyIdObjects.add(new SpecialtyIdObject(1381, "front-end web development"));
        specialtyIdObjects.add(new SpecialtyIdObject(8235, "data engineering"));
        specialtyIdObjects.add(new SpecialtyIdObject(3434, "API design"));
        specialtyIdObjects.add(new SpecialtyIdObject(7623, "security"));
        specialtyIdObjects.add(new SpecialtyIdObject(9153, "UX"));
        return specialtyIdObjects;
    }
}