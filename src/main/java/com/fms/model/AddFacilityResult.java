package com.fms.model;

import com.fms.Utility;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jdk.jshell.execution.Util;

public class AddFacilityResult {
    public AddFacilityResult(String errorMessage, Facility facility) {
        this.errorMessage = errorMessage;
        this.facility = facility;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Facility getFacility() {
        return facility;
    }

    public String toString() {
        GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
        Gson gson = builder.create();
        return gson.toJson(this);
    }

    private String errorMessage;
    private Facility facility;

}
