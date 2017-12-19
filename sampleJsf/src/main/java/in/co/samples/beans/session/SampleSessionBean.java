package in.co.samples.beans.session;

import in.co.samples.beans.SampleData;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "sampleSessionBean")
@SessionScoped
public class SampleSessionBean {

	private SampleData sampleData;

	public SampleSessionBean() {
	}

	public SampleData getSampleData() {
		return sampleData;
	}

	public void setSampleData(SampleData sampleData) {
		this.sampleData = sampleData;
	}

}
