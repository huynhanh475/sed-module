package com.year3.sed.lecture9.iterator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        ArrayList<String> copyArray = new ArrayList<>();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            copyArray.add((String)iter.next());
        }

        Collections.sort(copyArray);
        System.out.println(copyArray);
    }

    public static void isThisGuyExist(NameRepository repo, String nameToFind) {
        boolean isExist = false;
        for(Iterator iter = repo.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            if ("Hoang".equals(name)) {
                isExist = true;
                break;
            }
        }

        if (isExist) {
            System.out.println(nameToFind + " is in the list");
        } else {
            System.out.println(nameToFind + " is NOT in the list");
        }
    }
}
