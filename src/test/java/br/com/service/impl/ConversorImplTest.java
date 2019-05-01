package br.com.service.impl;

import br.com.enumeration.TemperaturaEnum;
import br.com.service.Conversor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Testa métodos de conversão de temperatura de diferentes escalas
 *
 * @author bruno.carneiro
 */
public class ConversorImplTest {

    @Test
    public void converterDeCelciusParaCelcius() {

        // given
        Conversor conversor = new ConversorImpl();
        Float grauEmCelcius = 100F;

        // when
        conversor.converter(grauEmCelcius)
                .de(TemperaturaEnum.CELSIUS)
                .para(TemperaturaEnum.CELSIUS)
                .calcular();

        // then
        Assert.assertNotNull(grauEmCelcius);
        Assert.assertEquals(new Float(100F), grauEmCelcius);

    }

    @Test
    public void converterDeCelciusParaKelvin() {

        // given
        Conversor conversor = new ConversorImpl();
        Float grauEmCelcius = 100F;
        Float grauEmKelvin;

        // when
        grauEmKelvin = conversor
                .converter(grauEmCelcius)
                .de(TemperaturaEnum.CELSIUS)
                .para(TemperaturaEnum.KELVIN)
                .calcular();

        // then
        Assert.assertTrue(grauEmKelvin != null);
        Assert.assertEquals(new Float(373.15), grauEmKelvin);
    }

    @Test
    public void converterDeCelciusParaFahrenheit() {

        // given
        Conversor conversor = new ConversorImpl();
        Float grauEmCelcius = 100F;
        Float grauEmFahrenheit;

        // when
        grauEmFahrenheit = conversor
                .converter(grauEmCelcius)
                .de(TemperaturaEnum.CELSIUS)
                .para(TemperaturaEnum.FAHRENHEIT)
                .calcular();

        // then
        Assert.assertNotNull(grauEmFahrenheit);
        Assert.assertEquals(new Float(212), grauEmFahrenheit);
    }

    @Test
    public void converterDeKelvinParaKelvin() {

        // given
        ConversorImpl conversor = new ConversorImpl();

        // when
        Float grauEmKelvin = conversor
                .converter(100F)
                .de(TemperaturaEnum.KELVIN)
                .para(TemperaturaEnum.KELVIN)
                .calcular();

        // then
        Assert.assertEquals(new Float(100), grauEmKelvin);

    }

    @Test
    public void converterDeKelvinParaCelcius() {

        // given
        ConversorImpl conversor = new ConversorImpl();

        // when
        Float grauEmCelsius = conversor
                .converter(100F)
                .de(TemperaturaEnum.KELVIN)
                .para(TemperaturaEnum.CELSIUS)
                .calcular();

        // then
        Assert.assertEquals(new Float(-173.15), grauEmCelsius);

    }

    @Test
    public void converterDeKelvinParaFahrenheit() {

        // given
        ConversorImpl conversor = new ConversorImpl();

        // when
        Float grauEmFahreinheit = conversor
                .converter(100F)
                .de(TemperaturaEnum.KELVIN)
                .para(TemperaturaEnum.FAHRENHEIT)
                .calcular();

        // then
        Assert.assertEquals(new Float(-279.67), grauEmFahreinheit);

    }

    @Test
    public void converterDeFahrenheitParaFahrenheit() {

        // given
        Conversor conversor = new ConversorImpl();
        Float grauEmFahreinheit;

        // when
        grauEmFahreinheit = conversor
                .converter(100F)
                .de(TemperaturaEnum.FAHRENHEIT)
                .para(TemperaturaEnum.FAHRENHEIT)
                .calcular();

        // then
        Assert.assertNotNull(grauEmFahreinheit);
        Assert.assertEquals(new Float(100), grauEmFahreinheit);
    }

    @Test
    public void converterDeFarenheitParaKelvin() {

        // given
        Conversor conversor = new ConversorImpl();
        Float grauEmKelvin;

        // when
        grauEmKelvin = conversor
                .converter(100F)
                .de(TemperaturaEnum.FAHRENHEIT)
                .para(TemperaturaEnum.KELVIN)
                .calcular();

        // then
        Assert.assertNotNull(grauEmKelvin);
        Assert.assertEquals(new Float(310.93), grauEmKelvin);
    }

    @Test
    public void converterDeFahrenheitParaCelcius() {

        // given
        Conversor conversor = new ConversorImpl();
        Float grauEmCelsius;

        // when
        grauEmCelsius = conversor
                .converter(100F)
                .de(TemperaturaEnum.FAHRENHEIT)
                .para(TemperaturaEnum.CELSIUS)
                .calcular();

        // then
        Assert.assertNotNull(grauEmCelsius);
        Assert.assertEquals(new Float(37.78), grauEmCelsius);

    }
}