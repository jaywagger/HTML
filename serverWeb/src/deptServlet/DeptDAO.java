package deptServlet;

import java.util.ArrayList;

import deptServlet.DeptDTO;

public interface DeptDAO {
	//public�� �����Ѵ�. Interface ��ü�� public abstract�̴� 
	int insert(DeptDTO dept); //�μ����
	int delete(String deptNo); //�μ����
	ArrayList<DeptDTO> getDeptList(); 
}
