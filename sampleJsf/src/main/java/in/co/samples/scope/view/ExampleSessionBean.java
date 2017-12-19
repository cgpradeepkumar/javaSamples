package in.co.samples.scope.view;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by pkumar on 17/7/17.
 */
@ManagedBean(name = "exampleSessionBean")
@SessionScoped
public class ExampleSessionBean {

    private List<String> sampleList;

    private String value = "";

    public List<String> getSampleList() {
        return sampleList;
    }

    public void setSampleList(List<String> sampleList) {
        this.sampleList = sampleList;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
