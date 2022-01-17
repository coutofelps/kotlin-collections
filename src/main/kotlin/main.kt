fun main() {
    println("Hello world!")

    val orders = listOf(
        Order(1, 20.0),
        Order(2, 60.0),
        Order(3, 30.0),
        Order(4, 70.0),
        Order(5, 40.0)
    )

    println(orders.toString())

    // Maneira resumida para devolver o próprio valor percorrido durante a operação
    val mappedOrders: Map<Int, Order> = orders.associateBy { order ->
        order.number
    }

    println(mappedOrders)

    // Verificando se os pedidos têm direito ao frete grátis (apenas para valores maiores que 50)
    val freeShipOrders = orders.associateWith { order ->
        order.value > 50
    }

    println(freeShipOrders)

    // Solicitando retorno apenas dos pedidos com frete grátis, agrupando-os em uma coleção
    val freeShipOrdersOnlyList = orders.groupBy { order: Order ->
        order.value > 50.0
    }

    println(freeShipOrdersOnlyList)

    // Criando uma lista com nomes de pessoas
    val names = listOf<String>("Fernanda", "Laura", "Mari", "Valentina")

    // Criando uma lista de amigos
    val friendsList: Map<Char, List<String>> = names.groupBy { name ->
        name.first()
    }

    // Exibindo lista de amigos
    println(friendsList)

    // Exibindo amigos que a letra inicial de seu nome é 'M'
    println(friendsList['M'])
}

data class Order(val number: Int, val value: Double)