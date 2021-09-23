package com.mysiga.kotlin.proxy.pattern

/**
 * 外观模式
 * @property fileReader FileReader
 * @property fileWriter FileWriter
 * @property cipherMachine CipherMachine
 */
class EncryptFacade() {
    val fileReader by lazy {
        FileReader()
    }
    val fileWriter by lazy {
        FileWriter()
    }
    val cipherMachine by lazy {
        CipherMachine()
    }

    fun fileEncrypt(fileName: String, encrypteText: String) {
        fileReader.read(fileName)
        fileWriter.writer(encrypteText, fileName)
        cipherMachine.encrypter(encrypteText)
    }
}

class FileReader {
    fun read(fileName: String): String {
        println("read")
        return "FieReader:$fileName"
    }
}

class FileWriter {
    fun writer(encrypteText: String, fileName: String) {
        println("writer")
    }
}

class CipherMachine {
    fun encrypter(painText: String) {
        println("encrypter")
    }
}

fun main(args: Array<String>) {
    val encryptFacade = EncryptFacade()
    encryptFacade.fileEncrypt("english.text", "encrypteText")
}