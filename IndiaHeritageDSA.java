import java.util.*;

public class IndiaHeritageDSA {

    // Linear Search
    static void linearSearch(String monuments[], String key){

        for(int i=0;i<monuments.length;i++){

            if(monuments[i].equalsIgnoreCase(key)){
                System.out.println(key+" Found at index "+i);
                return;
            }

        }

        System.out.println(key+" Not Found");

    }

    // Binary Search
    static int binarySearch(String arr[], String key){

        int low=0;
        int high=arr.length-1;

        while(low<=high){

            int mid=(low+high)/2;

            int result = arr[mid].compareToIgnoreCase(key);

            if(result==0)
                return mid;

            if(result<0)
                low=mid+1;

            else
                high=mid-1;
        }

        return -1;
    }

    // Bubble Sort
    static void bubbleSort(String arr[]){

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j].compareTo(arr[j+1])>0){

                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }

            }

        }

    }

    public static void main(String args[]){

        String monuments[]={
                "Taj Mahal",
                "Qutub Minar",
                "Hampi",
                "Red Fort",
                "Ajanta Caves"
        };

        System.out.println("Indian Heritage Monuments:");

        for(String m:monuments)
            System.out.println(m);

        System.out.println("\nSorting Monuments (Bubble Sort):");

        bubbleSort(monuments);

        for(String m:monuments)
            System.out.println(m);

        System.out.println("\nLinear Search for Taj Mahal:");
        linearSearch(monuments,"Taj Mahal");

        System.out.println("\nBinary Search for Hampi:");
        int pos=binarySearch(monuments,"Hampi");

        if(pos==-1)
            System.out.println("Not Found");
        else
            System.out.println("Found at index "+pos);

        // Stack Example (History Timeline)

        Stack<String> historyStack=new Stack<>();

        historyStack.push("Indus Valley Civilization");
        historyStack.push("Maurya Empire");
        historyStack.push("Mughal Empire");

        System.out.println("\nLatest Historical Era (Stack Pop): "+historyStack.pop());

        // Queue Example (Tourist Visits)

        Queue<String> touristQueue=new LinkedList<>();

        touristQueue.add("Tourist A");
        touristQueue.add("Tourist B");
        touristQueue.add("Tourist C");

        System.out.println("\nFirst Tourist Entered Monument: "+touristQueue.remove());

        // Hashing Example

        HashMap<String,String> monumentState=new HashMap<>();

        monumentState.put("Taj Mahal","Uttar Pradesh");
        monumentState.put("Hampi","Karnataka");
        monumentState.put("Ajanta Caves","Maharashtra");

        System.out.println("\nTaj Mahal is located in "+monumentState.get("Taj Mahal"));

        // Priority Queue (Most Popular Monuments)

        PriorityQueue<String> pq=new PriorityQueue<>();

        pq.add("Taj Mahal");
        pq.add("Hampi");
        pq.add("Red Fort");

        System.out.println("\nMost Popular Monument (Priority Queue): "+pq.peek());

    }
}