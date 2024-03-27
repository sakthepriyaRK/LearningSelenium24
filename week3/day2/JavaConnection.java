package week3.day2;

public class JavaConnection implements DatabaseConnection {
//@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect Method in Interface is implented by concrete class JavaConnection");
	}
//@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect Method in Interface is implented by concrete class JavaConnection");

	}
//@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("executeUpdate Method in Interface is implented by concrete class JavaConnection");

	}
public void fetchdetails() {
	System.out.println("Fetchdetails Method in  concrete class JavaConnection");

}
public static void main(String[] args) {
	JavaConnection jc= new JavaConnection();
	jc.connect();
	jc.disconnect();
	jc.executeUpdate();
	jc.fetchdetails();
}
}
