package br.com.enumeration;

public enum TemperaturaEnum {

    CELSIUS(0, 100),
    KELVIN(273, 373),
    FAHRENHEIT(32, 212);

    private float pontoFusaoH20;
    private float pontoEbulicaoH20;

    TemperaturaEnum(float pontoFusaoH20, float pontoEbulicaoH20) {
        this.pontoFusaoH20 = pontoFusaoH20;
        this.pontoEbulicaoH20 = pontoEbulicaoH20;
    }

    public float getPontoFusaoH20() {
        return pontoFusaoH20;
    }

    public float getPontoEbulicaoH20() {
        return pontoEbulicaoH20;
    }
}
