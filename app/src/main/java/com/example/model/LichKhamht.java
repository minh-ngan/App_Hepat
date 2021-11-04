package com.example.model;

public class LichKhamht {
    private String hospitalName,hospitalTime,hospitalDate,hospitalXN;
    private int hositalThumb;

    public LichKhamht(String hospitalName, String hospitalTime, String hospitalDate, String hospitalXN, int hositalThumb) {
        this.hospitalName = hospitalName;
        this.hospitalTime = hospitalTime;
        this.hospitalDate = hospitalDate;
        this.hospitalXN = hospitalXN;
        this.hositalThumb = hositalThumb;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalTime() {
        return hospitalTime;
    }

    public void setHospitalTime(String hospitalTime) {
        this.hospitalTime = hospitalTime;
    }

    public String getHospitalDate() {
        return hospitalDate;
    }

    public void setHospitalDate(String hospitalDate) {
        this.hospitalDate = hospitalDate;
    }

    public String getHospitalXN() {
        return hospitalXN;
    }

    public void setHospitalXN(String hospitalXN) {
        this.hospitalXN = hospitalXN;
    }

    public int getHositalThumb() {
        return hositalThumb;
    }

    public void setHositalThumb(int hositalThumb) {
        this.hositalThumb = hositalThumb;
    }
}
