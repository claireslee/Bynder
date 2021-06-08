import java.net.*;
import java.io.*;
public class ReadURL {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://docs.google.com/spreadsheets/d/e/2PACX-1vSDoMI2QjH3SOGisSBy5Hgbe90_MN0L_R4AxRtgUdpup04WAEfwP1LarC20StZ369BGkPqKkky6hvkv/pub?gid=376584242&single=true&output=tsv");
        BufferedReader read = new BufferedReader(
        new InputStreamReader(url.openStream()));
        String i;
        while ((i = read.readLine()) != null)
            System.out.println(i);
        read.close();
    }
}