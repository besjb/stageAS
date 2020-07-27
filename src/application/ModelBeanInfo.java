package application;

import java.beans.BeanDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ModelBeanInfo extends SimpleBeanInfo{
	
	private static final BeanDescriptor beanDescriptor = new BeanDescriptor(ModelBeanInfo.class);
    private static PropertyDescriptor[] propDescriptors;
    
    static {
        beanDescriptor.setDisplayName("Model Bean");
    }

    @Override
    public BeanDescriptor getBeanDescriptor() {
        return beanDescriptor;
    }

    @Override
    public int getDefaultPropertyIndex() {
        return 0;
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        if (propDescriptors == null) {
            propDescriptors = new PropertyDescriptor[4];
            try {
                propDescriptors[0] = new PropertyDescriptor("text", Model.class);
                propDescriptors[0].setDisplayName("text");
                propDescriptors[1] = new PropertyDescriptor("number", Model.class);
                propDescriptors[1].setDisplayName("number");
                propDescriptors[2] = new PropertyDescriptor("bool", Model.class);
                propDescriptors[2].setDisplayName("bool");
                propDescriptors[3] = new PropertyDescriptor("date", Model.class);
                propDescriptors[3].setDisplayName("date");
            } catch (IntrospectionException ex) {
                ex.printStackTrace();
            }
        }
        return propDescriptors;
    }

}
