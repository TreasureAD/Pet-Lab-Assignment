package pet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //---------------------PART ONE-------------------------------------------
//        System.out.println("How many pets do you have?");
//        Scanner scanner = new Scanner(System.in);
//        int numOfPets = scanner.nextInt();
//
//        String[] petTypes = new String[numOfPets];
//        String[] petNames = new String[numOfPets];
//
//        // Start the loop from 0 and go until i < numOfPets
//        for (int i = 0; i < numOfPets; i++) {
//            System.out.println("What type of pet is pet " + (i + 1) + "?");
//            petTypes[i] = scanner.next();
//
//            System.out.println("Enter pet " + (i + 1) + "'s name");
//            petNames[i] = scanner.next();
//        }
//
//
//        System.out.println("Pet counter: " + numOfPets);
//        for (int x = 0; x < numOfPets; x++) {
//            System.out.println(petNames[x] + ": " + petTypes[x]);
//        }

        //---------------------PART TWO-------------------------------------------
        // SIDE NOTE - Ethan and I worked on this together since we were both having trouble, so we have the same solution.


                Scanner scanner = new Scanner(System.in); // creating an instance of scanner

                System.out.println("how many pets do you have?"); // prompting the user the number of pets
                int numOfPets = scanner.nextInt();// storing number of pets from user input
                scanner.nextLine();// skips over bug in scanner

                System.out.println("What are the types of pets you have?");//prompting the user type of pets
                String[] typesOfPets = scanner.nextLine().split(" ");// storing type of pets from user input

                System.out.println("What are each of their names?");// prompting the user the name of pets
                String[] namesOfPets = scanner.nextLine().split(" ");// storing name of pets from user input

                Pet[] pets = new Pet[numOfPets]; //create an array of pet objects

                for(int i = 0; i < numOfPets; i++){ // loop through all pets by number of pets
                    switch (typesOfPets[i].toLowerCase()){// if/switch grabs the pet type at index i
                        case "dog": // if petType == dog

                            pets[i] = new Dog(namesOfPets[i]); //create a new dog object and stores it by the name

                            break;
                        case "cat":// if petType == cat

                            pets[i] = new Cat(namesOfPets[i]);//create a new cat object and stores it by the name

                            break;
                        case "bird":// if petType == bird
                            pets[i] = new Bird(namesOfPets[i]);//create a new bird object and stores it by the name
                            break;
                    }
                }
                for(Pet pet : pets){// loop through the pets array
                    System.out.println(pet.getName() + " Says " + pet.speak());// for each pet print the name and sound
                }
            }
        }



