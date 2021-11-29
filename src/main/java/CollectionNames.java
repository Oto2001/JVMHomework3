// Task 1, 2
public enum CollectionNames {
    LIST("ArrayList"){
        public String toString() {
            return "LIST";
        }
    },
    MAP("HashMap"){
        public String toString() {
            return "MAP";
        }
    },
    SET("HashSet"){
        public String toString() {
            return "SET";
        }
    };

    private String collectionName;

    private CollectionNames(String collectionName) {
        this.collectionName = collectionName;
    }

    public abstract String toString();

    public String getCollectionName() {
        return collectionName;
    }
}
