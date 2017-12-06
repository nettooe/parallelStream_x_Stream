# parallelStream_x_Stream
Apresenta um teste de performance que compara parallelstream e stream do Java 8.

## Qual a diferença?
o a diferenca entrea parallelStream e stream  que o primeiro utiliza recursos de Threads ao percorrer uma lista e o segundo é sequencial. Com isto a diferença de desempenho tende a aumentar conforme a quantidades de processadores (cores) disponíveis para a JVM.

### Instalando e executando
Para instalar e executar o projeto localmente, basta [clonar o projeto](https://help.github.com/articles/cloning-a-repository/) e executar. Para isto, abra o terminal no seu Linux e execute os comandos:
```
$ git clone git@github.com:nettooe/parallelStream_x_Stream.git
$ cd parallelStream_x_Stream
$ javac *.java
$ jar cfm Main.jar manifest.txt *.class
$ java -jar Main.jar
```

Ao final desta execução, serão apresentados resultados de processamento semelhantes aos apresentados abaixo. No meu caso, utilizei o processador Intel Core i5-2430M (2.4GHz)

<img width="600" height="371" seamless frameborder="0" scrolling="no" src="https://docs.google.com/spreadsheets/d/e/2PACX-1vRHhUvRFq-x3s0Os5MKOPEZvbBRQKqPE9-X5B8i3QIWaBCR9x5B7iZTjuJf9k6EPeOb4Ppva4lCIaY0/pubchart?oid=24450175&amp;format=image"></img>

Dados:

quantidade    parallelStream    Stream<br/>
100    355    140<br/>
200    112    215<br/>
300    159    307<br/>
400    147    457<br/>
500    206    264<br/>
600    144    304<br/>
700    168    392<br/>
800    210    428<br/>
900    220    470<br/>
1000    267    525<br/>
1100    287    628<br/>
1200    292    953<br/>
1300    511    1068<br/>
1400    591    1192<br/>
1500    416    910<br/>
1600    494    994<br/>
1700    461    1203<br/>
1800    703    1487<br/>
1900    827    1298<br/>
2000    560    1279<br/>
2100    573    1618<br/>
2200    876    1926<br/>
2300    754    1365<br/>
2400    654    1517<br/>
2500    776    1317<br/>
2600    622    1651<br/>
2700    664    1392<br/>
2800    697    1615<br/>
2900    801    1551<br/>
3000    826    2573<br/>
3100    1533    2027<br/>
3200    988    2606<br/>
3300    1503    2260<br/>
3400    1034    2062<br/>
3500    966    1795<br/>
3600    1042    2162<br/>
3700    1110    3333<br/>
3800    1743    3177<br/>
3900    1251    2561<br/>
4000    1609    3276<br/>
4100    1518    3083<br/>
4200    1821    2901<br/>
4300    1334    2421<br/>
4400    1185    2529<br/>
4500    1321    2785<br/>
4600    1231    2714<br/>
4700    1403    3829<br/>
4800    2140    3895<br/>
4900    1441    3499<br/>
5000    2083    2992<br/>
5100    1630    4337<br/>
5200    1494    3054<br/>
5300    2221    3881<br/>
5400    1589    3032<br/>
5500    2373    3962<br/>
5600    1632    4538<br/>
5700    1701    4163<br/>
5800    2159    3645<br/>
5900    2160    3729<br/>
6000    2226    4066<br/>
6100    3061    4973<br/>
6200    2181    3702<br/>
6300    1769    4230<br/>
6400    1654    3668<br/>
6500    1927    5945<br/>
6600    2679    4134<br/>
6700    2979    4618<br/>
6800    2940    4612<br/>
6900    3372    4563<br/>
7000    3183    5075<br/>
7100    2918    5319<br/>
7200    3053    4852<br/>
7300    3086    5022<br/>
7400    3676    4867<br/>
7500    1933    3875<br/>
7600    1870    6735<br/>
7700    2503    5556<br/>
7800    2506    4624<br/>
7900    3580    4220<br/>
8000    3627    4125<br/>


