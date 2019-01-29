package com.codecool;

import java.util.List;

public abstract class Value {
    private boolean selectionType;

    public List<String> getInputPattern() {
        throw new UnsupportedOperationException();
    }

    public boolean getSelectionType() {
        return this.selectionType;
    }
}
