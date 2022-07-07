package com.app.navigationdrawerdemo;

public class customGmailUserData {
    private int gmailProfile;
    private String gmailHeading;
    private String gmailTime;
    private String gmailDescription;

    public customGmailUserData(int gmailProfile, String gmailHeading, String gmailTime, String gmailDescription) {
        this.gmailProfile = gmailProfile;
        this.gmailHeading = gmailHeading;
        this.gmailTime = gmailTime;
        this.gmailDescription = gmailDescription;
    }

    public String getGmailHeading() {
        return gmailHeading;
    }

    public void setGmailHeading(String gmailHeading) {
        this.gmailHeading = gmailHeading;
    }

    public String getGmailDescription() {
        return gmailDescription;
    }

    public void setGmailDescription(String gmailDescription) {
        this.gmailDescription = gmailDescription;
    }

    public String getGmailTime() {
        return gmailTime;
    }

    public void setGmailTime(String gmailTime) {
        this.gmailTime = gmailTime;
    }

    public int getGmailProfile() {
        return gmailProfile;
    }

    public void setGmailProfile(int gmailProfile) {
        this.gmailProfile = gmailProfile;
    }
}
