
public class obj_Friend {
	static String name;
	static int friend_QTY;
	//int friend_QTY;    //�Sstatic=�S�@�ɰO���� displayQTY���|�֥[
	obj_Friend(String str_name) {
		name=str_name;
		friend_QTY++;
	}
	void displayQTY() {
		System.out.println("obj_Friend:" + friend_QTY);
	}
}	
