package control;
import java.util.ArrayList;
public class UserDataList {
	private ArrayList<Entry> userList;
	public UserDataList() {userList = new ArrayList<Entry>();}
	
	public boolean add(String id, String password, String name, String birthDate)
	{
		for(int i=0; i<userList.size(); i++) if(id.equals(userList.get(i).getId())) return false; //ID conflict
		Entry newE = new Entry(id,password,name,birthDate);
		userList.add(newE);
		return true;
	}
	
	public int  logIn(String id, String password) //1:성공 , 2:ID없음:, 3:비밀번호틀림 
	{
		int i;
		for(i=0; i<userList.size(); i++) if(id.equals(userList.get(i).getId())) break;
		if(i==userList.size()) return 2;
		if(userList.get(i).getPassword().equals(password)) return 1;
		else return 3;
	}
	
	public String idSearch(String name, String birthDate)
	{
		int i;
		for(i=0; i<userList.size(); i++) if(birthDate.equals(userList.get(i).getBirthDate())) break;
		if(i==userList.size()) return null;
		if(userList.get(i).getName().equals(name)) return userList.get(i).getId();
		else return null;
	}
	
	public String passwordSearch(String id, String name, String birthDate)
	{
		int i;
		for(i=0; i<userList.size(); i++) if(id.equals(userList.get(i).getId())) break;
		if(i==userList.size()) return null;
		if(userList.get(i).getName().equals(name) && userList.get(i).getBirthDate().equals(birthDate)) return userList.get(i).getPassword();
		else return null;
	}
}
