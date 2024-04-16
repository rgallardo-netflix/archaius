package com.netflix.archaius.instrumentation;

import java.util.HashMap;
import java.util.Map;

/** Instrumentation data snapshot for usages captured since the last flush. */
public class PropertiesInstrumentationData {
    private final Map<String, PropertyUsageData> idToUsageDataMap;
    private final Map<String, String> scopes;

    public PropertiesInstrumentationData(Map<String, PropertyUsageData> idToUsageDataMap) {
        this.idToUsageDataMap = idToUsageDataMap;
        scopes = new HashMap<>();
    }

    public PropertiesInstrumentationData(Map<String, PropertyUsageData> idToUsageDataMap, Map<String, String> scopes) {
        this.idToUsageDataMap = idToUsageDataMap;
        this.scopes = scopes;
    }

    public Map<String, PropertyUsageData> getIdToUsageDataMap() {
        return idToUsageDataMap;
    }

    public Map<String, String> getScopes() {
        return scopes;
    }
}
