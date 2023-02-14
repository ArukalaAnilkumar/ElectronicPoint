package company;

public class Properties {
	
	private String companyname;
	private String devicename;
	private String ip;
	private String personName;
	private long aaderno;
	private long phone;
	private int price;
	public Properties(String companyname, String devicename, String ip, String personName, long aaderno, long phone,
			int price) {
		//super();
		this.companyname = companyname;
		this.devicename = devicename;
		this.ip = ip;
		this.personName = personName;
		this.aaderno = aaderno;
		this.phone = phone;
		this.price = price;
	}
	public Properties() {
		// TODO Auto-generated constructor stub
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getDevicename() {
		return devicename;
	}
	public void setDevicename(String devicename) {
		this.devicename = devicename;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public long getAaderno() {
		return aaderno;
	}
	public void setAaderno(int aaderno) {
		this.aaderno = aaderno;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Properties [companyname=" + companyname + ", devicename=" + devicename + ", ip=" + ip + ", personName="
				+ personName + ", aaderno=" + aaderno + ", phone=" + phone + ", price=" + price + "]";
	}
	

}
