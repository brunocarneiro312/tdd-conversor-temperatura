package br.com.service;

import br.com.enumeration.TemperaturaEnum;
import br.com.exceptions.ErroDeConversaoException;

public interface Conversor {

    Conversor converter(Float grau);

    Conversor de(TemperaturaEnum escalaOrigem);

    Conversor para(TemperaturaEnum escalaDestino);

    Float calcular() throws ErroDeConversaoException;

}
