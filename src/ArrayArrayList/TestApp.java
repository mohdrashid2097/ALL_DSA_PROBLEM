package ArrayArrayList;

class TestApp{
	public static void main(String[] args) {
		CopyConstrcutorAPP p1 = new CopyConstrcutorAPP("rashid",27);
		
		CopyConstrcutorAPP p2 = new CopyConstrcutorAPP(p1);
		
		p1.display();
		p2.display();
	}
}

