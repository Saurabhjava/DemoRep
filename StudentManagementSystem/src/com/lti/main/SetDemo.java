package com.lti.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Project {
	private String name;
	public Project(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
	public int hashCode() {
		return name.length();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class SetDemo {

	public static void main(String[] args) {
		Set<Project> s=new LinkedHashSet<Project>();
		s.add(new Project("BFSI"));
		s.add(new Project("MLI"));
		s.add(new Project("BFSL"));
		s.add(new Project("MLP"));
		for(Project p:s)
			System.out.println(p);

	}

}
