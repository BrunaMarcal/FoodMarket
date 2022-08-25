package com.example.foodmarket.dao

import com.example.foodmarket.model.Produto

class ProdutosDao {

    fun adiciona(produto: Produto){
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto>{
        return Companion.produtos.toList()

    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}