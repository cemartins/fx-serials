package org.juffrou.fx.seraials;

import javafx.beans.property.Property;

import org.juffrou.fx.seraials.dom.Person;
import org.juffrou.fx.serials.FxSerialsContext;
import org.juffrou.fx.serials.core.FxSerialsProxyBuilder;
import org.junit.Test;

public class FxSerialsProxyBuilderTestCase {

	@Test
	public void test() {
		FxSerialsProxyBuilder proxyBuilder = new FxSerialsProxyBuilder();
			Class<?> buildFXSerialsProxyClass;
			try {
				buildFXSerialsProxyClass = proxyBuilder.buildFXSerialsProxy(Person.class, Person.serialVersionUID);
				Object proxy = buildFXSerialsProxyClass.newInstance();
				Property<String> property = (Property<String>) FxSerialsContext.getProperty(proxy, "name");
				property.setValue("Carlos");
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
