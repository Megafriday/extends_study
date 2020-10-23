

class Child extends Parent {
	String str = "これは、Childです。";

	@Override
	void sameMethod() {
		System.out.println(str);
	}

	void onlyChild() {
		System.out.println("onlyChild()メソッドです。");
	}
}
