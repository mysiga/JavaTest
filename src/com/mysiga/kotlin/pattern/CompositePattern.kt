package com.mysiga.kotlin.pattern

/**
 * 组合模式
 */
interface AbstractFile {
    fun add(abstractFile: AbstractFile)
    fun remove(abstractFile: AbstractFile)
    fun getChild(index: Int): AbstractFile?
    fun killVirus()
}

class ImageFile(var name: String) : AbstractFile {
    override fun add(abstractFile: AbstractFile) {
        println("对不起，不支持这个方法")
    }

    override fun remove(abstractFile: AbstractFile) {
        println("对不起，不支持这个方法")
    }

    override fun getChild(index: Int): AbstractFile? {
        println("对不起，不支持这个方法")
        return null
    }

    override fun killVirus() {
        println("对文件$name 杀毒")
    }
}

class VideoFile(var name: String) : AbstractFile {
    override fun add(abstractFile: AbstractFile) {
        println("对不起，不支持这个方法")

    }

    override fun remove(abstractFile: AbstractFile) {
        println("对不起，不支持这个方法")
    }

    override fun getChild(index: Int): AbstractFile? {
        println("对不起，不支持这个方法")
        return null
    }

    override fun killVirus() {
        println("对文件$name 杀毒")
    }
}

class TextFile(var name: String) : AbstractFile {
    override fun add(abstractFile: AbstractFile) {
        println("对不起，不支持这个方法")

    }

    override fun remove(abstractFile: AbstractFile) {
        println("对不起，不支持这个方法")
    }

    override fun getChild(index: Int): AbstractFile? {
        println("对不起，不支持这个方法")
        return null
    }

    override fun killVirus() {
        println("对文件$name 杀毒")
    }
}

class Folder(var name: String) : AbstractFile {
    private val fileList = mutableListOf<AbstractFile>()
    override fun add(abstractFile: AbstractFile) {
        fileList.add(abstractFile)
    }

    override fun remove(abstractFile: AbstractFile) {
        fileList.remove(abstractFile)
    }

    override fun getChild(index: Int): AbstractFile {
        return fileList[index]
    }

    override fun killVirus() {
        println("对文件夹$name 杀毒")
        for (abstractFile in fileList) {
            abstractFile.killVirus()
        }

    }
}

fun main(args: Array<String>) {
    val folder= Folder("系统文件")
    val imageFile= ImageFile("imageFile")
    val textFile= TextFile("textFile")
    val videoFile= VideoFile("videoFile")

    folder.add(imageFile)
    folder.add(textFile)
    folder.add(videoFile)

    val folder1= Folder("我的文件")
    val imageFile1= ImageFile("imageFile1")
    folder1.add(imageFile1)
    folder.add(folder1)

    folder.killVirus()
}