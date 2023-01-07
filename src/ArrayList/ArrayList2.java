package ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sreekanth");
        arrayList.add("Sagar");
        arrayList.add("Shyam");
        arrayList.add("Ram");
        System.out.println(arrayList);


        char[] arr = new char[]{'a', 'e', 'i', 'o', 'u', 'b', 'z'};
        ArrayList2.checkCharacter(arrayList,arr);

    }

    public static void checkCharacter(ArrayList<String> arrayList, char[] arr ) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            char[] ch = arrayList.get(i).toCharArray();
            for (int j = 0; j < arr.length; j++) {
                if (ch[i] == arr[j]) {
                    System.out.println("is present");
                } else {
                    System.out.println("is not present");
                }
                count++;
            }
        }
        System.out.println("The character of the given list of Strings are:" + count);
    }
}


