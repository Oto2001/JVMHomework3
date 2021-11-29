import java.util.*;

public class RandomCollection {
    public static void randomCollection() {
        // Task 3
        Random rand = new Random();
        int randomInt = rand.nextInt(3);

        // Task 4
        HashMap<Integer, CollectionNames> collectionsMap = new HashMap<>();
        collectionsMap.put(0, CollectionNames.LIST);
        collectionsMap.put(1, CollectionNames.MAP);
        collectionsMap.put(2, CollectionNames.SET);

        // Task 5
        CollectionNames collection = CollectionNames.valueOf(collectionsMap.get(randomInt).toString());
        System.out.println(collection.getCollectionName());
        System.out.println();

        // Task 6, 7
        switch (collection) {
            case LIST:
                ArrayList<Integer> fiboNumbers = new ArrayList<>();
                fiboNumbers.add(1);
                fiboNumbers.add(1);
                fiboNumbers.add(2);
                fiboNumbers.add(3);
                fiboNumbers.add(5);
                fiboNumbers.add(8);
                fiboNumbers.add(13);
                fiboNumbers.add(21);

                for (Integer fiboNumber: fiboNumbers) {
                    System.out.println(fiboNumber);
                }
                break;
            case MAP:
                HashMap<Integer, String> strNumbers = new HashMap<>();
                strNumbers.put(1, "One");
                strNumbers.put(2, "Two");
                strNumbers.put(3, "Three");
                strNumbers.put(4, "Four");
                strNumbers.put(5, "Five");

                for (Map.Entry entry : strNumbers.entrySet()) {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }
                break;
            case SET:
                HashSet<String> continents = new HashSet<>();
                continents.add("Europe");
                continents.add("Asia");
                continents.add("North America");
                continents.add("South America");
                continents.add("Australia");
                continents.add("Africa");
                continents.add("Antarctica");

                for (String continent: continents) {
                    System.out.println(continent);
                }
        }
    }
}
