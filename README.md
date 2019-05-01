<p>
<img src="https://i2.wp.com/techpursue.com/wp-content/uploads/2016/10/java-logo-vector-200x200-1.png?ssl=1">
<img src="https://www.opencodez.com/wp-content/uploads/2019/04/Junit-1.png">
<img src="https://librariesio.github.io/pictogram/maven/maven.png">
</p>

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

<small>[Clique aqui para visualizar meu currículo](https://brunocarneiro312.github.io)</small>