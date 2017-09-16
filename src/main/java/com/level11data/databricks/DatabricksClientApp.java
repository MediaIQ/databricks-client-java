package com.level11data.databricks;

import com.level11data.databricks.cluster.Cluster;
import com.level11data.databricks.config.DatabricksClientConfiguration;

import java.io.InputStream;


public class DatabricksClientApp {

    public static final String CLIENT_CONFIG_RESOURCE_NAME = "databricks-client.properties";

    public static void main(String[] args) {
        System.out.println("DatabricksClient- Begin Reading Resource");

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream resourceStream = loader.getResourceAsStream(CLIENT_CONFIG_RESOURCE_NAME);
        if(resourceStream == null) {
            throw new IllegalArgumentException("Resource Not Found: " + CLIENT_CONFIG_RESOURCE_NAME);
        }

        System.out.println("Resource Loaded...");
        try {
            DatabricksClientConfiguration databricksConfig = new DatabricksClientConfiguration(resourceStream);
            DatabricksSession databricks = new DatabricksSession(databricksConfig);

            Cluster activeCluster =  databricks.getCluster("0915-135955-saws3");

            System.out.println("Executors: " + activeCluster.getExecutors().size());


            System.out.println("Username: " + databricksConfig.getClientUsername());
            System.out.println("URL: " + databricksConfig.getClientUrl());

            System.out.println("Default Spark Version: " + databricks.getDefaultSparkVersion());
            System.out.println("Default Node Type: " + databricks.getDefaultNodeType());

            System.out.println("Spark Versions: " + databricks.getSparkVersions().toString());

            Cluster firstCluster = databricks.listClusters().next();
            System.out.println(firstCluster.Name);
            System.out.println(firstCluster.CreatorUserName);
            System.out.println(firstCluster.CreatedBy);
            System.out.println(firstCluster.NodeType);
            System.out.println(firstCluster.DriverNodeType);
        } catch (Exception e) {
            System.out.println("Error Exception Thrown: "+ e);
            e.printStackTrace();
        }

        //ClustersClient clusterClient = new ClustersClient(databricksConfig);

        //System.out.println(clusterClient.getSparkVersions().toString());
        //System.out.println(clusterClient.getNodeTypes().toString());
        //System.out.println(clusterClient.getZones().toString());

        //ClustersDTO clusters = clusterClient.listClusters();
        //System.out.println("Number of ClustersDTO: "+clusters.ClustersDTO.length);
        //ClusterInfoDTO cluster = clusters.ClustersDTO[1];
        //System.out.println("Cluster JSON: " + cluster.toString());

        //ClusterInfoDTO myCluster = clusterClient.getCluster("0711-051536-vogue137");
        //System.out.println("MyCluster JSON: " + myCluster.toString());

        //try starting a running cluster - got a 404
        //clusterClient.delete("0711-051536-vogue137");




    }
}