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
        if(!entries.isEmpty()){
            System.out.println("Afisam numele si varsta persoanelor: " + entries);
        }else{
            System.out.println("Lista este goala");
        }

        //2.3 extract the persons that are older than a given age
        int ageOlder = 20;
        List<Persons> personsListOlder = new ArrayList<>();
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).age() > ageOlder) {
                    personsListOlder.add(i, list.get(i));
                }
            }
            System.out.println(String.format("Lista persoanelor cu varsta mai mare de %d este: ", ageOlder) + personsListOlder);

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