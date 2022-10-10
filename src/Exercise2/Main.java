package Exercise2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //2 Lista de persoane Person

        List<Persons> list = new ArrayList<>();

        list.add(0, new Persons("Mihai", 34, "saten"));
        list.add(1, new Persons("Irina", 44, "blond"));
        list.add(2, new Persons("Ioana", 28, "negru"));
        list.add(3, new Persons("Andreea", 25, "saten"));
        list.add(4, new Persons("Mihaela", 44, "blond"));

        if (list.isEmpty()) {
            System.out.println("Lista de persoane este goala");
        } else {
            System.out.println("Lista de persoane:" + list);
        }


        //2.1 afisez lista cu numele persoanelor

        List<String> persons = new ArrayList<>();
        if (list.isEmpty()) {
            System.out.println("lista este goala");
        } else {
            for (int i = 0; i < list.size(); i++) {
                persons.add(i, list.get(i).name());
            }
            System.out.println("Lista cu numele persoanelor este " + persons);
        }


        //2.2 creez un map cu numele si varsta persoanelor
        Map<String, Integer> mapNameAge = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            mapNameAge.put(list.get(i).name(), list.get(i).age());
        }
        Set<Map.Entry<String, Integer>> entries = mapNameAge.entrySet();
        System.out.println("Afisam numele si varsta persoanelor");
        if (!entries.isEmpty()) {
            for (Map.Entry<String, Integer> entry : entries) {
                System.out.println(String.format("%s are %d ani", entry.getKey(), entry.getValue()));
            }
        } else {
            System.out.println("Lista este goala");
        }


        //2.3 extract the persons that are older than a given age
        int ageOlder = 44;
        if (!list.isEmpty() && ageOlder > 0) {
            for (Persons pers : list) {
                if (pers.age() > ageOlder) {
                    System.out.println(pers.name() + " " + pers.age());
                } else {
                    System.out.println(String.format("Nu avem persoane cu varsta mai mare de %d ", ageOlder));
                }
            }
        } else {
            System.out.println("Lista persoanelor este goala");
        }

        //2.4 extract a map from person's hair colour to their name (String->List<String>)
        Map<String, List<String>> mapColourHair = new HashMap<>();
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                String colour = list.get(i).hairColour();
                if (!mapColourHair.containsKey(colour)) {
                    mapColourHair.put(colour, new ArrayList<>());
                }
                mapColourHair.get(colour).add(list.get(i).name());
            }
            System.out.println(mapColourHair);
        } else {
            System.out.println("Lista este goala");
        }


        //2.5 create a map from age to list of persons
        Map<Integer, List<Persons>> mapAgeOfPersons = new HashMap<>();
        for (int i = 1; i < list.size(); i++) {
            Integer age = list.get(i).age();
            if (!mapAgeOfPersons.containsKey(age)) {
                mapAgeOfPersons.put(age, new ArrayList<Persons>());
            }
            mapAgeOfPersons.get(age).add(list.get(i));
        }
        System.out.println("Lista de persoane pe varsta " + mapAgeOfPersons);
    }

}