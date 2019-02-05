package org.northernconnection.refactoring;

import java.util.HashMap;

class Sheet {

    private HashMap<String, String> map;

    Sheet() {
        this.map = new HashMap<>();
    }

    String get(String theCell) {
        String content = this.map.get(theCell);
        return content != null ? content : "";
    }

    void put(String theCell, String content) {
        this.map.put(theCell, content);
    }
}
