package org.docx4j.wml;

import java.util.List;

/**
 * Content controls (Sdt) contain properties (SdtPr) and content (SdtContent).
 * 
 * In JAXB, there are different Java objects for the content controls, depending on whether they
 * wrap block-level, row-level, cell-level, or run-level content.  Those objects all implement interface SdtElement.
 *  
 * Similarly, there are different Java objects for the SdtContent, depending on whether they
 * wrap block-level, row-level, cell-level, or run-level content.  Those objects all implement this SdtContent interface.
 * 
 * @author jharrop
 * @since 3.3.4
 */
public interface SdtContent {
	
	public List<Object> getContent();

}
