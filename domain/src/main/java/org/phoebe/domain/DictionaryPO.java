package org.phoebe.domain;

/**
 * Created by niefeng on 16/8/19.
 */

import lombok.Data;

/**
 * id int primary key auto_increment,
 dictionary_name varchar(63) not null,
 value varchar(63) not null
 */
@Data
public class DictionaryPO {
    private int id;
    private String dictionaryName;
    private String value;
}
