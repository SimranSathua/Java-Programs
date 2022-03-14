import java.sql.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
Class.forName("sun.jdbc.odbc.jdbcOdbcDiver");
String filename = "c;/db1.mdb";
String database= "jdbc:odbc:Diver= {Microsoft Access Diver(*.mdb)};DBQ=";
database+= filename.trim()+";DriverID=22;READONLY=true}";
Connection con = DriverManager.getConnection(database,"","");
Statement s= con.createStatement();
s.execute("create table Test 12345(firstcolumn integer)");
s.execute("insert into TEST12345 values(1)");
s.execute("select firstcoloumn from TEST12345");

ResultSet rs = s.getResultSet();
if(rs!=null)
	while (rs.next())
	{
		System.out.println("Data from column_name:" + rs.getString(1));
	}
s.close();
con.close();
		}
		catch(Exception err) {System.out.println("ERROR:"+err);}

}
}
