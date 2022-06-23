package pojo;

public class Storage {
	private int id;//病人编号
	private String date;//看病日期
	private int num;//看病次数
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date=date;
	}
	public int getNum(){
		return num;
	}
	public void setNum(int num){
		this.num=num;
	}
}
