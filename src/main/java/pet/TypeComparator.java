package pet;

import java.util.Comparator;

public class TypeComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2) { // compares pet1 to pet2
        // First compare by class type
        int typeComparison = pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());
        if (typeComparison != 0) { // if class types are different
            return typeComparison;
        }
        // compare by name if types are the same
        return pet1.getName().compareTo(pet2.getName());
    }
}

