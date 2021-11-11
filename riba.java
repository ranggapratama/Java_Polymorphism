class riba implements pangkat {
    private double nominal, bunga, lama;

    riba(double nominal, double bunga, double lama) {
        this.nominal = nominal;
        this.bunga = bunga;
        this.lama = lama;
    }

    // METHOD: OVERLOADED
    // Method: Overriding
    @Override
    public double pangkat() {
        return pangkat(nominal, bunga, lama);
    }

    // METHOD: OVERLOADING
    public double pangkat(double nominal, double bunga, double lama) {
        double riba = nominal * Math.pow(1 + bunga / 100.0, lama);
        return riba;
    }
}
