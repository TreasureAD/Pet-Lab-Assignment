package pet;

public class Pet {

    public String name;



    // Constructor
    public Pet(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Speak method
    public String speak() {
        return "Pet is making noise";
    }
}


