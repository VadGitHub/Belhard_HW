package com.company.professions;

public class Driver {
    private String fName, sName, mName;
    private int driveExp;

    public String getFullName() {
        return getsName() + " " + getfName() + " " + getmName();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getDriveExp() {
        return driveExp;
    }

    public void setDriveExp(int driveExp) {
        this.driveExp = driveExp;
    }
}
