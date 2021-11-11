class AkarPangkat implements pangkat {
    private double angka;
    private double pangkat;

    AkarPangkat(double angka, double pangkat) {
        this.angka = angka;
        this.pangkat = pangkat;
    }

    // Method: Overriding
    @Override
    public double pangkat() {
        return Math.round(Math.pow(angka, 1.0 / pangkat));
    }
}
