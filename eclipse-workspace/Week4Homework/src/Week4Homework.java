import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.RenderingHints.Key;
import java.lang.StringBuilder;

public class Week4Homework {

	public static void main(String[] args) {
		
		//1 & 4. 
			List<String> employeeNames = new ArrayList<String>();
			employeeNames.add("John");
			employeeNames.add("Matthew");
			employeeNames.add("Luke");
			employeeNames.add("Bingham");
			employeeNames.add("Dez");
			
			
		//2 & 4.
			Set<Integer> ids = new HashSet<Integer>();
			ids.add(1);
			ids.add(2);
			ids.add(3);
			ids.add(4);
			ids.add(5);
			
		//3.
			Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		//5.
			int i = 0;
			
			for (Integer id : ids) {
				employeeMap.put(id, employeeNames.get(i));
				i++;
			}
		//6.
			for (Integer key : ids) {
				System.out.println(key + " : " + employeeMap.get(key));
			}
			
		//7.
			StringBuilder idsBuilder = new StringBuilder();
		
		//8. 
			for (Integer id : ids) {
				idsBuilder.append(id + " - ");
			}
		//9.
			System.out.println(idsBuilder.toString());
			
		//10.
			StringBuilder namesBuilder = new StringBuilder();
		
		//11.
			for (String employeeName : employeeNames) {
				namesBuilder.append(employeeNames + " ");
			}
			
		//12. 
			System.out.println(namesBuilder.toString());
	}
}


