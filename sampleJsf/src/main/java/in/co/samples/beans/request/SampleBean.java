package in.co.samples.beans.request;

import in.co.samples.beans.SampleData;
import in.co.samples.beans.session.SampleSessionBean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "sampleBean")
@ViewScoped
public class SampleBean {

	@ManagedProperty(value = "#{sampleSessionBean}")
	private SampleSessionBean sampleSessionBean;

	private String yesNo = "no";

	private double value = 0.0;

	private boolean disabled = true;

	public SampleBean() {
		
	}

	@PostConstruct
	public void init() {
		SampleData sampleData = sampleSessionBean.getSampleData();
		if (sampleData != null) {
			this.yesNo = sampleData.getYesNo();
			this.value = sampleData.getValue();
			if(sampleData.getYesNo().equals("yes")) {
				disabled = false;
			} else {
				disabled = true;
			}
		}
	}
	
	public String getYesNo() {
		return yesNo;
	}

	public void setYesNo(String yesNo) {
		this.yesNo = yesNo;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String submit() {
		System.out.println(yesNo);
		System.out.println(value);
		SampleData sampleData = new SampleData();
		sampleData.setYesNo(yesNo);
		sampleData.setValue(value);
		sampleSessionBean.setSampleData(sampleData);
		return "sampleSuccessPage.xhtml";
	}

	public void valueChanged(ValueChangeEvent event) {
		String newValue = (String) event.getNewValue();
		if (newValue.equals("yes")) {
			disabled = false;
		} else {
			disabled = true;
		}
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public SampleSessionBean getSampleSessionBean() {
		return sampleSessionBean;
	}

	public void setSampleSessionBean(SampleSessionBean sampleSessionBean) {
		this.sampleSessionBean = sampleSessionBean;
	}

}
