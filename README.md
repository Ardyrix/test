SOAL 1

package soalgrandbootcamp;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class SoalGrandBootcamp1 {
     public static void main(String[] args) {
 
	JSONObject obj = new JSONObject();
	obj.put("itemId", "12341822");
        obj.put("itemName", "desk");
	obj.put("price", new Integer(700000));
 
	JSONArray list = new JSONArray();
	list.add("akmal");
	list.add("andi");
        
        JSONArray list2 = new JSONArray();
	list2.add(4);
	list2.add(5);
        
        JSONArray list3 = new JSONArray();
	list3.add("rater: " +list.get(0)+", score: " +list2.get(0));
	list3.add("rater: " +list.get(1)+", score: " +list2.get(1));

        obj.put("ratings", list3);
        
        obj.put("freeShipping", true);
        
        JSONArray list4 = new JSONArray();
        list4.add("brown");
        list4.add("black");
        
        obj.put("color", list4);
 
	try {
 
		FileWriter file = new FileWriter("d:\\test.json");
		file.write(obj.toJSONString());
		file.flush();
		file.close();
 
	} catch (IOException e) {
		e.printStackTrace();
	}
 
	System.out.print(obj);
 
     }
 
}

=================================================
SOAL 2

private void btnCekMouseClicked(java.awt.event.MouseEvent evt) {
        Pattern ptn = Pattern.compile("[a-zA-Z]*{5}\\_([\\d]*{2})$");
        Matcher matcher = ptn.matcher(jFormattedTextField1.getText());
        if (matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Penulisan username " + jFormattedTextField1.getText() + " benar");
        } else {
            JOptionPane.showMessageDialog(null, "Penulisan username " + jFormattedTextField1.getText() + " salah");
        }
    }

