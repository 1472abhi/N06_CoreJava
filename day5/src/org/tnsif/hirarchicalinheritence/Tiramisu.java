package org.tnsif.hirarchicalinheritence;

public class Tiramisu extends Android{
	//private data members
	private int version;
	//parameter constroctor
	
	
	
	public Tiramisu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version=version;
		// TODO Auto-generated constructor stub
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	

}
