package in.co.samples.scope.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 * Created by pkumar on 17/7/17.
 */

@ManagedBean(name = "pageOneBean")
@ViewScoped
public class PageOneBean {
    private String value;

    @ManagedProperty(value = "#{exampleSessionBean}")
    private ExampleSessionBean exampleSessionBean;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ExampleSessionBean getExampleSessionBean() {
        return exampleSessionBean;
    }

    public void setExampleSessionBean(ExampleSessionBean exampleSessionBean) {
        this.exampleSessionBean = exampleSessionBean;
    }

    public String submit(){
        List<String> sampleList = new ArrayList<String>();
        sampleList.add("Pradeep");
        sampleList.add("Padmanaban");
        sampleList.add("Vaseehar");
        sampleList.add("fdsjfosdjfod");
        exampleSessionBean.setSampleList(sampleList);
        exampleSessionBean.setValue(value);
        return "pageTwo.xhtml";
    }
}
