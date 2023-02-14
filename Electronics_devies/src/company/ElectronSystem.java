package company;

public interface ElectronSystem {
	

	public void ElectroAdd(String companyname, String devicename, String ip, int price);
	public void Electroremove(String companyname, String devicename, String ip, int price);
	//public void Electroupdate();
}
