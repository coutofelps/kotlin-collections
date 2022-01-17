fun testMap() {
    // Criando um pedido (id do pedido e valor do pedido). A síntaxe utilizando to é uma outra forma de criar um atributo pair
    val orders: MutableMap<Int, Double> = mutableMapOf<Int, Double>(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    println(orders.toString())

    val order = orders[3]

    order.let {
        println("Pedido ${it}")
    }

    for(order: Map.Entry<Int, Double> in orders) {
        println("Número do pedido: ${order.key}")
        println("Valor do pedido: ${order.value}")
    }

    // Modificando o valor do primeiro pedido
    orders[1] = 70.0
    println(orders)

    // Adicionando um novo pedido
    orders.put(5, 80.8)
    println(orders)

    // Adicionando um novo pedido caso ele não exista
    orders.putIfAbsent(6, 300.0)
    println(orders)

    // Removendo o último pedido
    orders.remove(6)
    println(orders)
}