
class Sbi extends Bank{
	int interest=7;

	@Override
	void interest(int money) {
		int totalMoney=money;
		System.out.println("Money:"+totalMoney);
		money=interest*money/100;
		System.out.println("Interest:"+interest);
		System.out.println("Money(with interest):"+(totalMoney+money)+"\n");
	}
}
