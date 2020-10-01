import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a =10;
//		String s="bbb";
//		int[] numArray = new int[10];
//		ArrayList<Patient> alist = new ArrayList<>();
		
		
		ArrayList<Patient> alist = new ArrayList<>();

		/***************/
		//Loading patient from an existing file
		try {
			FileReader fr = new FileReader("patientdb.txt");
			BufferedReader bfr = new BufferedReader(fr);
			bfr.lines().forEach(out -> {
				String[] strarr = out.split(",");
				Patient p = new Patient(Integer.parseInt(strarr[0]),strarr[1].toString(),Integer.parseInt(strarr[2]),strarr[3].toString(),Boolean.getBoolean(strarr[4]));
				alist.add(p);
			});
			bfr.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/****************/
		/*
		Patient p1 = new Patient(1,"aaa");
		alist.add(p1);
		
		Patient p2 = new Patient(2,"bbb");
		alist.add(p2);

		*/

		PatientGUI pg = new PatientGUI(alist);

	}

}
