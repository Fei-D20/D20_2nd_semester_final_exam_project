package func.eventcard;

import org.omg.PortableServer.POA;

import java.util.ArrayList;
import java.util.Properties;

import java.io.*;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-26-22.37
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_IO {
    public static ArrayList<String> read(String url,String ... strings){
        try {
            InputStream resourceAsStream = Func_IO.class.getClassLoader().getResourceAsStream(url);
            Properties properties = new Properties();
            properties.load(resourceAsStream);

            ArrayList<String> propertyList = new ArrayList<>();

            for (String string : strings) {
                if (properties.containsKey(string)) {
                    String property = properties.getProperty(string);
                    propertyList.add(property);
                }
            }
            return propertyList;


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void write(String url, String string)  {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(new File(url)));

            bufferedWriter.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
