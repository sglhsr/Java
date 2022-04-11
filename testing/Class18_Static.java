
public class Class18_Static {
	/*
	static關鍵字可以讓程式被OS載入時就被儲存於記憶體中，
	直到Application結束為止
	可以共享記憶體，相對較節省記憶體。但事情總是有兩面性的，
	也因為共享記憶體，所以要特別注意存取權限以及存取時機，
	例如：通常不會在建構式中設定靜態變數，以免造成其他程式誤取

	要共享變數時用static, 只會呼叫一次直到程式結束
   */
	
	public static void main(String[] args) {
		obj_Friend f1=new obj_Friend("Sponegbob");
		obj_Friend f2=new obj_Friend("Patrick");
		obj_Friend f3=new obj_Friend("Squidward");
		obj_Friend f4=new obj_Friend("Sandy");
//		System.out.println(f1.friend_QTY);
//		System.out.println(f2.name);
//		System.out.println(f2.friend_QTY);
//		System.out.println(f4.friend_QTY);
		f1.displayQTY();
	}

}
