package org.phoebe.domain;

/**
 * Created by niefeng on 16/8/19.
 */

/**
 * id int primary key auto_increment,
 dictionary_name varchar(63) not null,
 value varchar(63) not null
 */
public class DictionaryDO {
    private int id;
    private String dictionaryName;
    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
