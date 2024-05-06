public class NodeHashTable {
    private static Node[] node;
    private static int arr_size = 0;
    
    public NodeHashTable(int size){
        node = new Node[size];
        arr_size = size;

    }

    private static int hashFunc(String key) {
        int hashVal = 0;
        char[] temp = key.toCharArray();
        for (int j = 0; j < temp.length; j++) {
            int letter = temp[j];
            hashVal = (hashVal * 32 + letter) % arr_size;
        }
        return hashVal;
    }

    public void add(String key){

        int index = hashFunc(key);
        boolean add = false;
        if (node[index] == null){
            node[index] = new Node(key);
            add = true;
        }

        else {
            int i = 0;
            
            while (node[index] != null && i < 2 && index < arr_size - 1){
                i++;
                if (node[index] != null){
                    if (node[index].data.equals(key)){
                        System.out.println("key already in hash");
                        add = true;
                        break;
                    }
                }
                index++;
                if (node[index] == null){
                    node[index] = new Node(key);
                    add = true;
                    break;
                }
            }
        }
        if (add == false){
            System.out.println("no space");
        }
    }

    public String get(String key){
        int index = hashFunc(key);
        if (node[index] != null){
            if(node[index].data.equals(key)){
                return node[index].data;
            }
            else {
                int i = 0;
                while (i < 2 && index + i < arr_size - 1) {
                    i++;
                    if (node[index + i] != null){
                        if (node[index + i].data.equals(key)) {
                            return node[index + i].data;
                        }
                    }
                }
            }
        }
        System.out.println("not in hash");
        return null;
    }
}
