package homework;

public class Mobile {

	public void sendMessage() {
		System.out.println("sendMessage");
		}
		public void sendDocument() {
		System.out.println("sendDocument");
		}
		public void call() {
		System.out.println("call");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Mobile mob=new Mobile();
			mob.sendMessage();
			mob.sendDocument();
			mob.call();
			

}
}