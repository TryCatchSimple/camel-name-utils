package org.crazycake.utils;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CamelNameUtilsTest {

	@Test
	public void testCamel2underscore() {
		String underscoreName = CamelNameUtils.camel2underscore("AaaBbb");
		assertThat(underscoreName, is("aaa_bbb"));
	}

	@Test
	public void testUnderscore2camel() {
		String camelName = CamelNameUtils.underscore2camel("user_name");
		assertThat(camelName,is("userName"));
	}

	@Test
	public void testCapitalize() {
		String capitalName = CamelNameUtils.capitalize("student");
		assertThat(capitalName,is("Student"));
	}

}
