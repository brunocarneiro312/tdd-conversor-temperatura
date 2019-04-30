# Conversor de temperaturas
### Simples conversor de temperaturas utilizando a abordagem de desenvolvimento TDD.
#### Converte:
- [x] Celsius para Fahreinheit
- [x] Celsius para Kelvin
- [x] Kelvin para Celsius
- [x] Kelvin para Fahreinheit
- [x] Fahreinheit para Celsius
- [x] Fahreinheit para Kelvin

#### O método de conversão utiliza uma forma fluente:

```
grauEmCelsius = conversor
        .converter(100F) // ...................... Converter 100
        .de(TemperaturaEnum.FAHRENHEIT) // ....... graus FAHRENHEIT
        .para(TemperaturaEnum.CELSIUS) // ........ para CELSIUS
        .calcular(); // .......................... Calcula e obtém o resultado em Float.
```