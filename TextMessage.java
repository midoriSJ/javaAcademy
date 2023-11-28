package day17;

public class TextMessage {
	private int msgNum;
	private String msg;
	
	public TextMessage(int msgNum, String msg) {
		this.msgNum = msgNum;
		this.msg = msg;
	}
	
	public int getmsgNum() {
		return msgNum;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public int hashCode() {
		return msgNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TextMessage) {
			TextMessage cmp = (TextMessage) obj;
			
			if(this.msg.equals(cmp.getMsg())) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}
