package pet;

public class Pet implements Comparable<Pet> { // allows pets to be compared to one another

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "making noise";
    }

    // Comparable implementation to sort by name, and if names are equal, by class type
    @Override
    public int compareTo(Pet o) {
        int nameComparison = this.name.compareToIgnoreCase(o.name);
        if (nameComparison != 0) { // will return a negative if not the same name.
            return nameComparison; // negative = before, positive = after
        } else {
            return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName()); // if equal, same name - compare by class
        }
    }
}



