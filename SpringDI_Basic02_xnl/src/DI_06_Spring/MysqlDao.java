package DI_06_Spring;

public class MysqlDao implements ArticleDao{

	@Override
	public void insert(Article article) {
		// TODO Auto-generated method stub
		System.out.println("mysql insert");
	}

}
