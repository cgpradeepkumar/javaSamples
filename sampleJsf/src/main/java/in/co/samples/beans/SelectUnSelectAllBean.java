package in.co.samples.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

@ManagedBean(name = "selectUnSelectAllBean")
@ViewScoped
public class SelectUnSelectAllBean {

	private List<MemberData> memberDataList;

	private boolean selected = true;

	private String buttonLabel = "Select All";
	
	private static Logger LOGGER = Logger.getLogger(SelectUnSelectAllBean.class);

	public SelectUnSelectAllBean() {
		memberDataList = new ArrayList<MemberData>();
		MemberData memberData1 = new MemberData("Pradeep", "", false);
		MemberData memberData2 = new MemberData("Vaseehar", "", false);

		memberDataList.add(memberData1);
		memberDataList.add(memberData2);
	}

	public List<MemberData> getMemberDataList() {
		return memberDataList;
	}

	public void setMemberDataList(List<MemberData> memberDataList) {
		this.memberDataList = memberDataList;
	}

	public void selectAll() {
		for (MemberData memberData : memberDataList) {
			memberData.setSelected(!memberData.isSelected());
		}

		setSelected(!selected);
		
		if (buttonLabel.equals("Select All")) {
			buttonLabel = "unselect All";
		} else {
			buttonLabel = "Select All";
		}
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getButtonLabel() {
		return buttonLabel;
	}

	public void setButtonLabel(String buttonLabel) {
		this.buttonLabel = buttonLabel;
	}
	
	public void submit() {
		LOGGER.info("submit action...");
	}

}
