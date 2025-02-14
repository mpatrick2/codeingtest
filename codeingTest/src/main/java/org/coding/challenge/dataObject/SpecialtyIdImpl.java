package org.coding.challenge.dataObject;

import java.util.ArrayList;
import java.util.List;

public class SpecialtyIdImpl {
    List<SpecialtyIdObject> specialtyIdObjectList = new ArrayList<>();
    public SpecialtyIdImpl() {
    }

    public void AddSpecialtyAndId(SpecialtyIdObject specialtyIdObject){
        specialtyIdObjectList.add(specialtyIdObject);
    }

    public List<String> ReturnSpecialties(List<Object> ids) {
        List<String> specialtyList = new ArrayList<String>();
        Integer id = null;

        for (Object idElement: ids) {
            if (idElement instanceof Integer)
                id = (Integer) idElement;
            else if ( idElement instanceof String) {
                id = Integer.parseInt(((String) idElement));
            }
            for(SpecialtyIdObject element: specialtyIdObjectList) {
                if (element.id == id)
                    specialtyList.add(element.getSpecialty());
            }
        }
        return specialtyList;
    }
}
