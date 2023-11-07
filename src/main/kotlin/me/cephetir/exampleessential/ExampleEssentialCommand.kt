package me.cephetir.exampleessential

import gg.essential.api.commands.Command
import gg.essential.api.commands.DefaultHandler
import gg.essential.api.commands.SubCommand

object ExampleEssentialCommand : Command("exampleessential") {
    override val commandAliases = setOf(Alias("ee"))

    @DefaultHandler
    fun handle() {

    }

    @SubCommand("sub")
    fun sub() {

    }
}