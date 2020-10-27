

class Main {
	public static void main(String[] args) {
		Parent parent = new Child();
		System.out.println(parent.str); 	       // これは、Parentです。
		parent.sameMethod();				// これは、Childです。
		// parent.onlyChild();		    		   // コンパイルエラー
		parent.onlyParent();				   // onlyParent()メソッドです。


		System.out.println("--------------------------------------");


		Child child = new Child();
		System.out.println(child.str);			// これは、Childです。
		child.sameMethod();				 // これは、Childです。
		child.onlyChild(); 				     // onlyChild()メソッドです。
		child.onlyParent(); 				    // onlyParent()メソッドです。

	}
}
