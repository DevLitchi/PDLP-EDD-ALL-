
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {
    /**
     * @param args
     * @throws IOException
     * @throws FileNotFoundException
     * @throws org.json.simple.parser.ParseException
     */
    public static void main(String[] args)
            throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {
        System.out.println("hola mundo");
        JSONParser jsonP = new JSONParser();
        try (FileReader reader = new FileReader(
                "C:\\SEMESTREcuatro\\Profesora Laua\\Unidad 2\\PARADIGMAS UNIDAD 2\\Unidad 2\\Ejercicio12\\posts.json")) {
            Object obj = jsonP.parse(reader);
            JSONArray empList = (JSONArray) obj;
            System.out.println(empList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// private static void parseEmpObj(JSONObject emp) {
// JSONObject empObj = (JSONObject) emp.get("employee");
// //get emp firstname, lastname, website
// String userid = (String) empObj.get("userid");
// String id = (String) empObj.get("id");
// String website = (String) empObj.get("website");
// System.out.println(userid);
// System.out.println(id);
// System.out.println(tittle);
// System.out.println(body);
// }

// // Object obj= new Object();
// // try {
// // obj = parser.parse(new FileReader("posts.json"));
// // } catch (org.json.simple.parser.ParseException e) {
// // // TODO Auto-generated catch block
// // e.printStackTrace();
// // }
// // JSONObject jsonObject = (JSONObject) obj;
// // JSONArray array = (JSONArray) jsonObject.get();
// // System.out.println("JSON Leido: " + jsonObject);

// }
// }