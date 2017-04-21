package com.baidu.hugegraph.backend.id;

import com.baidu.hugegraph.type.HugeTypes;

public interface Id extends Comparable<Id> {

    public abstract Id prefixWith(HugeTypes type);

    public abstract String asString();

    public abstract long asLong();

    public abstract byte[] asBytes();
}
