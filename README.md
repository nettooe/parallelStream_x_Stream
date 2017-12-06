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

quantidade	parallelStream	Stream
100	355	140
200	112	215
300	159	307
400	147	457
500	206	264
600	144	304
700	168	392
800	210	428
900	220	470
1000	267	525
1100	287	628
1200	292	953
1300	511	1068
1400	591	1192
1500	416	910
1600	494	994
1700	461	1203
1800	703	1487
1900	827	1298
2000	560	1279
2100	573	1618
2200	876	1926
2300	754	1365
2400	654	1517
2500	776	1317
2600	622	1651
2700	664	1392
2800	697	1615
2900	801	1551
3000	826	2573
3100	1533	2027
3200	988	2606
3300	1503	2260
3400	1034	2062
3500	966	1795
3600	1042	2162
3700	1110	3333
3800	1743	3177
3900	1251	2561
4000	1609	3276
4100	1518	3083
4200	1821	2901
4300	1334	2421
4400	1185	2529
4500	1321	2785
4600	1231	2714
4700	1403	3829
4800	2140	3895
4900	1441	3499
5000	2083	2992
5100	1630	4337
5200	1494	3054
5300	2221	3881
5400	1589	3032
5500	2373	3962
5600	1632	4538
5700	1701	4163
5800	2159	3645
5900	2160	3729
6000	2226	4066
6100	3061	4973
6200	2181	3702
6300	1769	4230
6400	1654	3668
6500	1927	5945
6600	2679	4134
6700	2979	4618
6800	2940	4612
6900	3372	4563
7000	3183	5075
7100	2918	5319
7200	3053	4852
7300	3086	5022
7400	3676	4867
7500	1933	3875
7600	1870	6735
7700	2503	5556
7800	2506	4624
7900	3580	4220
8000	3627	4125
