public class UsingLinkedHashTable {
    static LinkedHashTables hash_table = new LinkedHashTables();
    public static void main(String[] args) {
        hash_table.add("isaiah");
        hash_table.add("buba");
        System.out.println(hash_table.get("isaiah"));
        hash_table.add("isaiah");
    }
}
