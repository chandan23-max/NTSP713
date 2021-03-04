package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmplyeeBo;

public class EmployeeDaoImpl implements EmployeeDao {
	private  static final  String  CUSTOMER_INSERT_QUERY="INSERT INTO EMPLOYEE_REGISTRATION VALUES(EMPNO.NEXTVAL,?,?,?,?)";

	private DataSource ds;
	public EmployeeDaoImpl(DataSource ds) {
		this.ds=ds;
	}
		@Override
		public int insert(EmplyeeBo bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get pooled connection
		con=ds.getConnection();
		//preparede statement object
		ps=con.prepareStatement(CUSTOMER_INSERT_QUERY);
			//set the value into ps
		ps.setString(1,bo.getEname());
		ps.setString(2,bo.getEadd());
		ps.setFloat(3, bo.getEnatsal());
		ps.setFloat(4,bo.getEgrossal());
			count=ps.executeUpdate();
			ps.close();
			con.close();
			return count;
}
}