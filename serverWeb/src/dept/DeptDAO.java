package dept;

import java.util.ArrayList;

import dept.DeptDTO;

public interface DeptDAO {
	//public�� �����Ѵ�. Interface ��ü�� public abstract�̴� 
	int insert(DeptDTO dept); //�μ����
	int delete(String deptNo); //�μ����
	ArrayList<DeptDTO> getDeptList(); 
}
