package com.av;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//replacing web.xml file
public class ReplaceWebXml extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{ReplaceMyMvcXml.class};
	
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] {"/"};
	}
	
}
