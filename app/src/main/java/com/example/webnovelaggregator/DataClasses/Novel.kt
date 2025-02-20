package com.example.webnovelaggregator.DataClasses

class Novel(val novelName:String,val novelID:String,val authorName:String,val novelDescr:String,val inLibrary:Boolean) {
    val chapters = mutableListOf<NovelChapter>()
    public fun add_chapter(chapter:NovelChapter){
        chapters.add(chapter)
    }
    public fun get_chapter(index:Int):NovelChapter{
        return chapters[index]
    }
    public fun get_chapter(name:String):NovelChapter?{

        for(chapter in chapters) {
            if (chapter.chapterName == name) {
                return chapter
            }
        }
        return null
    }
}