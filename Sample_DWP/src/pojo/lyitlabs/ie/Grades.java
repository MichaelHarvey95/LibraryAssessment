package pojo.lyitlabs.ie;

public class Grades {
	private int studentid = 1234;
	private String moduleid = "ENTPERF";
	private double grade = 0.0;
	
	public double getGrade() 
	{
		return grade;
	}
	public void setGrade(double grade) 
	{
		this.grade = grade;
	}
	
	public int getStudentid() 
	{
		return studentid;
	}
	public String getModuleid() 
	{
		return moduleid;
	}
}
