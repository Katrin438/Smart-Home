package com.example.smarthome

class BulbManager {

    val bulbs: MutableList<FakeBulbData> = mutableListOf()

    fun addBulb(name: String, model: String, address: String){
        val temp = FakeBulbData(name, model, address)
        bulbs.add(temp);
    }

    fun removeBulb(bulb: FakeBulbData){
        try{
            if(bulb != null){
                if(bulbs.contains(bulb)){
                    bulbs.remove(bulb)
                }
            }
        }
        catch(e: NoSuchFieldError){

        }finally {
            println("Something went wrong when adding new bulb")
        }

    }

    fun getBulbByName(name: String): FakeBulbData? {
        try{
            if(name != null){
                val returnBulb = bulbs.find{it.name == name}
                return returnBulb;
            }
        }catch (e: NoSuchFieldException){

        }finally {
            println("Something went wrong when searching for bulb name")
            return null;
        }
    }
    fun getBulbByAddress(address: String): FakeBulbData? {
        try{
            if(address != null){
                val returnBulb = bulbs.find{it.address == address}
                return returnBulb;
            }
        }catch (e: NoSuchFieldException){

        }finally {
            println("Something went wrong when searching for bulb name")
            return null;
        }
    }
}