class D {
	public static void main (String[] args) {
		B a0 = new B(); //
		a0.m1();  // am1 5
		a0.m2(16); //bm2y 16
		A b0 = new B();
		System.out.println(b0.x); // 5
		b0.m1(); //am1 5
		b0.m2(); //bm2 5
//		b0.m2(61); m2(int) not in static type of b0
		B b1 = new B();
		b1.m2(61); //bm2y 61
		b1.m3(); //bm3 called
		A c0 = new C(); 
		c0.m2(); //cm2 5
		// C c1 = (A) new C(); 
		A a1 = (A) c0; 
		C c2 = (C) a1;
		c2.m3(); // bm3 called
//		c2.m4(); // cm4 5
		c2.m5(); //cm5 6
		((C) c0).m3(); //bm3 called
//		(C) c0.m3();
		b0.update();
		b0.m1(); //am1 99

	} 
}