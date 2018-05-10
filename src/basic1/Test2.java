package basic1;

public class Test2 {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI ROI:"+s.getROI());
		System.out.println("ICICI ROI:"+i.getROI());
		System.out.println("AXIS ROI:"+a.getROI());

	}

}
