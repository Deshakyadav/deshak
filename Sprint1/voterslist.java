package Tuesday1510;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class voterslist {

    public List<String> votersList(Map<String, String> people) {
        List<String> eligibleVoters = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar today = Calendar.getInstance();

        for (Map.Entry<String, String> entry : people.entrySet()) {
        	String id= entry.getKey();
        	String dob=entry.getValue();
            try {
                Date dob1 = sdf.parse(entry.getValue());
                Calendar dobCalandar=Calendar.getInstance();
                dobCalandar.setTime(dob1);
                int age = today.get(Calendar.YEAR) - dobCalandar.get(Calendar.YEAR);
                

                if (age > 18) {
                    eligibleVoters.add(entry.getKey());
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return eligibleVoters;
    }

    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();
        people.put("ID01", "15/08/2024");
        people.put("ID02", "20/11/2005");
        people.put("ID003", "01/01/2003");
        people.put("ID007", "22/09/2010");

        voterslist ve = new voterslist();
        List<String> eligibleVoters = ve.votersList(people);

        System.out.println("Eligible Voters:");
        for (String id : eligibleVoters) {
            System.out.println(id);
        }
    }
}
