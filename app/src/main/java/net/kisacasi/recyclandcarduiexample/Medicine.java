package net.kisacasi.recyclandcarduiexample;

public class Medicine {
    private String medicineName;
    private double medicinePrice;
    private String medicineImage;

    public Medicine() {
    }

    public Medicine(String medicineName, double medicinePrice, String medicineImage) {
        this.medicineName = medicineName;
        this.medicinePrice = medicinePrice;
        this.medicineImage = medicineImage;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public double getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public String getMedicineImage() {
        return medicineImage;
    }

    public void setMedicineImage(String medicineImage) {
        this.medicineImage = medicineImage;
    }
}
