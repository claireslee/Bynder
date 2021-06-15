import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class Matches extends ReadURL {
    
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Person> b1 = new ArrayList<>();
    ArrayList<Person> w1 = new ArrayList<>();
    ArrayList<Person> b2 = new ArrayList<>();
    ArrayList<Person> w2 = new ArrayList<>();

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

                        else if (people.get(i).getMb().substring(0,4).equals("ENFJ") && (people.get(j).getMb().substring(0,4).equals("INFJ") ||
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
                            counter += 7;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("p") && (people.get(j).getIs().substring(0,1).equals("y"))) {
                            counter += 7;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("d") && (people.get(j).getIs().substring(0,1).equals("f"))) {
                            counter += 7;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("f") && (people.get(j).getIs().substring(0,1).equals("d"))) {
                            counter += 7;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("s") && (people.get(j).getIs().substring(0,1).equals("a"))) {
                            counter += 7;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("a") && (people.get(j).getIs().substring(0,1).equals("s"))) {
                            counter += 7;
                        }

                        else if (people.get(i).getIs().substring(0,1).equals("y") && (people.get(j).getIs().substring(0,1).equals("p"))) {
                            counter += 7;
                        }

                        // INSIDE OUT CHAR
                        if (people.get(i).getIc().equals(people.get(j).getIc())) {
                            counter += 5;
                        }
                        
                        else if (people.get(i).getIc().substring(0,1).equals("J") && (people.get(j).getIc().substring(0,1).equals("B") || 
                        people.get(j).getIc().substring(0,1).equals("S"))) {
                            counter += 5;
                        }

                        else if (people.get(i).getIc().substring(0,1).equals("F") && (people.get(j).getIc().substring(0,1).equals("D") || 
                        people.get(j).getIc().substring(0,1).equals("S"))) {
                            counter += 5;
                        }

                        else if (people.get(i).getIc().substring(0,1).equals("S") && (people.get(j).getIc().substring(0,1).equals("J") || 
                        people.get(j).getIc().substring(0,1).equals("F"))) {
                            counter += 5;
                        }

                        else if (people.get(i).getIc().substring(0,1).equals("A") && (people.get(j).getIc().substring(0,1).equals("D") || 
                        people.get(j).getIc().substring(0,1).equals("F"))) {
                            counter += 5;
                        }

                        else if (people.get(i).getIc().substring(0,1).equals("D") && (people.get(j).getIc().substring(0,1).equals("A") || 
                        people.get(j).getIc().substring(0,1).equals("F"))) {
                            counter += 5;
                        }

                        else if (people.get(i).getIc().substring(0,1).equals("B") && (people.get(j).getIc().substring(0,1).equals("J") || 
                        people.get(j).getIc().substring(0,1).equals("S"))) {
                            counter += 5;
                        }

                        // MOVIE
                        if (people.get(i).getMov().equals(people.get(j).getMov())) {
                            counter += 3;
                        }

                        else if (people.get(i).getMov().substring(0,1).equals("c") && (people.get(j).getMov().substring(0,1).equals("r"))) {
                            counter += 3;
                        }

                        else if (people.get(i).getMov().substring(0,1).equals("r") && (people.get(j).getMov().substring(0,1).equals("c"))) {
                            counter += 3;
                        }

                        else if (people.get(i).getMov().substring(0,1).equals("a") && (people.get(j).getMov().substring(0,1).equals("h") || 
                        people.get(j).getMov().substring(0,1).equals("s"))) {
                            counter += 3;
                        }

                        else if (people.get(i).getMov().substring(0,1).equals("h") && (people.get(j).getMov().substring(0,1).equals("a") || 
                        people.get(j).getMov().substring(0,1).equals("s"))) {
                            counter += 3;
                        }

                        else if (people.get(i).getMov().substring(0,1).equals("s") && (people.get(j).getMov().substring(0,1).equals("h") || 
                        people.get(j).getMov().substring(0,1).equals("a"))) {
                            counter += 3;
                        }

                        // HOBBY1
                        if (people.get(i).getH1().equals(people.get(j).getH1())) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("sp") && (people.get(j).getH1().substring(0,2).equals("li"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("li") && (people.get(j).getH1().substring(0,2).equals("sp"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("re") && (people.get(j).getH1().substring(0,2).equals("ar"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("ar") && (people.get(j).getH1().substring(0,2).equals("re"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("si") && (people.get(j).getH1().substring(0,2).equals("in"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("in") && (people.get(j).getH1().substring(0,2).equals("si"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("vi") && (people.get(j).getH1().substring(0,2).equals("te"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("te") && (people.get(j).getH1().substring(0,2).equals("vi"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("ph") && (people.get(j).getH1().substring(0,2).equals("ti"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("ti") && (people.get(j).getH1().substring(0,2).equals("ph"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("ba") && (people.get(j).getH1().substring(0,2).equals("tr"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("tr") && (people.get(j).getH1().substring(0,2).equals("ba"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("sl") && (people.get(j).getH1().substring(0,2).equals("wa"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH1().substring(0,2).equals("wa") && (people.get(j).getH1().substring(0,2).equals("si"))) {
                            counter += 1;
                        }

                        // HOBBY2
                        if (people.get(i).getH2().equals(people.get(j).getH2())) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("sp") && (people.get(j).getH2().substring(0,2).equals("li"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("li") && (people.get(j).getH2().substring(0,2).equals("sp"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("re") && (people.get(j).getH2().substring(0,2).equals("ar"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("ar") && (people.get(j).getH2().substring(0,2).equals("re"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("si") && (people.get(j).getH2().substring(0,2).equals("in"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("in") && (people.get(j).getH2().substring(0,2).equals("si"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("vi") && (people.get(j).getH2().substring(0,2).equals("te"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("te") && (people.get(j).getH2().substring(0,2).equals("vi"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("ph") && (people.get(j).getH2().substring(0,2).equals("ti"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("ti") && (people.get(j).getH2().substring(0,2).equals("ph"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("ba") && (people.get(j).getH2().substring(0,2).equals("tr"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("tr") && (people.get(j).getH2().substring(0,2).equals("ba"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("sl") && (people.get(j).getH2().substring(0,2).equals("wa"))) {
                            counter += 1;
                        }

                        else if (people.get(i).getH2().substring(0,2).equals("wa") && (people.get(j).getH2().substring(0,2).equals("si"))) {
                            counter += 1;
                        }
                    }
                }

               if (counter > bestMatch) {
                   pos = j;
                   bestMatch = counter;
                }
                counter = 0;
            }

            b2.add(people.get(pos));
            bestMatch = 0;
            pos = 0; 
        }
        //tester purposes
        for (int x = 0; x < b2.size(); x++) {
            System.out.println(b2.get(x).getName());
        }
    }

    public void worstMatch1() {
        int worstMatch = 0; // greatest number
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

               if (counter > worstMatch) {
                   pos = j;
                   worstMatch = counter;
                }
               counter = 0;
            }
            w1.add(people.get(pos));
            worstMatch = 0;
            pos = 0; 
        }
        //tester purposes
        for (int x = 0; x < w1.size(); x++) {
            System.out.println(w1.get(x).getName());
        }
    }

    // public void worstMatch2() {
    //     int worstMatch = 0; // greatest number
    //     int counter = 0; // main counter
    //     int pos = 0;
    //     for (int i = 0; i < people.size(); i++) {
    //         for (int j = 0; j < people.size(); j++) {
    //             if (i != j) {
    //                 if ((people.get(i).getAge() == people.get(j).getAge()) || 
    //                 (people.get(i).getAge() == people.get(j).getAge() + 1) || 
    //                 (people.get(i).getAge() == people.get(j).getAge() - 1)) {
                        
    //                     if (people.get(i).getMb().equals(people.get(j).getMb())) {
    //                         counter += 0;
    //                     }
                    
    //                     // MB
    //                     if (people.get(i).getMb().substring(0,4).equals("ESFP") && (!(people.get(j).getMb().substring(0,4).equals("ESFJ"))) && 
    //                     (!(people.get(j).getMb().substring(0,4).equals("ESTP"))) && (!(people.get(j).getMb().substring(0,4).equals("ISFP")))) {
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("ESTP") && (!(people.get(j).getMb().substring(0,4).equals("ESTJ"))) &&
    //                     (!(people.get(j).getMb().substring(0,4).equals("ESFP"))) && (!(people.get(j).getMb().substring(0,4).equals("INFJ")))) {
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("ESTJ") && (!(people.get(j).getMb().substring(0,4).equals("ESTP"))) &&
    //                     (!(people.get(j).getMb().substring(0,4).equals("ESFJ"))) && (!(people.get(j).getMb().substring(0,4).equals("ISTJ")))) {
    //                         counter += 10;
    //                     }
                        
    //                     else if (people.get(i).getMb().substring(0,4).equals("ESFJ") && (!(people.get(j).getMb().substring(0,4).equals("ISTP"))) &&
    //                     (!(people.get(j).getMb().substring(0,4).equals("ESTJ"))) && (!(people.get(j).getMb().substring(0,4).equals("ESTP")))) {
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("ISTJ") && (!(people.get(j).getMb().substring(0,4).equals("INFJ"))) &&
    //                     (!(people.get(j).getMb().substring(0,4).equals("ISTP"))) && (!(people.get(j).getMb().substring(0,4).equals("ISFJ")))) {
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("ISTP") && (!(people.get(j).getMb().substring(0,4).equals("ISFP"))) &&
    //                     (!(people.get(j).getMb().substring(0,4).equals("INFP"))) && (!(people.get(j).getMb().substring(0,4).equals("ESFP")))) {
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("ISFJ") && (!(people.get(j).getMb().substring(0,4).equals("ESFJ"))) &&
    //                     (!(people.get(j).getMb().substring(0,4).equals("ISFP"))) && (!(people.get(j).getMb().substring(0,4).equals("ISTJ")))) {
    //                         counter += 10;
    //                     }
                        
    //                     else if (people.get(i).getMb().substring(0,4).equals("ISFP") && (!(people.get(j).getMb().substring(0,4).equals("ESFP"))) &&
    //                     (!(people.get(j).getMb().substring(0,4).equals("ISFJ"))) && (!(people.get(j).getMb().substring(0,4).equals("ESFJ")))) {
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("ENTJ") && (!(people.get(j).getMb().substring(0,4).equals("INTJ"))) &&
    //                     (!(people.get(j).getMb().substring(0,4).equals("ENTP"))) && (!(people.get(j).getMb().substring(0,4).equals("ENFJ")))) {
    //                         counter += 10;
    //                     }

                        
    //                     else if (people.get(i).getMb().substring(0,4).equals("ENTP")) {
    //                         System.out.println((!(people.get(j).getMb().substring(0,4).equals("ENTJ"))) &&
    //                         (!(people.get(j).getMb().substring(0,4).equals("ENFP"))) && (!(people.get(j).getMb().substring(0,4).equals("ENFJ"))));
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("ENFJ") && (!(people.get(j).getMb().substring(0,4).equals("INFJ"))) &&
    //                     (!(people.get(j).getMb().substring(0,4).equals("ENFP")))) {
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("ENFP") && (!(people.get(j).getMb().substring(0,4).equals("ENTJ"))) &&
    //                     (!(people.get(j).getMb().substring(0,4).equals("INTJ")) && (!people.get(j).getMb().substring(0,4).equals("INTP")))) {
    //                         counter += 10;
    //                     }
                        
    //                     else if (people.get(i).getMb().substring(0,4).equals("INTJ") && (!(people.get(j).getMb().substring(0,4).equals("INTP"))) && 
    //                     (!(people.get(j).getMb().substring(0,4).equals("INFJ"))) && (!(people.get(j).getMb().substring(0,4).equals("INFP")))) {
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("INTP") && (!(people.get(j).getMb().substring(0,4).equals("ENTP"))) && 
    //                     (!(people.get(j).getMb().substring(0,4).equals("INFP"))) && (!(people.get(j).getMb().substring(0,4).equals("ENFP")))) {
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("INFJ") && (!(people.get(j).getMb().substring(0,4).equals("ISTJ"))) && 
    //                     (!(people.get(j).getMb().substring(0,4).equals("INFP"))) && (!(people.get(j).getMb().substring(0,4).equals("INTJ")))) {
    //                         counter += 10;
    //                     }

    //                     else if (people.get(i).getMb().substring(0,4).equals("INFP") && (!(people.get(j).getMb().substring(0,4).equals("INFJ"))) && 
    //                     (!(people.get(j).getMb().substring(0,4).equals("ISFJ"))) && (!(people.get(j).getMb().substring(0,4).equals("ENFJ")))) {
    //                         counter += 10;
    //                     }
    //                     System.out.println(counter);

    //                     // ISLAND
    //                     if (people.get(i).getIs().equals(people.get(j).getIs())) {
    //                         counter += 0;
    //                     }
                        
    //                     else if (people.get(i).getIs().substring(0,1).equals("p") && (!(people.get(j).getIs().substring(0,1).equals("y")))) {
    //                         counter += 7;
    //                     }

    //                     else if (people.get(i).getIs().substring(0,1).equals("d") && (!(people.get(j).getIs().substring(0,1).equals("f")))) {
    //                         counter += 7;
    //                     }

    //                     else if (people.get(i).getIs().substring(0,1).equals("f") && (!(people.get(j).getIs().substring(0,1).equals("d")))) {
    //                         counter += 7;
    //                     }

    //                     else if (people.get(i).getIs().substring(0,1).equals("s") && (!(people.get(j).getIs().substring(0,1).equals("a")))) {
    //                         counter += 7;
    //                     }

    //                     else if (people.get(i).getIs().substring(0,1).equals("a") && (!(people.get(j).getIs().substring(0,1).equals("s")))) {
    //                         counter += 7;
    //                     }

    //                     else if (people.get(i).getIs().substring(0,1).equals("y") && (!(people.get(j).getIs().substring(0,1).equals("p")))) {
    //                         counter += 7;
    //                     }
    //                     System.out.println(counter);

    //                     // INSIDE OUT CHAR
    //                     if (people.get(i).getIc().equals(people.get(j).getIc())) {
    //                         counter += 0;
    //                     }

    //                     else if (people.get(i).getIc().substring(0,1).equals("J") && (!(people.get(j).getIc().substring(0,1).equals("B"))) && 
    //                     (!(people.get(j).getIc().substring(0,1).equals("S")))) {
    //                         counter += 5;
    //                     }

    //                     else if (people.get(i).getIc().substring(0,1).equals("F") && (!(people.get(j).getIc().substring(0,1).equals("D"))) && 
    //                     (!(people.get(j).getIc().substring(0,1).equals("S")))) {
    //                         counter += 5;
    //                     }

    //                     else if (people.get(i).getIc().substring(0,1).equals("S") && (!(people.get(j).getIc().substring(0,1).equals("J"))) &&
    //                     (!(people.get(j).getIc().substring(0,1).equals("F")))) {
    //                         counter += 5;
    //                     }

    //                     else if (people.get(i).getIc().substring(0,1).equals("A") && (!(people.get(j).getIc().substring(0,1).equals("D"))) && 
    //                     (!(people.get(j).getIc().substring(0,1).equals("F")))) {
    //                         counter += 5;
    //                     }

    //                     else if (people.get(i).getIc().substring(0,1).equals("D") && (!(people.get(j).getIc().substring(0,1).equals("A"))) && 
    //                     (!(people.get(j).getIc().substring(0,1).equals("F")))) {
    //                         counter += 5;
    //                     }

    //                     else if (people.get(i).getIc().substring(0,1).equals("B") && (!(people.get(j).getIc().substring(0,1).equals("J"))) && 
    //                     (!(people.get(j).getIc().substring(0,1).equals("S")))) {
    //                         counter += 5;
    //                     }
    //                     System.out.println(counter);

    //                     // MOVIE
    //                     if (people.get(i).getMov().equals(people.get(j).getMov())) {
    //                         counter += 0;
    //                     }
                        
    //                     else if (people.get(i).getMov().substring(0,1).equals("c") && (!(people.get(j).getMov().substring(0,1).equals("r")))) {
    //                         counter += 3;
    //                     }

    //                     else if (people.get(i).getMov().substring(0,1).equals("r") && (!(people.get(j).getMov().substring(0,1).equals("c")))) {
    //                         counter += 3;
    //                     }

    //                     else if (people.get(i).getMov().substring(0,1).equals("a") && (!(people.get(j).getMov().substring(0,1).equals("h"))) && 
    //                     (!(people.get(j).getMov().substring(0,1).equals("s")))) {
    //                         counter += 3;
    //                     }

    //                     else if (people.get(i).getMov().substring(0,1).equals("h") && (!(people.get(j).getMov().substring(0,1).equals("a"))) && 
    //                     (!(people.get(j).getMov().substring(0,1).equals("s")))) {
    //                         counter += 3;
    //                     }

    //                     else if (people.get(i).getMov().substring(0,1).equals("s") && (!(people.get(j).getMov().substring(0,1).equals("h"))) && 
    //                     (!(people.get(j).getMov().substring(0,1).equals("a")))) {
    //                         counter += 3;
    //                     }
    //                     System.out.println(counter);

    //                     // HOBBY1
    //                     if (people.get(i).getH1().equals(people.get(j).getH1())) {
    //                         counter += 0;
    //                     }
                        
    //                     else if (people.get(i).getH1().substring(0,2).equals("sp") && (!(people.get(j).getH1().substring(0,2).equals("li")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("li") && (!(people.get(j).getH1().substring(0,2).equals("sp")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("re") && (!(people.get(j).getH1().substring(0,2).equals("ar")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("ar") && (!(people.get(j).getH1().substring(0,2).equals("re")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("si") && (!(people.get(j).getH1().substring(0,2).equals("in")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("in") && (!(people.get(j).getH1().substring(0,2).equals("si")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("vi") && (!(people.get(j).getH1().substring(0,2).equals("te")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("te") && (!(people.get(j).getH1().substring(0,2).equals("vi")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("ph") && (!(people.get(j).getH1().substring(0,2).equals("ti")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("ti") && (!(people.get(j).getH1().substring(0,2).equals("ph")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("ba") && (!(people.get(j).getH1().substring(0,2).equals("tr")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("tr") && (!(people.get(j).getH1().substring(0,2).equals("ba")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("sl") && (!(people.get(j).getH1().substring(0,2).equals("wa")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH1().substring(0,2).equals("wa") && (!(people.get(j).getH1().substring(0,2).equals("si")))) {
    //                         counter += 1;
    //                     }
    //                     System.out.println(counter);

    //                     // HOBBY2
    //                     if (people.get(i).getH2().equals(people.get(j).getH2())) {
    //                         counter += 0;
    //                     }
                        
    //                     else if (people.get(i).getH2().substring(0,2).equals("sp") && (!(people.get(j).getH2().substring(0,2).equals("li")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("li") && (!(people.get(j).getH2().substring(0,2).equals("sp")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("re") && (!(people.get(j).getH2().substring(0,2).equals("ar")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("ar") && (!(people.get(j).getH2().substring(0,2).equals("re")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("si") && (!(people.get(j).getH2().substring(0,2).equals("in")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("in") && (!(people.get(j).getH2().substring(0,2).equals("si")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("vi") && (!(people.get(j).getH2().substring(0,2).equals("te")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("te") && (!(people.get(j).getH2().substring(0,2).equals("vi")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("ph") && (!(people.get(j).getH2().substring(0,2).equals("ti")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("ti") && (!(people.get(j).getH2().substring(0,2).equals("ph")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("ba") && (!(people.get(j).getH2().substring(0,2).equals("tr")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("tr") && (!(people.get(j).getH2().substring(0,2).equals("ba")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("sl") && (!(people.get(j).getH2().substring(0,2).equals("wa")))) {
    //                         counter += 1;
    //                     }

    //                     else if (people.get(i).getH2().substring(0,2).equals("wa") && (!(people.get(j).getH2().substring(0,2).equals("si")))) {
    //                         counter += 1;
    //                     }
    //                  System.out.println(counter);

    //                 }
    //             }

    //            if (counter > worstMatch) {
    //                pos = j;
    //                worstMatch = counter;
    //             }
    //             counter = 0;
    //         }

    //         w2.add(people.get(pos));
    //         worstMatch = 0;
    //         pos = 0; 
    //     }

    //     //tester purposes
    //     for (int x = 0; x < w2.size(); x++) {
    //         System.out.println(w2.get(x).getName());
    //     }
    // }

    public static void main(String[] args) throws Exception{
        Matches m = new Matches();
        m.bestMatch1();
        m.worstMatch1();
        m.bestMatch2();
        //m.worstMatch2();
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