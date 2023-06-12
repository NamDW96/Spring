package DI_06_Spring;

public class Article_service {
	//Article_service 는 ArticleDao 의존한다.
	//Article_service 은 ArticleDao 의 주소가 필요하다.
	
	//주소를 받는 방법 2가지 ( 생성자, setter ) 
	private ArticleDao articledao;
	public Article_service(ArticleDao articledao) { //oracledao, mysqldao 다형성
		this.articledao = articledao;
		System.out.println("Article_service 생성자 호출");
	}
	
	public void write(Article article) {
		this.articledao.insert(article);
	}
	
}
