import java.io.*;
import java.sql.*;
class jdbcsetb1
{
	public static void main(String g[])
	{
		
		int modno;
		String nm="";
		float per;
		ResultSet rs;
		Statement st;
		Connection con;
		PreparedStatement pst1,pst2,pst3,pst4,pst5,pst6,pst7,pst8,pst9,pst10;
		BufferedReader br;
		try
		{
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://localhost/db1","postgres","");
			br=new BufferedReader(new InputStreamReader(System.in));
			
				System.out.println("\n1.Insert\n 2.Modify\n 3.Delete\n 4.Search\n 5.Viewall\n 6.Exit");
								
				 int ch=Integer.parseInt(g[0]);
				switch(ch)
				{
					case 1:
					System.out.println("Model_Number:-");
					int mno=Integer.parseInt(br.readLine());
					
					System.out.println("Model_Name:-");
					String mnm=br.readLine();
					
					System.out.println("Model_color:-");
					String col=br.readLine();
					
					System.out.println("Sim_type:-");
					String sim=br.readLine();
					
					System.out.println("Network_Type:-");
					String net=br.readLine();
					
					System.out.println("Battery_Capacity:-");
					String bat=br.readLine();
					
					System.out.println("Internal Storage:-");
					String inst=br.readLine();
					
					System.out.println("RAM:-");
					String ram=br.readLine();
					
					System.out.println("Processor_Type:-");
					String ptype=br.readLine();
										
					
					pst1=con.prepareStatement("Insert into mobile values(?,?,?,?,?,?,?,?,?)");
					pst1.setInt(1,mno);
					pst1.setString(2,mnm);
					pst1.setString(3,col);
					pst1.setString(4,sim);
					pst1.setString(5,net);
					pst1.setString(6,bat);
					pst1.setString(7,inst);
					pst1.setString(8,ram);
					pst1.setString(9,ptype);
										
					pst1.executeUpdate();
					break;
					
					case 5:
					st=con.createStatement();
					rs=st.executeQuery("select * from mobile");
					while(rs.next())
					{
						System.out.println("Mobile_Number:-"+rs.getInt(1));
						System.out.println("Mobile_Name:-"+rs.getString(2));
						System.out.println("Mobile_color:-"+rs.getString(3));
						System.out.println("Sim_type:-"+rs.getString(4));
						System.out.println("Network_Type:-"+rs.getString(5));
						System.out.println("Battery_Capacity:-"+rs.getString(6));
						System.out.println("Internal Storage:-"+rs.getString(7));
						System.out.println("RAM:-"+rs.getString(8));
						System.out.println("Processor_Type:-"+rs.getString(9));
						System.out.println("");
						
					}
					break;
					case 6:
					System.exit(0);	
					break;
					
					case 3:
					pst2=con.prepareStatement("Delete from mobile where mno=?");
					System.out.println("Enter Model number to be deleted:");
					modno=Integer.parseInt(br.readLine());
					pst2.setInt(1,modno);
					pst2.executeUpdate();
					System.out.println(pst2);
					break;
					
					
					case 2:
					pst3=con.prepareStatement("Update mobile set mname=?  where mno=?");
					System.out.println("Enter Model no of Mobile:");
					int modnum=Integer.parseInt(br.readLine());
					
					System.out.println("Enter mnm:");
					String modnm=br.readLine();
					
					pst3.setString(1,modnm);
					pst3.setInt(2,modnum);
					pst3.executeUpdate();
					System.out.println(pst3);
					break;
					
					case 4:
					pst4=con.prepareStatement("select * from mobile where mno=?");
					
					System.out.println("Enter model no to be searched:");
					modno=Integer.parseInt(br.readLine());
					pst4.setInt(1,modno);
					
					ResultSet rs1=pst4.executeQuery();
					while(rs1.next())
					{
						System.out.println("Mobile_Number:-"+rs1.getInt(1));
						System.out.println("Mobile_Name:-"+rs1.getString(2));
						System.out.println("Mobile_color:-"+rs1.getString(3));
						System.out.println("Sim_type:-"+rs1.getString(4));
						System.out.println("Network_Type:-"+rs1.getString(5));
						System.out.println("Battery_Capacity:-"+rs1.getString(6));
						System.out.println("Internal Storage:-"+rs1.getString(7));
						System.out.println("RAM:-"+rs1.getString(8));
						System.out.println("Processor_Type:-"+rs1.getString(9));
						System.out.println("");
					}
					break;
				}
			
		}
		catch(Exception e){e.printStackTrace();}
		
	}
} 

