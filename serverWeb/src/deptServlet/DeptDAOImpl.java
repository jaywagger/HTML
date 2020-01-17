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
	//부서등록하는 작업
	public int insert(DeptDTO dept) {
		System.out.println("dao출력");  
		Connection con = null; 
		PreparedStatement ptmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("insert into mydept "); 
		sql.append("values(?,?,?,?,?)");
		int result = 0;//메소드 실행 결과가 저장될 변수
		//이게 prepared 동적 SQL
		try {
			con = DBUtil.getConnect();//DBMS 연결
			System.out.println("연결성공 "+con);
			//1. preparedStatement 생성
			ptmt = con.prepareStatement(sql.toString());
			System.out.println("SQL을 실행하기 위한 객체정보:"+ptmt);
			//2. ?에 값 전달
			ptmt.setString(1, dept.getDeptNo());
			ptmt.setString(2, dept.getDeptName());
			ptmt.setString(3, dept.getLoc());
			ptmt.setString(4, dept.getTel());
			ptmt.setString(5, dept.getMgr());
			//3. 실행하기
			result = ptmt.executeUpdate();
			System.out.println(result+"개 행 삽입성공");
		}catch(SQLException e) {
			System.out.println("연결 실패 "+e.getMessage());
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	//전체목록 출력
	@Override
	public ArrayList<DeptDTO> getDeptList() {
		ArrayList<DeptDTO> deptlist = new ArrayList<DeptDTO>();
		DeptDTO dept = null;//조회한 글을 담을 객체. 타입만 명시
		String sql = "select * from mydept";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			while(rs.next()) { //레코드를 조회하기 위해서는
				//1. 조회한 레코드의 컬럼을 읽어서 DTO로 변환하는 작업
				dept = new DeptDTO(rs.getString(1), rs.getString(2), 
						rs.getString(3), rs.getString(4), rs.getString(5));
				deptlist.add(dept);
			}
			System.out.println("DAOImpl=>"+deptlist.size());// dept 1개 줄이 총 몇개있는지
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
			System.out.println("연결성공 " + con);
			ptmt = con.prepareStatement(sql.toString());
			System.out.println("SQL을 실행하기 위한 객체정보:" + ptmt);
			ptmt.setString(1, deptNo);
			result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삭제성공");
		} catch (SQLException e) {
			System.out.println("연결 실패 " + e.getMessage());
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		System.out.println(result + "개 행 삭제성공");
		return result;
	}


}
