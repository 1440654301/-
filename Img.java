package dljy.pojo;

public class Img {
	private int id;
	private String img;
	private Candan cid;
	private String text;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Candan getCid() {
		return cid;
	}
	public void setCid(Candan cid) {
		this.cid = cid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Img(String img, Candan cid, String text) {
		super();
		this.img = img;
		this.cid = cid;
		this.text = text;
	}
	public Img() {
		super();
		// TODO 自动生成的构造函数存根
	}
}
