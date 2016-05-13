package com.roamdata.mavenHelloWorld.dao.wsapi6;

/**
 * Created by j on 5/13/16.
 */
public class Apiws6LoginResponse {

    String organizationId;
    String terminalId;
    String storeId;
    String chainId;

    Wsapi6Configuration configuration;

    public String getOrganizationId() {
        return organizationId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public String getStoreId() {
        return storeId;
    }

    public String getChainId() {
        return chainId;
    }

    public Wsapi6Configuration getConfiguration() {
        return configuration;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public void setConfiguration(Wsapi6Configuration configuration) {
        this.configuration = configuration;
    }
}
