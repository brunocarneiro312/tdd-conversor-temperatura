package br.com.service.impl;

import br.com.enumeration.TemperaturaEnum;
import br.com.service.Conversor;

import java.math.BigDecimal;

/**
 * Classe que implementa um conversor de temperatura contendo todas as escalas
 * (CELSIUS, KELVIN, FAHREINHEIT)
 *
 * @author bruno.carneiro
 */
public class ConversorImpl implements Conversor {

    private Float grau;
    private TemperaturaEnum escalaOrigem;
    private TemperaturaEnum escalaDestino;

    static final String CELSIUS = "CELSIUS";
    static final String KELVIN = "KELVIN";
    static final String FAHRENHEIT = "FAHRENHEIT";

    public Conversor converter(Float grau) {
        setGrau(grau);
        return this;
    }

    public ConversorImpl de(TemperaturaEnum escala) {
        setEscalaOrigem(escala);
        return this;
    }

    public ConversorImpl para(TemperaturaEnum escala) {
        setEscalaDestino(escala);
        return this;
    }

    public Float calcular() {

        // Se for a mesma escala, retorna grau.
        if (getEscalaOrigem().toString() == getEscalaDestino().toString()) {
            return grau;
        }

        // Converter à partir de Celsius
        if (getEscalaOrigem().toString() == CELSIUS) {

            if (getEscalaDestino().toString() == KELVIN) {
                return celsiusParaKelvin(grau);
            }

            if (getEscalaDestino().toString() == FAHRENHEIT) {
                return celsiusParaFahrenheit(grau);
            }

        }

        // Converter à partir de Kelvin
        if (getEscalaOrigem().toString() == KELVIN) {

            if (getEscalaDestino().toString() == CELSIUS) {
                return kelvinParaCelsius(grau);
            }

            if (getEscalaDestino().toString() == FAHRENHEIT) {
                return kelvinParaFahreinheit(grau);
            }

        }

        // Converter à partir de fahreinheit
        if (getEscalaOrigem().toString() == FAHRENHEIT) {

            if (getEscalaDestino().toString() == CELSIUS) {
                return fahreinheitParaCelsius(grau);
            }

            if (getEscalaDestino().toString() == KELVIN) {
                return fahreinheitParaKelvin(grau);
            }
        }

        return 0F;
    }

    /**
     * ========
     * FORMULAS
     * ========
     */
    private Float celsiusParaKelvin(Float grauEmCelcius) {
        return grauEmCelcius + 273.15F;
    }

    private Float celsiusParaFahrenheit(Float grauEmCelsius) {
        return (grau * 9/5 + 32);
    }

    private Float kelvinParaCelsius(Float grauEmKelvin) {
        return grau - 273.15F;
    }

    private Float kelvinParaFahreinheit(Float grauEmKelvin) {
        BigDecimal result = new BigDecimal((grau - 273.15F) * 9/5 + 32);
        result = result.setScale(2, BigDecimal.ROUND_HALF_UP);
        return result.floatValue();
    }

    private Float fahreinheitParaCelsius(Float grauEmFahreinheit) {
        BigDecimal result = new BigDecimal((grau - 32) * 5/9);
        result = result.setScale(2, BigDecimal.ROUND_UP);
        return result.floatValue();
    }

    private Float fahreinheitParaKelvin(Float grauEmFahreinheit) {
        BigDecimal result = new BigDecimal((grau - 32) * 5/9 + 273.15F);
        result = result.setScale(2, BigDecimal.ROUND_HALF_UP);
        return result.floatValue();
    }

    /**
     * ===============
     * GETTER / SETTER
     * ===============
     */
    public Float getGrau() {
        return grau;
    }

    public void setGrau(Float grau) {
        this.grau = grau;
    }

    public TemperaturaEnum getEscalaOrigem() {
        return escalaOrigem;
    }

    public void setEscalaOrigem(TemperaturaEnum escalaOrigem) {
        this.escalaOrigem = escalaOrigem;
    }

    public TemperaturaEnum getEscalaDestino() {
        return escalaDestino;
    }

    public void setEscalaDestino(TemperaturaEnum escalaDestino) {
        this.escalaDestino = escalaDestino;
    }
}
