public class UsingNodeHashTable {
    public static void main(String[] args) {
        NodeHashTable hash = new NodeHashTable(50);
        hash.add("isaiah");
        hash.add("hash");
        hash.add("beans");
        
        hash.add("beans");
    
        System.out.println(hash.get("isaiah"));
        System.out.println(hash.get("math"));
        System.out.println(hash.get("beans"));
    }
}
