package dljy.pojo;

public class Article {
	private int id;
	private String article;
	private Candan cid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public Candan getCid() {
		return cid;
	}
	public void setCid(Candan cid) {
		this.cid = cid;
	}
	public Article(String article, Candan cid) {
		super();
		this.article = article;
		this.cid = cid;
	}
	public Article() {
		super();
		// TODO 自动生成的构造函数存根
	}
}
