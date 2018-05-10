package basic1;

public class Bank {
	int getROI() {
		return 0;
	}
}

class SBI extends Bank {
	int getROI() {
		return 8;
	}
}

class ICICI extends Bank {
	int getROI() {
		return 7;
	}
}

class AXIS extends Bank {
	int getROI() {
		return 9;
	}
}
