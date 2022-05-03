/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrafficCards;

import java.util.*;
/**
 *
 * @author kamaj
 */
public class UsingJCAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<TrafficCard> cardUsers = new ArrayList<TrafficCard>();
        RandomString rString = new RandomString(10);
        float genBalance;
        TrafficCard myCard;
        Random r = new Random();
        int i;
        for (i = 0; i < 10; i++) {
            genBalance = ((float) r.nextInt(1000) / 10);
            myCard = new TrafficCard(r.nextInt(100), rString.nextString(), genBalance);
            cardUsers.add(myCard);
        }
        
        Iterator itr = cardUsers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Sorted based on balance:");
        TrafficCardBalanceComparator balanceComparator = new TrafficCardBalanceComparator();
        Collections.sort(cardUsers, balanceComparator);
        Iterator<TrafficCard> sortedItr = cardUsers.iterator();
        while (sortedItr.hasNext()) {
            System.out.println(sortedItr.next());
        }
        System.out.println("Sorted based on Number:");
        TrafficCardTravellerComparator travellerComparator = new TrafficCardTravellerComparator();
        Collections.sort(cardUsers, travellerComparator);
        Iterator<TrafficCard> sortedItr1 = cardUsers.iterator();
        while (sortedItr1.hasNext()) {
            System.out.println(sortedItr1.next());
        }
    }
    
}
