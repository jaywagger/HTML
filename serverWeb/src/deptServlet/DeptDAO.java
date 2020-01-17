package deptServlet;

import java.util.ArrayList;

import deptServlet.DeptDTO;

public interface DeptDAO {
	//public은 생략한다. Interface 자체가 public abstract이다 
	int insert(DeptDTO dept); //부서등록
	int delete(String deptNo); //부서등록
	ArrayList<DeptDTO> getDeptList(); 
}
