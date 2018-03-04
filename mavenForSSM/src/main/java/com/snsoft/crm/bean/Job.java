package com.snsoft.crm.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("job")
public class Job {
	private String jobName;
	private Integer salary;

	public Job() {
		System.out.println("调用Job空参构造方法");
	}

	public String getJobName() {
		return jobName;
	}
	@Value("Manager")
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public Integer getSalary() {
		return salary;
	}
	@Value(value="10000")
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Job [jobName=" + jobName + ", salary=" + salary + "]";
	}
}
