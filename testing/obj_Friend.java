
public class obj_Friend {
	static String name;
	static int friend_QTY;
	//int friend_QTY;    //沒static=沒共享記憶體 displayQTY不會累加
	obj_Friend(String str_name) {
		name=str_name;
		friend_QTY++;
	}
	void displayQTY() {
		System.out.println("obj_Friend:" + friend_QTY);
	}
}	
