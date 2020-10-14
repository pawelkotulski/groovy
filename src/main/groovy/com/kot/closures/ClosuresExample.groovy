package com.kot.closures;

class ClosuresExample {
    static void main(String[] a) {
        def closure = {parameter -> println(parameter)}
        closure.call("asdf")
        closuraMethod({parameter -> println("CLOSURE ")})

        def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
        mp.each {}
        mp.each {println it}
        mp.each {println "${it.key} maps to: ${it.value}"}
    }

    static closuraMethod(clo) {
        clo.call()
    }
}
