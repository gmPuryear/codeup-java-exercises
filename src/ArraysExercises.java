import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers.toString());
//        TODO Array Basics:
//       ----------- Creating 3 new Person objects -----------
        Person person1 = new Person("Jo"); // New
        Person person2 = new Person("Harry");
        Person person3 = new Person("Sally");
//        ----------- Creating new array with the Person objects -----------
        Person[] namesArr = {person1, person2, person3};
//        ----------- print function printing the namesArr -----------
        printFx(namesArr);
//        ----------- Making new Person object -----------
        Person personToAdd = new Person("fred");
//        ----------- Calling addPerson FX and then using printFX to print the return value -----------
        printFx(addPerson(namesArr, personToAdd));




//

        }

//        ----------- Print function to print arrays -----------
        public static void printFx(Person[] array) {
        for (Person element : array) {
            System.out.println(element.getName());
        }
    }

//    ----------- Function to create new array then input old array in new then add one more name -----------
    public static Person[] addPerson(Person[] namesArray, Person personToAdd) {
        int newPersonArrayLength = namesArray.length;
        // Declares new array
        Person[] newPersonArray;
        // Makes new array with the appropriate length needed to add one element which is namesArray length + 1
        newPersonArray = new Person[newPersonArrayLength + 1];
        for (int i = 0; i < namesArray.length; i++) {
            newPersonArray[i] = namesArray[i];
            newPersonArray[newPersonArray.length - 1] = personToAdd;
        }
        return newPersonArray;
    }


        //---------------------------------------------------- Examples -------------------------------------------------------
//        String[] names; // Arrays are a special kind of object that contain elements
//        names = new String[5]; // array object with length of 5 that holds strings
//        final int NUMBER_OF_BEATLES = 4;
//        BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES]; // each element in the "theBeatles" array is of type BandMember
//        int numberOfBugs = (int) Math.floor(Math.random() * 100);


//        String[] languages2 = {"html", "css", "javascript", "java"}; // "Enhanced for loop" which is similar to forEach loop and is good when we want to do something
//        to every element in array
//        for (String language : languages2) { "language" is just the name of EACH element that is being iterated over and "languages2" is
//                the name of the array that was originally given to it
//            System.out.println(language);
//        }

//        ------------------------ Array Class Methods ------------------------
//        void Arrays.fill(arrayName, value);       Fills all elements of the specified array with the specified value.
//        boolean Arrays.equals(arrayName, value);  Returns true if both arrays are of the same type and all of the elements and if all values are the same
//        String Arrays.toString(array);    returns a copy of the given array with the specified value
//        void Arrays.sort(array); Sorts the elements of an array



}
