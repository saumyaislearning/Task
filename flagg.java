package springmvc.controller;

import java.util.List;

public class flagg {

	
	  private List<String> flag;

	public List<String> getFlag() {
		return flag;
	}

	public void setFlag(List<String> flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "flagg [flag=" + flag + "]";
	}
	  
}
