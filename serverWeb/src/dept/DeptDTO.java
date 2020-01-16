package dept;

public class DeptDTO {
	private String deptNo;
	private String deptName;
	private String loc;
	private String tel;
	private String mgr;
	
	public DeptDTO() {
	}
	//delete
	public DeptDTO(String deptNo) {
		this.deptNo = deptNo;
	}
	//insert¿ë
	public DeptDTO(String deptNo, String deptName, String loc, String tel, String mgr) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.loc = loc;
		this.tel = tel;
		this.mgr = mgr;
	}
	
	@Override
	public String toString() {
		return "DeptDTO [deptNo=" + deptNo + ", deptName=" + deptName + ", loc=" + loc + ", tel=" + tel + ", mgr=" + mgr
				+ "]";
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

}
