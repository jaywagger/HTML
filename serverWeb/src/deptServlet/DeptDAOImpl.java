package deptServlet;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import FW.DBUtil;
import deptServlet.DeptDAO;
import deptServlet.DeptDTO;

public class DeptDAOImpl implements DeptDAO{
	//�μ�����ϴ� �۾�
	public int insert(DeptDTO dept) {
		System.out.println("dao���");  
		Connection con = null; 
		PreparedStatement ptmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("insert into mydept "); 
		sql.append("values(?,?,?,?,?)");
		int result = 0;//�޼ҵ� ���� ����� ����� ����
		//�̰� prepared ���� SQL
		try {
			con = DBUtil.getConnect();//DBMS ����
			System.out.println("���Ἲ�� "+con);
			//1. preparedStatement ����
			ptmt = con.prepareStatement(sql.toString());
			System.out.println("SQL�� �����ϱ� ���� ��ü����:"+ptmt);
			//2. ?�� �� ����
			ptmt.setString(1, dept.getDeptNo());
			ptmt.setString(2, dept.getDeptName());
			ptmt.setString(3, dept.getLoc());
			ptmt.setString(4, dept.getTel());
			ptmt.setString(5, dept.getMgr());
			//3. �����ϱ�
			result = ptmt.executeUpdate();
			System.out.println(result+"�� �� ���Լ���");
		}catch(SQLException e) {
			System.out.println("���� ���� "+e.getMessage());
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	//��ü��� ���
	@Override
	public ArrayList<DeptDTO> getDeptList() {
		ArrayList<DeptDTO> deptlist = new ArrayList<DeptDTO>();
		DeptDTO dept = null;//��ȸ�� ���� ���� ��ü. Ÿ�Ը� ���
		String sql = "select * from mydept";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) { //���ڵ带 ��ȸ�ϱ� ���ؼ���
				//1. ��ȸ�� ���ڵ��� �÷��� �о DTO�� ��ȯ�ϴ� �۾�
				dept = new DeptDTO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4), rs.getString(5));
				deptlist.add(dept);
			}
			System.out.println("DAOImpl=>"+deptlist.size());// dept 1�� ���� �� ��ִ���
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,ptmt, con);
		}
		return deptlist;
	}
	
	public int delete(String deptNo) {
		Connection con = null;
		PreparedStatement ptmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("delete from mydept ");
		sql.append("where deptNo = ?");
		int result = 0;
		try {
			con = DBUtil.getConnect();
			System.out.println("���Ἲ�� " + con);
			ptmt = con.prepareStatement(sql.toString());
			System.out.println("SQL�� �����ϱ� ���� ��ü����:" + ptmt);
			ptmt.setString(1, deptNo);
			result = ptmt.executeUpdate();
			System.out.println(result + "�� �� ��������");
		} catch (SQLException e) {
			System.out.println("���� ���� " + e.getMessage());
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		System.out.println(result + "�� �� ��������");
		return result;
	}


}
