package com.example.smarthome

class FakeBulbData constructor(name: String, model: String, address: String) {
    val name = name;
    val model = model;
    val address = address;

    override fun toString(): String {
        return super.toString()
    }
}