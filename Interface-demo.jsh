interface Interface1{
	void doJob1();
}

interface Interface2{
	void doJob2();
}

interface Interface3 extends Interface1, Interface2{
	void doJob3();
}