package br.com.service;

import br.com.enumeration.TemperaturaEnum;

public interface Conversor {

    Conversor converter(Float grau);

    Conversor de(TemperaturaEnum escalaOrigem);

    Conversor para(TemperaturaEnum escalaDestino);

    Float calcular();

}
