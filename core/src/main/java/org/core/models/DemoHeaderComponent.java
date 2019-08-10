package org.core.models;

import com.adobe.cq.sightly.WCMUsePojo;

public class DemoHeaderComponent extends WCMUsePojo {

	private String mobile;
	private String broadband;
	private String myvodafone;
	private String support;

	@Override
	public void activate() throws Exception {
		this.mobile = getProperties().get("mobile", String.class);
		this.broadband = getProperties().get("broadband", String.class);
		this.myvodafone = getProperties().get("myvodafone", String.class);
		this.support = getProperties().get("support", String.class);
	}

	public String getMobile() {
		return mobile;
	}

	public String getBroadband() {
		return broadband;
	}

	public String getMyvodafone() {
		return myvodafone;
	}

	public String getSupport() {
		return support;
	}

}
