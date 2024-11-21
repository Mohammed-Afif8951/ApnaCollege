package HashMap;

import java.util.HashMap;

public class Find_Itinerary_for_Tickets {

    public static String getStart(HashMap<String,String> tickets){
        //creating a revMap
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }

        //finding start
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    
    public static void find_Itinerary_for_Tickets(HashMap<String,String> ticket){
        String start = getStart(ticket);
        System.out.print(start);
        for(String key : ticket.keySet()){
            System.out.print(" -> "+ticket.get(start));
            start = ticket.get(start);
        }
    
    }
    public static void main(String args[]){
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        find_Itinerary_for_Tickets(tickets);
    }
}
