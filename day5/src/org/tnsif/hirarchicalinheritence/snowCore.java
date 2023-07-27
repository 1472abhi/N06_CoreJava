package org.tnsif.hirarchicalinheritence;
//child class two
public class snowCore extends Android{
	private int version;
	//parameter constroctor
	
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}

	public snowCore(String brand, String slotType,int version) {
		super(brand, slotType);
		this.version=version;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "snowCore [version=" + version + ", toString()=" + super.toString() + "]";
	}
	

}
