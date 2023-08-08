package Arrays;

import java.util.Arrays;

public class ArraysExercise {

    private static String[] addToPeople(String[] people, String nameToAdd) {
        String[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[newArray.length - 1] = nameToAdd;
        return newArray;
    }
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] people ={
                "timothy",
                "bella",
                "talee",
                "tiff"
        };

        System.out.println(Arrays.toString(people));

        String[] peopleCopy = addToPeople(people, "perry");
        System.out.println(Arrays.toString(peopleCopy));


    }
}
