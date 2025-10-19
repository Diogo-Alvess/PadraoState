Este repositório apresenta a implementação do padrão de projeto State em um cenário de gestão de pedidos de entrega.
O sistema simula as mudanças de estado de um pedido, como Criado, Em Preparo, Em Transporte, Entregue e Cancelado, permitindo a transição controlada entre eles.

A classe principal Pedido mantém uma referência ao objeto do tipo PedidoEstado, que representa o estado atual do pedido. Cada estado concreto (como PedidoEstadoCriado, PedidoEstadoEmPreparo, etc.) implementa o comportamento específico para as ações avancar() e cancelar(), de acordo com a fase do pedido.

Essa abordagem elimina o uso excessivo de condicionais (if e switch) para controlar o fluxo dos estados, tornando o código mais organizado, flexível e de fácil manutenção.

Através dos métodos avancar() e cancelar(), o objeto Pedido delega a responsabilidade das mudanças de comportamento para o estado atual, demonstrando o princípio de encapsulamento de variação de comportamento que caracteriza o padrão State.
