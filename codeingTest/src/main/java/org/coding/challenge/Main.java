package org.coding.challenge;


import org.coding.challenge.dataObject.SpecialtyIdImpl;
import org.coding.challenge.dataObject.SpecialtyIdObject;
import org.coding.challenge.utilities.CleanUpId;
import org.coding.challenge.utilities.Duplicates;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CleanUpId cleanUpId = new CleanUpId();
        Duplicates duplicates = new Duplicates();
        SpecialtyIdImpl specialtyIdImpl = new SpecialtyIdImpl();
        List<Object> cleanIdList = new ArrayList<>();

        for (String element: args) {
             String returnValue = cleanUpId.cleanId(element);
             if (returnValue != null)
               cleanIdList.add(returnValue);
        }
        List<Object> dedupedList = duplicates.removeDuplicates(cleanIdList);
        // load specialties, it was not specified how they would be searched
        for (SpecialtyIdObject element : loadSpecialtyList()) {
            specialtyIdImpl.AddSpecialtyAndId(element);
        }
        List<String> specialtyList = specialtyIdImpl.ReturnSpecialties(dedupedList);
        for (String speciality: specialtyList) {
            System.out.println(speciality);
        }

    }

    public static List<SpecialtyIdObject> loadSpecialtyList() {
        List <SpecialtyIdObject> specialtyIdObjects = new ArrayList<>();
        specialtyIdObjects.add(new SpecialtyIdObject(1381, "front-end web development"));
        specialtyIdObjects.add(new SpecialtyIdObject(8235, "data engineering"));
        specialtyIdObjects.add(new SpecialtyIdObject(3434, "API design"));
        specialtyIdObjects.add(new SpecialtyIdObject(7623, "security"));
        specialtyIdObjects.add(new SpecialtyIdObject(9153, "UX"));
        return specialtyIdObjects;
    }

}