package com.constantcontact.v2.contacts;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author woogienoogie
 */
public class CustomFieldTest {
    private static final String LABEL = "green";

    private static final String NAME = "Hungry";

    private static final String VALUE = "No";

    static final CustomField createCustomField() {
        CustomField customField = new CustomField();
        customField.setLabel(LABEL);
        customField.setName(NAME);
        customField.setValue(VALUE);
        return customField;
    }

    @Test
    public void expectThatGettingAndSettingValues_WillReturnSame() {
        CustomField customField = new CustomField();

        customField.setLabel(LABEL);
        customField.setName(NAME);
        customField.setValue(VALUE);

        runAssertions(customField);
    }

    @Test
    public void expectThatSerializing_WillRetainValues() {
        CustomField customField = new CustomField();
        customField.setLabel(LABEL);
        customField.setName(NAME);
        customField.setValue(VALUE);

        CustomField out = SerializationUtils.roundtrip(customField);

        runAssertions(out);
    }

    @Test
    public void testEqualsAndHash() {
        CustomField customField1 = new CustomField();
        customField1.setLabel(LABEL);
        customField1.setName(NAME);
        customField1.setValue(VALUE);
        CustomField customField2 = new CustomField();
        customField2.setLabel(LABEL);
        customField2.setName(NAME);
        customField2.setValue(VALUE);

        int hash1 = customField1.hashCode();
        int hash2 = customField2.hashCode();

        assertThat(customField1.equals(customField2), is(true));
        assertThat(hash1 == hash2, is(true));
    }

    static void runAssertions(CustomField customField) {
        assertThat(customField.getLabel(), is(LABEL));
        assertThat(customField.getName(), is(NAME));
        assertThat(customField.getValue(), is(VALUE));
    }
}
