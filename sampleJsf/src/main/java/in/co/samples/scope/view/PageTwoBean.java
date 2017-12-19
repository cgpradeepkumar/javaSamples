package in.co.samples.scope.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Created by pkumar on 17/7/17.
 */
@ManagedBean(name = "pageTwoBean")
@RequestScoped
public class PageTwoBean {

    @ManagedProperty(value = "#{exampleSessionBean}")
    private ExampleSessionBean exampleSessionBean;

    public ExampleSessionBean getExampleSessionBean() {
        return exampleSessionBean;
    }

    public void setExampleSessionBean(ExampleSessionBean exampleSessionBean) {
        this.exampleSessionBean = exampleSessionBean;
    }

    public String getTitle() {
        return exampleSessionBean.getValue();
    }
}
