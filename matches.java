package Bynder;

import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class matches extends Person {
    
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Person> m1 = new ArrayList<>();

    public matches() {
        super();
        for (int j = 0; j < arr.length; j++){
            people.add(Person(name.get(j), age.get(j), hobbies1.get(j), hobbies2.get(j), movie.get(j), insideChar.get(j), mbti.get(j), island.get(j)));
        }
    }

    public void comparison() {
        int bestMatch = 0; // greatest number
        int counter = 0; // main counter
        int pos = 0;

        for (int i = 0; i < people.size(); i++) {
            for (int j = 1; j < people.size(); i++) {
                if (i != j) {
                    if ((people.get(i).getAge() == people.get(j).getAge()) || 
                    (people.get(i).getAge() == people.get(j).getAge() + 1) || 
                    (people.get(i).getAge() == people.get(j).getAge() - 1)) {
                        
                        if (people.get(i).getH1().compareTo(people.get(j).getH1())) {
                            counter++;
                        }

                        if (people.get(i).getH2().compareTo(people.get(j).getH2())) {
                            counter++;
                        }

                        if (people.get(i).getMov().compareTo(people.get(j).getMov())) {
                            counter++;
                        }

                        if (people.get(i).getIc().compareTo(people.get(j).getIc())) {
                            counter++;
                        }

                        if (people.get(i).getMb().compareTo(people.get(j).getMb())) {
                            counter++;
                        }

                        if (people.get(i).getIs().compareTo(people.get(j).getIs())) {
                            counter++;
                        }
                    }
                }

               if (counter > bestMatch) {
                   pos = j;
                   bestMatch = counter;
               }
               counter = 0;
            }
        }
        m1.add(people.get(j));
    }


    // for loop through ppl
        // compare ppl[i] and ppl[i+1];
            // if this +- 1 = next OR if this = next
                // if mbti = entp && mbti next.enfj --> +1 for counter
    //}


    // IDEA 2: 
    // same for loop
        // 2 counters, 1 position counter 
        // compare people[0] and people[1] and everytime it is equal, give +1 point
        // compare people[0] and people[2] and everytime it is equal, give +1 point
        // compare the first counter and second counter, and if the second counter is GREATER than the first counter, 
            // make the position counter equal to the higher counter --> continue for loop and at the end, return ppl.get(pos);

    
    // FIRST MATCH --> MOST LIKELY (BASED ON NUMBER OF SIMILAR ANSWERS)
    // SECOND MATCH --> MOST LIKELY (BASED ON OUR ALGORITHM)
    // THIRD MATCH --> LEAST LIKELY (BASED ON LEAST NUMBER OF SIMILAR ANSWERS)
    // FOURTH MATCH --> LEAST LIKELY (BASED ON OUR ALGORITHM)
}