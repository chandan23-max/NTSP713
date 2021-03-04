package com.nt.service;

import com.nt.bo.EmplyeeBo;
import com.nt.dao.EmployeeDao;
import com.nt.dto.EmployeeDto;

public class EmployeeServiceImpl implements EmployeeServ {
	private static final String query="INSERT INTO EMPLOYEE_REGISTRATION VALUES(EMPNO.NEXTVAL,?,?,?,?)";
	  private EmployeeDao dao;
	    public EmployeeServiceImpl(EmployeeDao dao) {
			this.dao=dao;
		}
		@Override
		public String Register_Employee(EmployeeDto dto) throws Exception {
			float total=0.0f;
			EmplyeeBo bo=null;
			int count =0;
			//callculate the grosssal and netsal;
			total=dto.getEnatsal()+dto.getEgrossal();
			//prepare the customer object having
			bo=new EmplyeeBo();
			bo.setEname(dto.getEname());
			bo.setEadd(dto.getEadd());
			bo.setEnatsal(dto.getEnatsal());
			bo.setEgrossal(dto.getEgrossal());
			//insert the value on bo
			count=dao.insert(bo);
			if(count==0)
				return "Registration Failed::"+"Total Salary::"+total;
			else
				return "Registration Successed::"+"Total Salary::"+total;
		}

	}


