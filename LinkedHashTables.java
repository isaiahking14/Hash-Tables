public class LinkedHashTables{
    private static SingleListNode[] hash_table = new SingleListNode[10];
    private static final int ARR_SIZE = hash_table.length;
    
    public LinkedHashTables(){

    }

    private static int hashFunc(String key) {
        int hashVal = 0;
        char[] temp = key.toCharArray();
        
        for (int j = 0; j < temp.length; j++) {
            int letter = temp[j];
            hashVal = (hashVal * 32 + letter) % ARR_SIZE;
        }
        return hashVal;
    }

    public void add(String key){
        int index = hashFunc(key);

        if (hash_table[index] == null){
            hash_table[index] = new SingleListNode(key);
        } 
        
        else {
            SingleListNode front = hash_table[index];
            boolean duplicate_catcher = false;
            while(front.next != null){
                if (front.data.equals(key)){
                    duplicate_catcher = true;
                    break;
                }
                front = front.next;
            }
            if (duplicate_catcher = false){
                front.next = new SingleListNode(key);
            } 
            else {
                System.out.println("key already exists in hash");
            }
            
        }
        
    }

    public String get(String key){
        int index = hashFunc(key);
        if (hash_table[index] != null){
            if (hash_table[index].data.equals(key)){
                return hash_table[index].data;
            }else {
                SingleListNode front = hash_table[index];
                front = front.next;
                while (front.next != null){
                    if(front.data.equals(key)){
                        return front.data;
                    }
                    front = front.next;
                }
                return null;
            }
        } 
        else {
            return null;
        }
    }



}