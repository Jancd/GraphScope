/**
 * Copyright 2020 Alibaba Group Holding Limited.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.maxgraph.compiler.cost;

import com.alibaba.fastjson.JSONArray;
import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;

public class RowField {
    private static RowField EMPTY_ROW_FIELD = new RowField(Sets.newHashSet());

    private Set<String> fieldList = Sets.newHashSet();

    public RowField(String field) {
        this.fieldList.add(field);
    }

    public RowField(Set<String> fieldList) {
        this.fieldList.addAll(fieldList);
    }

    public Set<String> getFieldList() {
        return this.fieldList;
    }

    public static RowField emptyRowField() {
        return EMPTY_ROW_FIELD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RowField rowField = (RowField) o;
        return Objects.equal(fieldList, rowField.fieldList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fieldList);
    }

    @Override
    public String toString() {
        return StringUtils.join(fieldList, ";");
    }
}
