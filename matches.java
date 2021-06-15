import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Matches extends ReadURL {
    
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Person> b1 = new ArrayList<>();
    ArrayList<Person> w1 = new ArrayList<>();


    public Matches() throws Exception{
        for (int j = 0; j < name.size(); j++){
            people.add(new Person(name.get(j), age.get(j), hobbies1.get(j), hobbies2.get(j), movie.get(j), insideChar.get(j), mbti.get(j), island.get(j)));
        }
    }

    public void bestMatch1() {
        int bestMatch = 0; // greatest number
        int counter = 0; // main counter
        int pos = 0;
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size(); j++) {
                if (i != j) {
                    if ((people.get(i).getAge() == people.get(j).getAge()) || 
                    (people.get(i).getAge() == people.get(j).getAge() + 1) || 
                    (people.get(i).getAge() == people.get(j).getAge() - 1)) {
                        
                        if (people.get(i).getH1().equals(people.get(j).getH1())) {
                            counter++;
                        }

                        if (people.get(i).getH2().equals(people.get(j).getH2())) {
                            counter++;
                        }

                        if (people.get(i).getMov().equals(people.get(j).getMov())) {
                            counter++;
                        }

                        if (people.get(i).getIc().equals(people.get(j).getIc())) {
                            counter++;
                        }

                        if (people.get(i).getMb().equals(people.get(j).getMb())) {
                            counter++;
                        }

                        if (people.get(i).getIs().equals(people.get(j).getIs())) {
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
            b1.add(people.get(pos));
            bestMatch = 0;
            pos = 0; 
        }
        //tester purposes
        for (int x = 0; x < b1.size(); x++) {
            System.out.println(b1.get(x).getName());
        }
    }

    public void bestMatch2() {
        int bestMatch = 0; // greatest number
        int counter = 0; // main counter
        int pos = 0;
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size(); j++) {
                if (i != j) {
                    if ((people.get(i).getAge() == people.get(j).getAge()) || 
                    (people.get(i).getAge() == people.get(j).getAge() + 1) || 
                    (people.get(i).getAge() == people.get(j).getAge() - 1)) {

                        // MB
                        if (people.get(i).getMb().equals(people.get(j).getMb())) {
                            counter+=10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ESFP") && (people.get(j).getMb().substring(0,4).equals("ESFJ") || 
                        people.get(j).getMb().substring(0,4).equals("ESTP") || people.get(j).getMb().substring(0,4).equals("ISFP"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ESTP") && (people.get(j).getMb().substring(0,4).equals("ESTJ") || 
                        people.get(j).getMb().substring(0,4).equals("ESFP") || people.get(j).getMb().substring(0,4).equals("INFJ"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ESTJ") && (people.get(j).getMb().substring(0,4).equals("ESTP") || 
                        people.get(j).getMb().substring(0,4).equals("ESFJ") || people.get(j).getMb().substring(0,4).equals("ISTJ"))) {
                            counter += 10;
                        }
                        
                        else if (people.get(i).getMb().substring(0,4).equals("ESFJ") && (people.get(j).getMb().substring(0,4).equals("ISTP") || 
                        people.get(j).getMb().substring(0,4).equals("ESTJ") || people.get(j).getMb().substring(0,4).equals("ESTP"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ISTJ") && (people.get(j).getMb().substring(0,4).equals("INFJ") || 
                        people.get(j).getMb().substring(0,4).equals("ISTP") || people.get(j).getMb().substring(0,4).equals("ISFJ"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ISTP") && (people.get(j).getMb().substring(0,4).equals("ISFP") || 
                        people.get(j).getMb().substring(0,4).equals("INFP") || people.get(j).getMb().substring(0,4).equals("ESFP"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ISFJ") && (people.get(j).getMb().substring(0,4).equals("ESFJ") || 
                        people.get(j).getMb().substring(0,4).equals("ISFP") || people.get(j).getMb().substring(0,4).equals("ISTJ"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ISFP") && (people.get(j).getMb().substring(0,4).equals("ESFP") || 
                        people.get(j).getMb().substring(0,4).equals("ISFJ") || people.get(j).getMb().substring(0,4).equals("ESFJ"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ENTJ") && (people.get(j).getMb().substring(0,4).equals("INTJ") || 
                        people.get(j).getMb().substring(0,4).equals("ENTP") || people.get(j).getMb().substring(0,4).equals("ENFJ"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ENTP") && (people.get(j).getMb().substring(0,4).equals("ENTJ") || 
                        people.get(j).getMb().substring(0,4).equals("ENFP") || people.get(j).getMb().substring(0,4).equals("ENFJ"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ENFJ") && || (people.get(j).getMb().substring(0,4).equals("INFJ") ||
                        people.get(j).getMb().substring(0,4).equals("ENFP"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("ENFP") && (people.get(j).getMb().substring(0,4).equals("ENTJ") || 
                        people.get(j).getMb().substring(0,4).equals("INTJ") || people.get(j).getMb().substring(0,4).equals("INTP"))) {
                            counter += 10;
                        }
                        
                        else if (people.get(i).getMb().substring(0,4).equals("INTJ") && (people.get(j).getMb().substring(0,4).equals("INTP") || 
                        people.get(j).getMb().substring(0,4).equals("INFJ") || people.get(j).getMb().substring(0,4).equals("INFP"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("INTP") && (people.get(j).getMb().substring(0,4).equals("ENTP") || 
                        people.get(j).getMb().substring(0,4).equals("INFP") || people.get(j).getMb().substring(0,4).equals("ENFP"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("INFJ") && (people.get(j).getMb().substring(0,4).equals("ISTJ") || 
                        people.get(j).getMb().substring(0,4).equals("INFP") || people.get(j).getMb().substring(0,4).equals("INTJ"))) {
                            counter += 10;
                        }

                        else if (people.get(i).getMb().substring(0,4).equals("INFP") && (people.get(j).getMb().substring(0,4).equals("INFJ") || 
                        people.get(j).getMb().substring(0,4).equals("ISFJ") || people.get(j).getMb().substring(0,4).equals("ENFJ"))) {
                            counter += 10;
                        }

                        // ISLAND
                        if (people.get(i).getIs().equals(people.get(j).getIs())) {
                            counter+=6;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("p") && (people.get(j).getIs().substring(0,4).equals("y"))) {
                            counter += 6;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("d") && (people.get(j).getIs().substring(0,4).equals("f"))) {
                            counter += 6;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("f") && (people.get(j).getIs().substring(0,4).equals("d"))) {
                            counter += 6;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("s") && (people.get(j).getIs().substring(0,4).equals("a"))) {
                            counter += 6;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("a") && (people.get(j).getIs().substring(0,4).equals("s"))) {
                            counter += 6;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("y") && (people.get(j).getIs().substring(0,4).equals("p"))) {
                            counter += 6;
                        }

                        // INSIDE OUT CHAR
                        if (people.get(i).getIc().equals(people.get(j).getIc())) {
                            counter += 4;
                        }

                        // else if (DECIDE ON IC PAIRINGS)

                    }
                }

               if (counter > bestMatch) {
                   pos = j;
                   bestMatch = counter;
                }
               counter = 0;
            }
            b1.add(people.get(pos));
            bestMatch = 0;
            pos = 0; 
        }
        //tester purposes
        for (int x = 0; x < b1.size(); x++) {
            System.out.println(b1.get(x).getName());
        }
    }

    public void worstMatch1() {
        int bestMatch = 0; // greatest number
        int counter = 0; // main counter
        int pos = 0;
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size(); j++) {
                if (i != j) {
                    if ((people.get(i).getAge() == people.get(j).getAge()) || 
                    (people.get(i).getAge() == people.get(j).getAge() + 1) || 
                    (people.get(i).getAge() == people.get(j).getAge() - 1)) {
                        
                        if (!(people.get(i).getH1().equals(people.get(j).getH1()))) {
                            counter++;
                        }

                        if (!(people.get(i).getH2().equals(people.get(j).getH2()))) {
                            counter++;
                        }

                        if (!(people.get(i).getMov().equals(people.get(j).getMov()))) {
                            counter++;
                        }

                        if (!(people.get(i).getIc().equals(people.get(j).getIc()))) {
                            counter++;
                        }

                        if (!(people.get(i).getMb().equals(people.get(j).getMb()))) {
                            counter++;
                        }

                        if (!(people.get(i).getIs().equals(people.get(j).getIs()))) {
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
            w1.add(people.get(pos));
            bestMatch = 0;
            pos = 0; 
        }
        //tester purposes
        for (int x = 0; x < w1.size(); x++) {
            System.out.println(w1.get(x).getName());
        }
    }

    public static void main(String[] args) throws Exception{
        Matches m = new Matches();
        m.bestMatch1();
        m.worstMatch1();
    }

    // IDEA 2: 
    // same for loop
        // 2 counters, 1 position counter 
        // compare people[0] and people[1] and everytime it is equal, give +1 point
        // compare people[0] and people[2] and everytime it is equal, give +1 point
        // compare the first counter and second counter, and if the second counter is GREATER than the first counter, 
            // make the position counter equal to the higher counter --> continue for loop and at the end, return ppl.get(pos);

    
    // FIRST MATCH --> MOST LIKELY (BASED ON NUMBER OF SIMILAR ANSWERS) DONE
    // SECOND MATCH --> MOST LIKELY (BASED ON OUR ALGORITHM)
    // THIRD MATCH --> LEAST LIKELY (BASED ON LEAST NUMBER OF SIMILAR ANSWERS)
    // FOURTH MATCH --> LEAST LIKELY (BASED ON OUR ALGORITHM)
}