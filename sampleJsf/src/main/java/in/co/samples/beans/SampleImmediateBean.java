package in.co.samples.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;

import org.apache.log4j.Logger;

@ManagedBean(name = "sampleImmediateBean")
@ViewScoped
public class SampleImmediateBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7191175819876054785L;

	private Logger LOGGER = Logger.getLogger(SampleImmediateBean.class);

	private String option = "yes";

	private String value;

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String submit() {
		LOGGER.debug("Enter submit.");
		
		LOGGER.debug("Exit submit.");
		
		return "/sampleImmediateSuccessPage.xhtml";
	}
	
	public void optionChanged(ValueChangeEvent event) {
		String oldOption = (String) event.getOldValue();
		String newOption = (String) event.getNewValue();
		LOGGER.info("oldOption = " + oldOption + ", newOption = " + newOption);
	}
}
