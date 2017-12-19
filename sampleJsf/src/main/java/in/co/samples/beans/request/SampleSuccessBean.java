package in.co.samples.beans.request;

import in.co.samples.beans.session.SampleSessionBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "sampleSuccessBean")
@RequestScoped
public class SampleSuccessBean {

	@ManagedProperty(value = "#{sampleSessionBean}")
	private SampleSessionBean sampleSessionBean;

	public SampleSessionBean getSampleSessionBean() {
		return sampleSessionBean;
	}

	public void setSampleSessionBean(SampleSessionBean sampleSessionBean) {
		this.sampleSessionBean = sampleSessionBean;
	}

	public String back() {

		return "samplePage.xhtml";
	}
}
