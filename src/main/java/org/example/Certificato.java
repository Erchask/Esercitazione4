package org.example;

public class Certificato {
    private float lca;
    private float carbonFootPrint;
    private float waterFootPrint;

    public Certificato(float lca, float carbonFootPrint, float waterFootPrint) {
        this.lca = lca;
        this.carbonFootPrint = carbonFootPrint;
        this.waterFootPrint = waterFootPrint;
    }

    public float getLca() {
        return lca;
    }

    public float getCarbonFootPrint() {
        return carbonFootPrint;
    }

    public void setLca(float lca) {
        this.lca = lca;
    }

    public void setCarbonFootPrint(float carbonFootPrint) {
        this.carbonFootPrint = carbonFootPrint;
    }

    public void setWaterFootPrint(float waterFootPrint) {
        this.waterFootPrint = waterFootPrint;
    }

    public float getWaterFootPrint() {
        return waterFootPrint;
    }

    @Override
    public String toString() {
        return "Certificato{" +
                "lca=" + lca +
                ", carbonFootPrint=" + carbonFootPrint +
                ", waterFootPrint=" + waterFootPrint +
                '}';
    }
}
