package org.phoebe.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by niefeng on 20/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        try {
            Reader r = new FileReader("/Users/zoupeng/Downloads/主订单id.txt");
            BufferedReader br = new BufferedReader(r);
            String str = null;
            while((str = br.readLine()) != null) {
                if(StringUtils.isNotBlank(str) && str.length() == "1200673183690260".length()) {
                    sets.add(str);
                }
            }

            System.out.println(sets.size());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

