package Home;

import java.io.*;

public class CSV {

    public String[] find(int f) 
    {
        int i=0;
        String csvFile = "Data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
                br = new BufferedReader(new FileReader(csvFile));
                while ((line = br.readLine()) != null) 
                {
                    if(i==f)
                    {
                        String[] country = line.split(cvsSplitBy);
                        return country;
                    }
                    i++;
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally 
        {
            if (br != null) 
            {
                try 
                {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}