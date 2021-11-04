package com.example.model;

public class ThongBao {

    private int thumbTB;
    private String thongBao;
    private String ngay;
    private String gioKham;
    private String time;

    public ThongBao(int thumbTB, String thongBao, String ngay, String gioKham, String time) {
        this.thumbTB = thumbTB;
        this.thongBao = thongBao;
        this.ngay = ngay;
        this.gioKham = gioKham;
        this.time = time;
    }

    public int getThumbTB() {
        return thumbTB;
    }

    public void setThumbTB(int thumbTB) {
        this.thumbTB = thumbTB;
    }

    public String getThongBao() {
        return thongBao;
    }

    public void setThongBao(String thongBao) {
        this.thongBao = thongBao;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getGioKham() {
        return gioKham;
    }

    public void setGioKham(String gioKham) {
        this.gioKham = gioKham;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
