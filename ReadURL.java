import java.net.*;
import java.util.ArrayList;
import java.io.*;

public class ReadURL {
    ArrayList<String> name = new ArrayList<>();
    ArrayList<String> age = new ArrayList<>();
    ArrayList<String> hobbies1 = new ArrayList<>();
    ArrayList<String> hobbies2 = new ArrayList<>();
    ArrayList<String> movie = new ArrayList<>();
    ArrayList<String> insideChar = new ArrayList<>();
    ArrayList<String> mbti = new ArrayList<>();
    ArrayList<String> island = new ArrayList<>();
    String arr[] = new String[1000];

    public ReadURL() throws Exception{
        URL url = new URL("https://docs.google.com/spreadsheets/d/e/2PACX-1vQOs65MyglyYnZOy9B9KyYGd9bjKOAMo63bMDzxFQ6q_JLknmhBtLz-N0XBshC4z6f0QNSRneXFxaeN/pub?gid=321494671&single=true&output=tsv");
        BufferedReader read = new BufferedReader(
        new InputStreamReader(url.openStream()));
        
        String i;
        read.readLine();
        while ((i = read.readLine()) != null) {
            arr = i.split("\t");
            name.add(arr[1]);
            age.add(arr[2]);
            hobbies1.add(arr[3]);
            hobbies2.add(arr[4]);
            movie.add(arr[5]);
            insideChar.add(arr[6]);
            mbti.add(arr[7]);
            island.add(arr[8]);
        }

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(hobbies1);
        // System.out.println(hobbies2);
        // System.out.println(movie);
        // System.out.println(insideChar);
        // System.out.println(mbti);
        // System.out.println(island);

        read.close();
    }
}
    //public static void main(String[] args) throws Exception {
        // URL url = new URL("https://docs.google.com/spreadsheets/d/e/2PACX-1vQOs65MyglyYnZOy9B9KyYGd9bjKOAMo63bMDzxFQ6q_JLknmhBtLz-N0XBshC4z6f0QNSRneXFxaeN/pub?gid=321494671&single=true&output=tsv");
        // BufferedReader read = new BufferedReader(
        // new InputStreamReader(url.openStream()));
        
        // String arr[] = new String[1000];
        
        // ArrayList<String> name = new ArrayList<>();
        // ArrayList<String> age = new ArrayList<>();
        // ArrayList<String> hobbies1 = new ArrayList<>();
        // ArrayList<String> hobbies2 = new ArrayList<>();
        // ArrayList<String> movie = new ArrayList<>();
        // ArrayList<String> insideChar = new ArrayList<>();
        // ArrayList<String> mbti = new ArrayList<>();
        // ArrayList<String> island = new ArrayList<>();

        // String i;
        // read.readLine();
        // while ((i = read.readLine()) != null) {
        //     arr = i.split("\t");
        //     name.add(arr[1]);
        //     age.add(arr[2]);
        //     hobbies1.add(arr[3]);
        //     hobbies2.add(arr[4]);
        //     movie.add(arr[5]);
        //     insideChar.add(arr[6]);
        //     mbti.add(arr[7]);
        //     island.add(arr[8]);
        // }

        // ArrayList<Person> people = new ArrayList<>();
        // for (int j = 0; j < arr.length; j++){
        //     people.add(Person(name.get(j), age.get(j), hobbies1.get(j), hobbies2.get(j), movie.get(j), insideChar.get(j), mbti.get(j), island.get(j)));
        // }

        // // System.out.println(name);
        // // System.out.println(age);
        // // System.out.println(hobbies1);
        // // System.out.println(hobbies2);
        // // System.out.println(movie);
        // // System.out.println(insideChar);
        // // System.out.println(mbti);
        // // System.out.println(island);

//         // read.close();
//     }
// }
