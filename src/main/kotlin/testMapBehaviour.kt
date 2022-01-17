fun testMapBehaviour() {
    val orders: MutableMap<Int, Double> = mutableMapOf<Int, Double>(Pair(1, 20.0), Pair(2, 64.0), 3 to 50.0, 4 to 100.00, 5 to 100.0, 6 to 80.0)

    // Testando se o index passado existe, caso não exista, a mensagem dentro do a função getOrElse é mostrado
    println(orders.getOrElse(0) {
        "Este pedido não existe."
    })

    // Selecionando o valor passado no index, caso não exista, o valor padrão será igual a -1
    println(orders.getOrDefault(0, -1))

    // Exibindo todas as chaves
    println(orders.keys)

    // Exibindo todos os valores
    println(orders.values)

    for(orderNumber in orders.keys) {
        println("Número do pedido: ${orderNumber}")
    }

    for(orderValue in orders.values) {
        println("Número do pedido: ${orderValue}")
    }

    // Exibindo pedidos com valor par e maior que 50
    val filteredOrders = orders.filter { (key, value) ->
        key % 2 == 0 && value > 50.0
    }

    println(filteredOrders)

    // Filtrando pedidos por valor maior que 50
    val ordersUpperThan50 = orders.filterValues { value ->
        value > 50.0
    }

    println(ordersUpperThan50)

    // Filtrando pedidos por valores pares
    val pairOrders = orders.filterKeys { key ->
        key % 2 == 0
    }

    println(pairOrders)

    // Adicionando um novo pedido na lista já criada
    println(orders + mapOf(Pair(7, 90)))

    // Removendo da lista pelo atributo key
    println(orders - listOf(5, 6))

    // Adicionando novos pedidos sobrescrevendo os indíces já existentes
    println(orders.putAll(listOf(Pair(7, 90.0), 8 to 20.0, 8 to 30.0)))

    // Maneira alternativa de realizar a mesma ação acima
    orders += listOf(Pair(7, 90.0), 8 to 20.0, 8 to 30.0)

    // Removendo uma chave
    orders.keys.remove(1)
    println(orders)

    // Removendo um valor
    orders.values.remove(50.0)
    println(orders)

    // Removendo um valor (em caso de encontrar um mesmo valor, apenas o primeiro índice e valor serão removidos)
    orders.values.remove(100.0)
    println(orders)

    // Removendo o pedido de chave 6
    orders -= 6
    println(orders)
}