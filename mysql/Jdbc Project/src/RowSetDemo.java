import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;


public class RowSetDemo {

	
	public static void main(String[] args) {
		
		try
		{
			CachedRowSet rowset=RowSetProvider.newFactory().createCachedRowSet();
			
			rowset.setUrl("jdbc:mysql://localhost:3306/javadb");
			
			rowset.setUsername("root");
			rowset.setPassword("1010");
			
			rowset.setCommand("select * from person");
			
			rowset.execute();
			
			while(rowset.next())
			{
				System.out.println("ID :"+rowset.getInt(1)+" || NAME :"+rowset.getString(2)+" || AGE :"+rowset.getInt(3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
    
}

