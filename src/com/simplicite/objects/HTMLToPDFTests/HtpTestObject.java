package com.simplicite.objects.HTMLToPDFTests;

import com.simplicite.util.AppLog;
import com.simplicite.util.PrintTemplate;
import com.simplicite.util.tools.HTMLToPDFTool;
import com.simplicite.util.tools.HTTPTool;

/**
 * Test object for HTML to PDF publication examples
 */
public class HtpTestObject extends com.simplicite.util.ObjectDB {
	private static final long serialVersionUID = 1L;
	
	public Object publication1(PrintTemplate pt) {
		try {
			pt.setMIMEType(HTTPTool.MIME_TYPE_PDF);
			return HTMLToPDFTool.toPDF(pt.fillTemplate(this, pt.getTemplate(true), getCurrentList()));
		} catch (Throwable e) {
			AppLog.error(e.getMessage(), e, getGrant());
			pt.setMIMEType(HTTPTool.MIME_TYPE_TXT);
			return e.getMessage();
		}
	}
	
	/**
	 * Unit tests method
	 */
	@Override
	public String unitTests() {
		try {
			return toHTML();
		} catch (Exception e) {
			AppLog.error(null, e, getGrant());
			return e.getMessage();
		}
	}
}
