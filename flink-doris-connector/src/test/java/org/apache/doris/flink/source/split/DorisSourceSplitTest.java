// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.flink.source.split;

import org.apache.doris.flink.rest.PartitionDefinition;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class DorisSourceSplitTest {

    @Test
    public void testSplit() {
        PartitionDefinition pd1 =
                new PartitionDefinition("db", "tbl", "be", new HashSet<>(), "queryplan1");
        PartitionDefinition pd2 =
                new PartitionDefinition("db", "tbl", "be", new HashSet<>(), "queryplan1");
        DorisSourceSplit split1 = new DorisSourceSplit("be_1", pd1);
        DorisSourceSplit split2 = new DorisSourceSplit("be_2", pd2);
        Assert.assertEquals(split1, split2);
    }
}
