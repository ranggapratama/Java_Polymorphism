class Pangkat extends AbsPangkat {
    private double angka, pangkat;

    Pangkat(double angka, double pangkat) {
        this.angka = angka;
        this.pangkat = pangkat;
    }

    @Override
    public double pangkat(double angka, double pangkat) {
        if (pangkat == 1) {
            return angka;
        } else {
            return angka * pangkat(angka, pangkat - 1);
        }
    }

    @Override
    public double pangkat() {
        return Math.pow(angka, pangkat);
    }
}
