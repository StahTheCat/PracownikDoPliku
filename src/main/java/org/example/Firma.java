package org.example;

public class Firma {

    String companyName;
    String bossName;
    int teamMatesNumber;


    public Firma(String companyName, String bossName, int teamMatesNumber) {
        this.companyName = companyName;
        this.bossName = bossName;
        this.teamMatesNumber = teamMatesNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getBossName() {
        return bossName;
    }

    public int getTeamMatesNumber() {
        return teamMatesNumber;
    }
}
