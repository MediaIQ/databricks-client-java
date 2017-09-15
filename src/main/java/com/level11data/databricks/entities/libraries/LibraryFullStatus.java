package com.level11data.databricks.entities.libraries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LibraryFullStatus {
    public enum LibraryInstallStatus {
        PENDING, RESOLVING, INSTALLING, INSTALLED, FAILED, UNINSTALL_ON_RESTART
    }

    @JsonProperty("library")
    public Library Library;

    @JsonProperty("status")
    public LibraryInstallStatus Status;

    @JsonProperty("messages")
    public String[] Messages;

    @JsonProperty("is_library_for_all_clusters")
    public Boolean IsLibraryForAllClusters;



}
