# Projeto de Veículos em Java

Este projeto é uma simulação simples de veículos em Java, demonstrando o uso de herança e polimorfismo. Ele implementa uma classe base `Veiculo` e várias classes derivadas, cada uma representando um tipo de veículo: `Carro`, `Moto`, `Caminhao`, e `Onibus`. Cada classe derivada possui atributos e comportamentos específicos, como o método `mover()` personalizado para cada tipo de veículo.

## Funcionalidades

- **Classe Base:**
  - `Veiculo`: contém os atributos `marca`, `modelo`, `ano` e métodos `exibirDetalhes()` e `mover()`.

- **Classes Derivadas:**
  - `Carro`: herda de `Veiculo` e adiciona o atributo `quantidadeDePortas`.
  - `Moto`: herda de `Veiculo` e adiciona o atributo `cilindradas`.
  - `Caminhao`: herda de `Veiculo` e adiciona o atributo `capacidadeDeCarga`.
  - `Onibus`: herda de `Veiculo` e adiciona o atributo `numeroDeAssentos`.

- **Métodos Sobrescritos:**
  - Cada classe derivada sobrescreve o método `mover()`, exibindo uma mensagem específica sobre como o veículo se move.
