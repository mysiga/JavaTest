package com.mysiga.kotlin.pattern

interface Logger {
    fun writeLog()
}

class FileLogger : Logger {
    override fun writeLog() {
        println("FileLogger#writeLog")
    }
}

class DatabaseLogger : Logger {
    override fun writeLog() {
        println("DatabaseLogger#writeLog")
    }
}

interface LoggerFactory {
    fun createLogger(): Logger
}

class FileLoggerFactory : LoggerFactory {
    override fun createLogger(): Logger {
        return FileLogger()
    }
}

class DatabaseLoggerFactory : LoggerFactory {
    override fun createLogger(): Logger {
        return DatabaseLogger()
    }
}

fun main(args: Array<String>) {
    val loggerFactory= FileLoggerFactory()
    val logger=loggerFactory.createLogger()
    logger.writeLog()
}