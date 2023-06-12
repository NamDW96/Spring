package DI_06_Spring;

public class OracleDao implements ArticleDao {

	@Override
	public void insert(Article article) {
		// TODO Auto-generated method stub
		System.out.println("oracle insert");
	}
	
}
