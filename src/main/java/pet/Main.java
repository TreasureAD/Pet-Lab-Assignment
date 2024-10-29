package pet;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in); // creating an instance of scanner

                System.out.println("how many pets do you have?");
                int numOfPets = scanner.nextInt();// storing number of pets from user input
                scanner.nextLine();// skips over bug in scanner

                System.out.println("What are the types of pets you have?");
                String[] typesOfPets = scanner.nextLine().split(" ");// storing type of pets from user input

                System.out.println("What are each of their names?");
                String[] namesOfPets = scanner.nextLine().split(" ");// storing name of pets from user input

                Pet[] pets = new Pet[numOfPets]; //create an array of pet objects

                for(int i = 0; i < numOfPets; i++){ // loop through all pets by number of pets
                    switch (typesOfPets[i].toLowerCase()){// switch grabs the pet type at index i
                        case "dog": // if petType == dog

                            pets[i] = new Dog(namesOfPets[i]); //create a new dog object and stores it by the name

                            break;
                        case "cat":// if petType == cat

                            pets[i] = new Cat(namesOfPets[i]);//create a new cat object and stores it by the name

                            break;
                        case "bird":// if petType == bird
                            pets[i] = new Bird(namesOfPets[i]);//create a new bird object and stores it by the name
                            break;

                        default: //if not cat, dog, or bird
                            pets[i] = new Pet(namesOfPets[i]); // create a new pet object
                            break;
                    }
                }
                System.out.println("Sorted by name: ");
                Arrays.sort(pets);
                for(Pet pet : pets){// loop through the pets array
                    System.out.println(pet.getName() + " is " + pet.speak());// for each pet print the name and sound
                }

                 System.out.println(" ");

                 System.out.println("Sorted by type");
                 TypeComparator typeComparator = new TypeComparator();
                 Arrays.sort(pets, typeComparator);

                for(Pet pet : pets){// loop through the pets array
                    System.out.println(pet.getName() + " is " + pet.speak());// for each pet print the name and sound
                }

            }
        }



